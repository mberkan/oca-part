package pl.mberkan.oca.part4;

/**
 * Order is:
 * - exact match
 * - larger primitive type
 * - autoboxed type
 * - varargs
 */
public class MOverloadingOrder {

    public static void glide(int i, int j) {
        System.out.println("1");
    }

    public static void glide(long i, long j) {
        System.out.println("2");
    }

    public static void glide(Integer i, Integer j) {
        System.out.println("3");
    }

    public static void glide(int... args) {
        System.out.println("4");
    }

    public static void main(String[] args) {
        glide(1, 2);
    }
}
