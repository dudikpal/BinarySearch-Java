package easy.average3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Average3Test {

    @Test
    void test() {
        String input = """
                2,0 4,0 7,5 8,0
                6,4""";
        String expected = """
                Media: 5,4
                Aluno em exame.
                Nota do exame: 6,4
                Aluno aprovado.
                Media final: 5,9
                """;
        assertEquals(expected, new Average3().solution(input));
    }

    @Test
    void test2() {
        String input = "2,0 6,5 4,0 9,0";
        String expected = """
                Media: 4,8
                Aluno reprovado.
                """;
        assertEquals(expected, new Average3().solution(input));
    }

    @Test
    void test3() {
        String input = "9,0 4,0 8,5 9,0";
        String expected = """
                Media: 7,3
                Aluno aprovado.
                """;
        assertEquals(expected, new Average3().solution(input));
    }

}