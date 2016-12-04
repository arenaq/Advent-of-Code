package Year2015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Petr Kuška
 */
public class Day6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] grid = new boolean[1000][1000];

        for (int i = 0; i < 300; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            if (st.nextToken().compareTo("turn") == 0) {
                if (st.nextToken().compareTo("on") == 0) {
                    // ON
                    int x1 = Integer.parseInt(st.nextToken(" ,"));
                    int y1 = Integer.parseInt(st.nextToken(" ,"));
                    st.nextToken();
                    int x2 = Integer.parseInt(st.nextToken(" ,"));
                    int y2 = Integer.parseInt(st.nextToken(" ,"));
                    for (int j = x1; j <= x2; j++) {
                        for (int k = y1; k <= y2; k++) {
                            grid[j][k] = true;
                        }
                    }
                } else {
                    // OFF
                    int x1 = Integer.parseInt(st.nextToken(" ,"));
                    int y1 = Integer.parseInt(st.nextToken(" ,"));
                    st.nextToken();
                    int x2 = Integer.parseInt(st.nextToken(" ,"));
                    int y2 = Integer.parseInt(st.nextToken(" ,"));
                    for (int j = x1; j <= x2; j++) {
                        for (int k = y1; k <= y2; k++) {
                            grid[j][k] = false;
                        }
                    }
                }
            } else {
                // TOGGLE
                int x1 = Integer.parseInt(st.nextToken(" ,"));
                int y1 = Integer.parseInt(st.nextToken(" ,"));
                st.nextToken();
                int x2 = Integer.parseInt(st.nextToken(" ,"));
                int y2 = Integer.parseInt(st.nextToken(" ,"));
                for (int j = x1; j <= x2; j++) {
                    for (int k = y1; k <= y2; k++) {
                        grid[j][k] = !grid[j][k];
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]) sum++;
            }
        }
        System.out.println(sum);
    }

}
