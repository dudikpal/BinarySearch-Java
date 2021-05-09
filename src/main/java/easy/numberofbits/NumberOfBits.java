package easy.numberofbits;

import java.util.BitSet;

public class NumberOfBits {

    public int solve(int n) {

        BitSet bs = BitSet.valueOf(new long[]{n});

        System.out.println(bs);
        System.out.println(bs.cardinality());
        bs.stream().forEach(System.out::println);
        return bs.cardinality();
    }
}
