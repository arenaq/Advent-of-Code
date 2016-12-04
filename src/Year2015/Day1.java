package Year2015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Petr Kuška
 */
public class Day1 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int left = 0, right = 0;
        String line = in.readLine();
        boolean second_part = true;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '(') left++;
            if (c == ')') right++;
            if (second_part && left - right < 0) {
                System.out.println("Second part: "+i+1);
                second_part = false;
            }
        }
        System.out.println(left - right);
    }
    
}
