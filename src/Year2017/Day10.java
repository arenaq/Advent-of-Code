package Year2017;

import java.util.StringTokenizer;

/**
 * Created by arenaq on 10.12.2017.
 */
public class Day10 {
    public static void main(String[] args) {
        String input = "106,118,236,1,130,0,235,254,59,205,2,87,129,25,255,118";
        int[] list = new int[256];
        for (int i = 0; i < 256; i++) {
            list[i] = i;
        }
        int currentPosition = 0;
        int skipSize = 0;
        StringTokenizer st = new StringTokenizer(input, ",");
        while (st.hasMoreTokens()) {
            int length = Integer.parseInt(st.nextToken());
            // reverse
            for (int i = currentPosition; i < currentPosition + (length / 2); i++) {
                int a = i % 256;
                int b = ((currentPosition + length - 1) - (i - currentPosition)) % 256;
                int tmp = list[a];
                list[a] = list[b];
                list[b] = tmp;
            }
            currentPosition += (length + skipSize) % 256;
            skipSize++;
        }
        System.out.println(list[0] * list[1]);
    }
}
