package Year2016;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.function.Consumer;

/**
 * Created by pkuska on 8.12.2016.
 */
public class Day8 {
    static String in = "rect 1x1\n" +
            "rotate row y=0 by 2\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 5\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 3\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 3\n" +
            "rect 2x1\n" +
            "rotate row y=0 by 5\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 5\n" +
            "rect 4x1\n" +
            "rotate row y=0 by 2\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 2\n" +
            "rect 1x1\n" +
            "rotate row y=0 by 5\n" +
            "rect 4x1\n" +
            "rotate row y=0 by 3\n" +
            "rect 2x1\n" +
            "rotate row y=0 by 5\n" +
            "rect 4x1\n" +
            "rotate row y=0 by 2\n" +
            "rect 1x2\n" +
            "rotate row y=1 by 6\n" +
            "rotate row y=0 by 2\n" +
            "rect 1x2\n" +
            "rotate column x=32 by 1\n" +
            "rotate column x=23 by 1\n" +
            "rotate column x=13 by 1\n" +
            "rotate row y=0 by 6\n" +
            "rotate column x=0 by 1\n" +
            "rect 5x1\n" +
            "rotate row y=0 by 2\n" +
            "rotate column x=30 by 1\n" +
            "rotate row y=1 by 20\n" +
            "rotate row y=0 by 18\n" +
            "rotate column x=13 by 1\n" +
            "rotate column x=10 by 1\n" +
            "rotate column x=7 by 1\n" +
            "rotate column x=2 by 1\n" +
            "rotate column x=0 by 1\n" +
            "rect 17x1\n" +
            "rotate column x=16 by 3\n" +
            "rotate row y=3 by 7\n" +
            "rotate row y=0 by 5\n" +
            "rotate column x=2 by 1\n" +
            "rotate column x=0 by 1\n" +
            "rect 4x1\n" +
            "rotate column x=28 by 1\n" +
            "rotate row y=1 by 24\n" +
            "rotate row y=0 by 21\n" +
            "rotate column x=19 by 1\n" +
            "rotate column x=17 by 1\n" +
            "rotate column x=16 by 1\n" +
            "rotate column x=14 by 1\n" +
            "rotate column x=12 by 2\n" +
            "rotate column x=11 by 1\n" +
            "rotate column x=9 by 1\n" +
            "rotate column x=8 by 1\n" +
            "rotate column x=7 by 1\n" +
            "rotate column x=6 by 1\n" +
            "rotate column x=4 by 1\n" +
            "rotate column x=2 by 1\n" +
            "rotate column x=0 by 1\n" +
            "rect 20x1\n" +
            "rotate column x=47 by 1\n" +
            "rotate column x=40 by 2\n" +
            "rotate column x=35 by 2\n" +
            "rotate column x=30 by 2\n" +
            "rotate column x=10 by 3\n" +
            "rotate column x=5 by 3\n" +
            "rotate row y=4 by 20\n" +
            "rotate row y=3 by 10\n" +
            "rotate row y=2 by 20\n" +
            "rotate row y=1 by 16\n" +
            "rotate row y=0 by 9\n" +
            "rotate column x=7 by 2\n" +
            "rotate column x=5 by 2\n" +
            "rotate column x=3 by 2\n" +
            "rotate column x=0 by 2\n" +
            "rect 9x2\n" +
            "rotate column x=22 by 2\n" +
            "rotate row y=3 by 40\n" +
            "rotate row y=1 by 20\n" +
            "rotate row y=0 by 20\n" +
            "rotate column x=18 by 1\n" +
            "rotate column x=17 by 2\n" +
            "rotate column x=16 by 1\n" +
            "rotate column x=15 by 2\n" +
            "rotate column x=13 by 1\n" +
            "rotate column x=12 by 1\n" +
            "rotate column x=11 by 1\n" +
            "rotate column x=10 by 1\n" +
            "rotate column x=8 by 3\n" +
            "rotate column x=7 by 1\n" +
            "rotate column x=6 by 1\n" +
            "rotate column x=5 by 1\n" +
            "rotate column x=3 by 1\n" +
            "rotate column x=2 by 1\n" +
            "rotate column x=1 by 1\n" +
            "rotate column x=0 by 1\n" +
            "rect 19x1\n" +
            "rotate column x=44 by 2\n" +
            "rotate column x=40 by 3\n" +
            "rotate column x=29 by 1\n" +
            "rotate column x=27 by 2\n" +
            "rotate column x=25 by 5\n" +
            "rotate column x=24 by 2\n" +
            "rotate column x=22 by 2\n" +
            "rotate column x=20 by 5\n" +
            "rotate column x=14 by 3\n" +
            "rotate column x=12 by 2\n" +
            "rotate column x=10 by 4\n" +
            "rotate column x=9 by 3\n" +
            "rotate column x=7 by 3\n" +
            "rotate column x=3 by 5\n" +
            "rotate column x=2 by 2\n" +
            "rotate row y=5 by 10\n" +
            "rotate row y=4 by 8\n" +
            "rotate row y=3 by 8\n" +
            "rotate row y=2 by 48\n" +
            "rotate row y=1 by 47\n" +
            "rotate row y=0 by 40\n" +
            "rotate column x=47 by 5\n" +
            "rotate column x=46 by 5\n" +
            "rotate column x=45 by 4\n" +
            "rotate column x=43 by 2\n" +
            "rotate column x=42 by 3\n" +
            "rotate column x=41 by 2\n" +
            "rotate column x=38 by 5\n" +
            "rotate column x=37 by 5\n" +
            "rotate column x=36 by 5\n" +
            "rotate column x=33 by 1\n" +
            "rotate column x=28 by 1\n" +
            "rotate column x=27 by 5\n" +
            "rotate column x=26 by 5\n" +
            "rotate column x=25 by 1\n" +
            "rotate column x=23 by 5\n" +
            "rotate column x=22 by 1\n" +
            "rotate column x=21 by 2\n" +
            "rotate column x=18 by 1\n" +
            "rotate column x=17 by 3\n" +
            "rotate column x=12 by 2\n" +
            "rotate column x=11 by 2\n" +
            "rotate column x=7 by 5\n" +
            "rotate column x=6 by 5\n" +
            "rotate column x=5 by 4\n" +
            "rotate column x=3 by 5\n" +
            "rotate column x=2 by 5\n" +
            "rotate column x=1 by 3\n" +
            "rotate column x=0 by 4";
    static boolean[][] screen = new boolean[6][50];

