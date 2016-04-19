package pl.mberkan.oca.part4;

/**
 * Tricky example
 */
public class IStaticVsInstance {

    private String name = "Static class";

    public static void first() {}

    public static void second() {}

//    public void third() { System.out.println(name); }

    public static void main(String[] args) {
//        first();
//        second();
//        third();
    }
}
