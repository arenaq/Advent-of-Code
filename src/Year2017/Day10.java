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
        // part 2
        input = "106,118,236,1,130,0,235,254,59,205,2,87,129,25,255,118";
        for (int i = 0; i < 256; i++) {
            list[i] = i;
        }
        currentPosition = 0;
        skipSize = 0;
        int[] sequences = {17, 31, 73, 47, 23};
        int[] lengths = new int[input.length() + sequences.length];
        for (int j = 0; j < lengths.length; j++) {
            if (j < input.length()) {
                lengths[j] = (int) input.charAt(j);
            } else {
                lengths[j] = sequences[j - input.length()];
            }
        }
        for (int round = 0; round < 64; round++) {
            for (int j = 0; j < lengths.length; j++) {
                int length = lengths[j];
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
        }
        // calculating dense hash
        int[] denseHash = new int[list.length / 16];
        for (int i = 0; i < denseHash.length; i++) {
            for (int j = 0; j < 16; j++) {
                denseHash[i] ^= list[i * 16 + j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < denseHash.length; j++) {
            sb.append(String.format("%02x", denseHash[j]));
        }
        System.out.println(sb.toString());
        sb = new StringBuilder();
    }
}