    private static void rect(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                screen[j][i] = true;
            }
        }
    }

    private static void rotateColumn(int x, int b) {
        boolean[] column = new boolean[screen.length];
        for (int i = 0; i < column.length; i++) {
            column[(i + b) % column.length] = screen[i][x];
        }
        for (int i = 0; i < column.length; i++) {
            screen[i][x] = column[i];
        }
    }

    private static void rotateRow(int y, int b) {
        boolean[] row = new boolean[screen[0].length];
        for (int i = 0; i < row.length; i++) {
            row[(i + b) % row.length] = screen[y][i];
        }
        for (int i = 0; i < row.length; i++) {
            screen[y][i] = row[i];
        }
    }

    static void print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[0].length; j++) {
                sb.append(screen[i][j] ? "#" : ".");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    static void parseLine(String line) {
        StringTokenizer st = new StringTokenizer(line);
        String cmd = st.nextToken();
        if (cmd.compareTo("rect") == 0) {
            String param = st.nextToken();
            st = new StringTokenizer(param, "x");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            rect(A, B);
        } else {
            cmd = st.nextToken();
            if (cmd.compareTo("row") == 0) {
                int A = Integer.parseInt(st.nextToken().substring(2));
                st.nextToken();
                int B = Integer.parseInt(st.nextToken());
                rotateRow(A, B);
            } else {
                int A = Integer.parseInt(st.nextToken().substring(2));
                st.nextToken();
                int B = Integer.parseInt(st.nextToken());
                rotateColumn(A, B);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new BufferedReader(new StringReader(in)).lines().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                parseLine(s);
            }
        });
        int count = 0;
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[0].length; j++) {
                if (screen[i][j]) count++;
            }
        }
        System.out.println(count);
        print();
    }
}
