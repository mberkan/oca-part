package pl.mberkan.oca.part4;

/**
 * Rules of initialization:
 * - if there is a superclass -> initialize it first
 * - static variable declarations and static initialization blocks
 * - instance variable declarations and static initialization blocks
 * - constructor
 */
public class OrderOfInitialization {
    private String name = "Torchie";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }
    static {
        COUNT += 10;
        System.out.println(COUNT);
    }
    public OrderOfInitialization() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new OrderOfInitialization();
    }
}
