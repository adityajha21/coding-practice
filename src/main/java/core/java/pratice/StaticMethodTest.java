package core.java.pratice;

class MathUtils {
    // Static method for adding two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Static method for subtracting two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }
}

public class StaticMethodTest {
    public static void main(String[] args) {
        // Calling static methods without creating an instance of MathUtils
       // int sum = MathUtils.add(10, 5);
        MathUtils mathUtils = new MathUtils();
        int sum = mathUtils.add(10,5);
        int difference = MathUtils.subtract(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
