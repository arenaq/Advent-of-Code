package Year2015;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author Petr Kuška
 */
public class Day3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Point, Boolean> visited = new HashMap<>();
        String line = br.readLine();
        int x = 0, y = 0;
        visited.put(new Point(x, y), true);
        for (int i = 0; i < line.length(); i++) {
            switch (line.charAt(i)) {
                case '^': y++; break;
                case 'v': y--; break;
                case '>': x++; break;
                case '<': x--; break;
            }
            visited.put(new Point(x, y), true);
        }
        System.out.println(visited.size());
    }
    
}
