package Year2017;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by arenaq on 07.12.2017.
 */
public class Day6 {
    static String aIntToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) sb.append(" ");
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "10\t3\t15\t10\t5\t15\t5\t15\t9\t2\t5\t8\t5\t2\t3\t6";
        StringTokenizer st = new StringTokenizer(input, "\t");
        int[] memory = new int[st.countTokens()];
        for (int i = 0; i < memory.length; i++) {
            memory[i] = Integer.parseInt(st.nextToken());
        }
        HashMap<String, Boolean> map = new HashMap<>();
        int result = 0;
        while (map.get(aIntToString(memory)) == null) {
            map.put(aIntToString(memory), true);
            int max = Integer.MIN_VALUE;
            int max_index = 0;
            for (int i = 0; i < memory.length; i++) {
                if (memory[i] > max) {
                    max = memory[i];
                    max_index = i;
                }
            }
            memory[max_index] = 0;
            int i = max_index + 1;
            while (max-- > 0) {
                if (i == memory.length) i = 0;
                memory[i++]++;
            }
            result++;
        }
        System.out.println(result);
    }
}
