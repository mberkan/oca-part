package pl.mberkan.oca.part1;

/**
 * Setup order
 */
public class FInicializationOrder {

    private String test = "A";

    {
        System.out.println("Setting field");
    }

    public FInicializationOrder() {
        test = "B";
        System.out.println("Setting constructor");
    }

    public static void main(String[] args) {
        System.out.println(new FInicializationOrder().test);
    }

    ////////////////////////////////////////////////

    {
        // System.out.println("Test B: " + testB); // <-- doesn't compile
    }
    private String testB = "B";

}
