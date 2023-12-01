package Year2016;

import java.io.IOException;

/**
 * Created by arenaq on 04.12.2016.
 */
public class Day1 {
    static final int ARRAY_SIZE = 1024;
    static final int OFFSET = ARRAY_SIZE / 2;

    static class Node {
        Node prev, next;
        int vx, vy;
    }

    static int x = 0, y = 0;
    static Node direction;
    static int number = 0;
    static boolean[][] a;

    static void initDirections() {
        Node NORTH = new Node();
        Node EAST = new Node();
        Node SOUTH = new Node();
        Node WEST = new Node();

        NORTH.next = EAST;
        NORTH.prev = WEST;
        NORTH.vx = 0;
        NORTH.vy = 1;

        EAST.next = SOUTH;
        EAST.prev = NORTH;
        EAST.vx = 1;
        EAST.vy = 0;

        SOUTH.next = WEST;
        SOUTH.prev = EAST;
        SOUTH.vx = 0;
        SOUTH.vy = -1;

        WEST.next = NORTH;
        WEST.prev = SOUTH;
        WEST.vx = -1;
        WEST.vy = 0;

        direction = NORTH;
    }

    static void move() {
        for (int i = 0; i < number; i++) {
            x += direction.vx;
            y += direction.vy;

            if (a[OFFSET + x][OFFSET + y]) {
                System.out.println("Intersection: [" + x + "," + y + "], 2nd question answer: +" + (Math.abs(x) + Math.abs(y)));
            } else {
                a[OFFSET + x][OFFSET + y] = true;
            }
        }
        number = 0;
    }

    public static void main(String[] args) throws IOException {
        String input = "R4, R3, R5, L3, L5, R2, L2, R5, L2, R5, R5, R5, R1, R3, L2, L2, L1, R5, L3, R1, L2, R1, L3, L5, L1, R3, L4, R2, R4, L3, L1, R4, L4, R3, L5, L3, R188, R4, L1, R48, L5, R4, R71, R3, L2, R188, L3, R2, L3, R3, L5, L1, R1, L2, L4, L2, R5, L3, R3, R3, R4, L3, L4, R5, L4, L4, R3, R4, L4, R1, L3, L1, L1, R4, R1, L4, R1, L1, L3, R2, L2, R2, L1, R5, R3, R4, L5, R2, R5, L5, R1, R2, L1, L3, R3, R1, R3, L4, R4, L4, L1, R1, L2, L2, L4, R1, L3, R4, L2, R3, L1, L5, R4, R5, R2, R5, R1, R5, R1, R3, L3, L2, L2, L5, R2, L2, R5, R5, L2, R3, L5, R5, L2, R4, R2, L1, R3, L5, R3, R2, R5, L1, R3, L2, R2, R1";
        initDirections();

        a = new boolean[ARRAY_SIZE][ARRAY_SIZE];
        a[OFFSET][OFFSET] = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch(c) {
                case 'R': direction = direction.next;
                    break;
                case 'L': direction = direction.prev;
                    break;
                case ',':
                    move();
                    break;
                case ' ':
                    break;
                case '0': number = number * 10;
                    break;
                case '1': number = number * 10 + 1;
                    break;
                case '2': number = number * 10 + 2;
                    break;
                case '3': number = number * 10 + 3;
                    break;
                case '4': number = number * 10 + 4;
                    break;
                case '5': number = number * 10 + 5;
                    break;
                case '6': number = number * 10 + 6;
                    break;
                case '7': number = number * 10 + 7;
                    break;
                case '8': number = number * 10 + 8;
                    break;
                case '9': number = number * 10 + 9;
                    break;
                default: throw new IllegalArgumentException("Character '" + c + "' at position "+ i +".");
            }
        }

        move();

        System.out.println(Math.abs(x) + Math.abs(y));
    }
}
