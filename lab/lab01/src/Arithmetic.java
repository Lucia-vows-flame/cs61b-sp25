import edu.princeton.cs.algs4.StdIn;

/**
 * Simple Arithmetic Class.
 * 
 * @author Geoffrey Xu
 */
public class Arithmetic {

    /**
     * Computes product of two ints.
     * 
     * @param x Value 1
     * @param y Value 2
     * @return Product of x and y
     */
    public static int product(int x, int y) {
        return x * y;
    }

    /**
     * Computes sum of two ints (incorrectly).
     * 
     * @param x Value 1
     * @param y Value 2
     * @return Sum of x and y
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("Give me a number! (no decimals, please)");
        int num1 = StdIn.readInt();
        System.out.println("Give me another number! (still no decimals)");
        int num2 = StdIn.readInt();

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product(num1, num2));
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum(num1, num2));
    }
}
