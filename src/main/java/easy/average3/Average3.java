package easy.average3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average3 {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double average = (2 * n1 + 3 * n2 + 4 * n3 + n4) / 10;
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat(".0");
        sb.append("Media: ").append(df.format(average)).append("\n");
        System.out.printf("Media: %s\n", df.format(average));

        if (average >= 7) {

            sb.append("Aluno aprovado.\n");
            System.out.println("Aluno aprovado.");
        } else if (average >= 5 && average < 7) {

            sb.append("Aluno em exame.\n");
            System.out.println("Aluno em exame.");
            sc.nextLine();
            double examScore = sc.nextDouble();
            sb.append("Nota do exame: ").append(df.format(examScore)).append("\n");
            System.out.printf("Nota do exame: %s\n", df.format(examScore));
            sb = examCalculator(sb, examScore, average, df);
        } else {

            sb.append("Aluno reprovado.\n");
            System.out.println("Aluno reprovado.");
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    private static StringBuilder examCalculator(StringBuilder sb, double examScore, double avgScore, DecimalFormat df) {

        double recalculatedScore = (examScore + avgScore) / 2;

        if (recalculatedScore < 5) {
            sb.append("Aluno reprovado\n");
            System.out.println("Aluno reprovado");
        } else {
            sb.append("Aluno aprovado.\n");
            System.out.println("Aluno aprovado.");
        }

        sb.append("Media final: ").append(df.format(recalculatedScore)).append("\n");
        System.out.printf("Media final: %s\n", df.format(recalculatedScore));
        return sb;
    }
}
