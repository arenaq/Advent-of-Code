package Year2020;

import java.util.Set;
import java.util.TreeSet;

public class Day10 {
    static String input = "111,56,160,128,25,182,131,174,87,52,23,30,93,157,36,155,183,167,130,50,71,98,42,129,18,13,99,146,81,184,1,51,137,8,9,43,115,121,171,77,97,149,83,89,2,38,139,152,29,180,10,165,114,75,82,104,108,156,96,150,105,44,100,69,72,143,32,172,84,161,118,47,17,177,7,61,4,103,66,76,138,53,88,122,22,123,37,90,134,41,64,127,166,173,168,58,26,24,33,151,57,181,31,124,140,3,19,16,80,164,70,65";

    public static void main(String[] args) {
        String[] array = input.split(",");
        Set<Integer> adapters = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            adapters.add(Integer.valueOf(array[i]));
        }
        int diff1 = 0;
        int diff3 = 0;
        int last = 0;
        while (!adapters.isEmpty()) {
            int min = getMin(adapters);
            if (min - last == 1) diff1++;
            if (min - last == 3) diff3++;
            last = min;
            adapters.remove(min);
        }
        diff3++;
        System.out.println(diff1 * diff3);
    }

    static int getMin(Set<Integer> set) {
        int min = Integer.MAX_VALUE;
        for (Integer number : set) {
            if (number < min) min = number;
        }
        return min;
    }
}
