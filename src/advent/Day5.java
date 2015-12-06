package advent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Petr Kuška
 */
public class Day5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nice = 0;
        for (int i = 0; i < 1000; i++) {
            String line = br.readLine();
            int three_vowels = 0;
            boolean twice = false, not_contain = true;
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') three_vowels++;
                if (j != line.length()-1) {
                    if (c == line.charAt(j+1)) twice = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    sb.append(line.charAt(j+1));
                    if (sb.toString().compareTo("ab") == 0 || sb.toString().compareTo("cd") == 0 || sb.toString().compareTo("pq") == 0 || sb.toString().compareTo("xy") == 0) not_contain = false;
                }
            }
            if (three_vowels >= 3 && twice && not_contain) nice++;
        }
        System.out.println(nice);
    }
    
}
