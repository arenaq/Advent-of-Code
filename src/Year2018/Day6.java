package Year2018;

/**
 * Created by arenaq on 07.12.2018.
 */
public class Day6 {
    static class Point {
        public int x;
        public int y;
        public boolean valid = true;
        public int score = 0;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        String input = "165, 169;334, 217;330, 227;317, 72;304, 232;115, 225;323, 344;161, 204;316, 259;63, 250;280, 205;84, 282;271, 158;190, 296;106, 349;171, 178;203, 108;89, 271;193, 254;111, 210;341, 343;349, 311;143, 172;170, 307;128, 157;183, 315;211, 297;74, 281;119, 164;266, 345;184, 62;96, 142;134, 61;117, 52;318, 72;338, 287;61, 215;323, 255;93, 171;325, 249;183, 171;71, 235;329, 306;322, 219;151, 298;180, 255;336, 291;72, 300;223, 286;179, 257";
        String[] arrayInput = input.split(";");
        Point[] points = new Point[arrayInput.length];
        Point leftTop = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
        Point rightBottom = new Point(Integer.MIN_VALUE, Integer.MIN_VALUE);
        for (int i = 0; i < arrayInput.length; i++) {
            String[] p = arrayInput[i].split(", ");
            Point point = new Point(Integer.valueOf(p[0]), Integer.valueOf(p[1]));
            points[i] = point;
            if (point.x < leftTop.x) leftTop.x = point.x;
            if (point.y < leftTop.y) leftTop.y = point.y;
            if (point.x > rightBottom.x) rightBottom.x = point.x;
            if (point.y > rightBottom.y) rightBottom.y = point.y;
        }
        int width = rightBottom.x - leftTop.x + 1;
        int height = rightBottom.y - leftTop.y + 1;
        int result2 = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                boolean valid = true;
                if (x == 0 || x == width - 1) valid = false;
                if (y == 0 || y == height - 1) valid = false;
                int minDistance = Integer.MAX_VALUE;
                int secMinDistance = Integer.MAX_VALUE;
                Point bestPoint = null;
                int distanceSum = 0;
                for (Point point : points) {
                    int distance = manhattanDistance(x + leftTop.x, y + leftTop.y, point);
                    distanceSum += distance;
                    if (distance <= minDistance) {
                        secMinDistance = minDistance;
                        minDistance = distance;
                        bestPoint = point;
                    }
                }
                if (distanceSum < 10000) result2++;
                if (minDistance == secMinDistance) continue;
                bestPoint.score++;
                bestPoint.valid = valid;
            }
        }

        int maxScore = Integer.MIN_VALUE;
        Point result = null;
        for (Point point : points) {
            if (point.valid && point.score > maxScore) {
                maxScore = point.score;
                result = point;
            }
        }
        System.out.println(result.score);
        System.out.println(result2);
    }

    static private int manhattanDistance(int x, int y, Point a) {
        return Math.abs(a.x - x) + Math.abs(a.y - y);
    }
}
