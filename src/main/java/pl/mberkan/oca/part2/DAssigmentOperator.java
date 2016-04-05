package pl.mberkan.oca.part2;

/**
 * Examples:
 * - invalid assignment
 * - explicit casting
 */
public class DAssigmentOperator {

    void test1() {
        // int x = 1.0;
        // short y = 1921222;
        // int z = 9f;
        // long t = 32432432434444444;
    }

    void test2() {
        int x = (int)1.0;
        short y = (short)1921222; // -> stored 20678
        int z = (int)9f;
        long t = 32432432434444444L;
    }

    void test3() {
        short x = 10, y = 3;
        // short result = x + y;
        short result = (short)(x + y);
    }
}
