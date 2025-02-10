package org.example.maths;

public class PointInTriangle {

    // Function to calculate area of triangle using determinant formula
    public static double calculateArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    // Function to check if a point (px, py) lies inside the triangle (A, B, C)
    public static boolean isInsideTriangle(double x1, double y1, double x2, double y2, double x3, double y3, double px, double py) {
        // Calculate area of the main triangle ABC
        double A = calculateArea(x1, y1, x2, y2, x3, y3);

        // Calculate areas of sub-triangles PAB, PBC, PCA
        double A1 = calculateArea(px, py, x2, y2, x3, y3);
        double A2 = calculateArea(x1, y1, px, py, x3, y3);
        double A3 = calculateArea(x1, y1, x2, y2, px, py);

        // If the sum of sub-triangle areas equals the main triangle area, the point is inside
        return (A == A1 + A2 + A3);
    }

    public static void main(String[] args) {
        double x1 = 0, y1 = 0;
        double x2 = 5, y2 = 5;
        double x3 = 10, y3 = 0;

        double px = 5, py = 2; // Point to check

        if (isInsideTriangle(x1, y1, x2, y2, x3, y3, px, py)) {
            System.out.println("The point (" + px + ", " + py + ") lies inside the triangle.");
        } else {
            System.out.println("The point (" + px + ", " + py + ") lies outside the triangle.");
        }
    }
}

