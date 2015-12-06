package advent;

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
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '(') left++;
            if (c == ')') right++;
        }
        System.out.println(left - right);
    }
    
}
