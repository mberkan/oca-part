package pl.mberkan.oca.part2;

/**
 * Check braces, not indentation!
 */
public class HIfStatement {
    public static void main(String[] args) {
        int x = 2;
        if(x == 3)
            System.out.println("A");
            System.out.println("B");
    }

    void test1() {
        int x = 1;
//        if(x) {
//
//        }
    }

    void test2() {
        int x = 1;
//        if(x = 5) {
//
//        }
    }
}
