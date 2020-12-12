package Year2020;

import java.util.Arrays;

public class Day10 {
    static String input = "111,56,160,128,25,182,131,174,87,52,23,30,93,157,36,155,183,167,130,50,71,98,42,129,18,13,99,146,81,184,1,51,137,8,9,43,115,121,171,77,97,149,83,89,2,38,139,152,29,180,10,165,114,75,82,104,108,156,96,150,105,44,100,69,72,143,32,172,84,161,118,47,17,177,7,61,4,103,66,76,138,53,88,122,22,123,37,90,134,41,64,127,166,173,168,58,26,24,33,151,57,181,31,124,140,3,19,16,80,164,70,65";
    static String input2 = "16,10,15,5,1,11,7,19,6,12,4";
    static String input3 = "28,33,18,42,31,14,46,20,48,47,24,23,49,45,19,38,39,11,1,32,25,35,8,17,7,9,4,2,34,10,3";

    public static void main(String[] args) {
        String[] array = input.split(",");
        int[] adapters = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            adapters[i] = Integer.valueOf(array[i]);
        }
        Arrays.sort(adapters);
        int diff1 = 0;
        int diff3 = 0;
        for (int i = 0; i < adapters.length - 1; i++) {
            int a = adapters[i];
            int b = adapters[i + 1];
            if (b - a == 1) diff1++;
            if (b - a == 3) diff3++;
        }
        if (adapters[0] == 1) diff1++;
        if (adapters[0] == 3) diff3++;
        System.out.println(diff1 * ++diff3);
        // part 2
        long part2 = 1;
        int oneChain = 0;
        if (adapters[0] == 1) oneChain++;
        for (int i = 0; i < adapters.length - 1; i++) {
            if (adapters[i + 1] - adapters[i] == 1) {
                oneChain++;
            } else {
                if (oneChain >= 2) part2 *= combinations(oneChain);
                oneChain = 0;
            }
        }
        if (oneChain >= 2) part2 *= combinations(oneChain);
        System.out.println(part2);
    }

    static long combinations(int budget) {
        if (budget == 0) return 1;
        int comb = 0;
        for (int i = 1; i <= 3; i++) {
            if (budget >= i) comb += combinations(budget - i);
        }
        return comb;
    }

    /**
     * (2) = 2

     1 2 3 4
     -
     1 2 3 4
     1 3 4
     1 2 4
     1 4
     (3) = 4 (1 + 2 + 1)

     1 2 3 4 5
     -
     1 2 3 4 5
     1 3 4 5
     1 2 4 5
     1 2 3 5
     1 4 5
     1 2 5
     1 3 5
     (4) = 7 (1 + 3 + 3)

     1 2 3 4 5 6
     -
     1 2 3 4 5 6
     1 3 4 5 6
     1 2 4 5 6
     1 2 3 5 6
     1 2 3 4 6
     1 4 5 6
     1 2 5 6
     1 2 3 6
     1 3 5 6
     1 3 4 6
     1 2 4 6
     1 4 6
     1 3 6
     (5) = 13 (1 + 4 + 6 + 2)

     1 2 3 4 5 6 7
     -
     1 2 3 4 5 6 7
     1 3 4 5 6 7
     1 2 4 5 6 7
     1 2 3 5 6 7
     1 2 3 4 6 7
     1 2 3 4 5 7
     1 4 5 6 7
     1 2 5 6 7
     1 2 3 6 7
     1 2 3 4 7
     1 3 5 6 7
     1 3 4 6 7
     1 3 4 5 7
     1 2 4 6 7
     1 2 4 5 7
     1 2 3 5 7
     1 4 6 7
     1 4 5 7
     1 2 5 7
     1 3 6 7
     1 3 4 7
     1 3 5 7
     1 2 4 7
     1 4 7
     (6) = 24 (1 + 5 + 10 + 7 + 1)
     */
}
