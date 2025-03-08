package leetcode;

public class MinTimeVisitingPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;

        for (int i = 1; i < points.length; i++) {
            int x1 = points[i - 1][0], y1 = points[i - 1][1];
            int x2 = points[i][0], y2 = points[i][1];

            // The max of the absolute differences gives the minimum time required
            totalTime += Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));
        }

        return totalTime;
    }

    public static void main(String[] args) {
        int[][] points = {{1,1}, {3,4}, {-1,0}};
        System.out.println(minTimeToVisitAllPoints(points)); // Output: 7
    }
}