package pl.mberkan.oca.part2;

/**
 * Ternary operator example
 * - as of Java 7 only one is evaluated
 */
public class ITernaryOperator {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        final int result = x < 10? x++ : y++;
        System.out.println(x + "," + y);
    }
}
