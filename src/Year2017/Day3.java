package Year2017;

/**
 * Created by arenaq on 03.12.2017.
 */
public class Day3 {
    public static void main(String[] args) {
        int input = 265149; // Michal - 347991
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
}
