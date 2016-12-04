package Year2015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Petr Kuška
 */
public class Day2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, "x");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int ab = a*b;
            int ac = a*c;
            int bc = b*c;
            sum += 2*ab + 2*bc + 2*ac;
            if (ab < bc && ab < ac) {
                sum += ab;
            } else if (bc < ac) {
                sum += bc;
            } else {
                sum += ac;
            }
        }
        System.out.println(sum);
    }
    
}
