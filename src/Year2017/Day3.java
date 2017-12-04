package Year2017;

import java.util.HashMap;
import java.util.stream.IntStream;

/**
 * Created by arenaq on 03.12.2017.
 */
public class Day3 {
    static void part1(int input) {
        int width = 1; // 1 3 5 7 9
        int volume = 0; // 1 9 25 49 81
        StringBuilder sb = new StringBuilder();
        while (volume < input) {
            volume = width * width;
            sb.append(volume).append(" ");
            width += 2;
        }
        width -= 2;
        System.out.println(sb.toString());
        System.out.println("Width: " + width);
        System.out.println("Volume: " + volume);
        System.out.println("Spaces left to new cycle: " + (volume - input));
        int max = (width - 1);
        System.out.println("Max steps: " + max);
        int min = (width / 2);
        System.out.println("Min steps: " + min);
        int BR = volume;
        int BL = BR - max;
        int TL = BL - max;
        int TR = TL - max;
        System.out.println("-------------------------");
        System.out.println(TL + "            " + TR);
        System.out.println("\n\n\n\n");
        System.out.println(BR + "            " + BL);
        System.out.println("-------------------------");
        System.out.println("Input: " + input);
        int difference = (volume - input);
        System.out.println("Difference: " + difference);
        System.out.println("Max steps: " + max);
        int relativeDifference = difference % max;
        System.out.println("Relative difference: " + relativeDifference);
        int result = max - relativeDifference;
        System.out.println("Result: " + result);
    }

    static HashMap<Integer, Integer> sums = new HashMap<>();

    static int a(int pos, int width, int volume) {
        int volumeDifference = volume - (width-2)*(width-2);
        return volumeDifference - 2 * ((volume - pos) / (width - 1));
    }

    static int b(int width) {
        return ((width-2)*(width-2) - (width-4)*(width-4));
    }

    static int getSum(int pos) {
        if (sums.get(pos) != null) return sums.get(pos);
        int width = 1;
        int volume = width * width;
        while (volume < pos) {
            width += 2;
            volume = width*width;
        }
        int[] corners = {volume - (width - 1), volume - 2*(width-1), volume - 3*(width-1)};
        int result;
        if (pos == volume) {
            // last corner
            result = getSum(pos - 1) +
                    getSum(pos - a(pos, width, volume)) +
                    getSum((width-2)*(width-2) + 1);
        } else if (pos == volume - 1) {
            // last corner - 1
            result = getSum(pos - 1) +
                    getSum(pos - (a(pos - 1, width, volume) - 1)) +
                    getSum(pos - a(pos - 1, width, volume)) +
                    getSum((width-2)*(width-2) + 1);
        } else if (IntStream.of(corners).anyMatch(x -> x == pos)) {
            // other corner
            result = getSum(pos - 1) +
                    getSum(pos - a(pos, width, volume));
        } else if (IntStream.of(corners).anyMatch(x -> x == pos + 1)) {
            // corner - 1
            result = getSum(pos - 1) +
                    getSum(pos - (a(pos - 1, width, volume) - 1)) +
                    getSum(pos - a(pos - 1, width, volume));
        } else if (IntStream.of(corners).anyMatch(x -> x == pos - 1)) {
            // corner + 1
            result = getSum(pos - 1) +
                    getSum(pos - 2) +
                    getSum(pos - (a(pos - 1, width, volume) + 1)) +
                    getSum(pos - a(pos - 1, width, volume));
        } else if (pos == (width-2)*(width-2) + 1) {
            // first in new circle
            result = getSum(pos - 1) +
                    getSum(pos - b(width));
        } else if (pos == (width-2)*(width-2) + 2) {
            // second in new circle
            result = getSum(pos - 1) +
                    getSum(pos - 2) +
                    getSum(pos - b(width)) +
                    getSum(pos - (b(width) + 1));
        } else {
            // others (between corners)
            result = getSum(pos - 1) +
                    getSum(pos - a(pos, width, volume)) +
                    getSum(pos - (a(pos, width, volume) - 1)) +
                    getSum(pos - (a(pos, width, volume) - 2));
        }
        sums.put(pos, result);
        return result;
    }

    public static void main(String[] args) {
        int input = 265149; // Michal - 347991
        //part1(input);
        sums.put(1, 1);
        sums.put(2, 1);
        sums.put(3, 2);
        sums.put(4, 4);
        sums.put(5, 5);
        sums.put(6, 10);
        sums.put(7, 11);
        sums.put(8, 23);
        sums.put(9, 25);
        sums.put(10, 26);
        sums.put(11, 54);
        sums.put(12, 57);
        sums.put(13, 59);
        sums.put(14, 122);
        sums.put(15, 133);
        sums.put(16, 142);
        sums.put(17, 147);
        sums.put(18, 304);
        sums.put(19, 330);
        sums.put(20, 351);
        sums.put(21, 362);
        sums.put(22, 747);
        sums.put(23, 806);
        int i = 1;
        while (getSum(i) < input) {
            i++;
        }
        System.out.println(getSum(i));
    }
}
