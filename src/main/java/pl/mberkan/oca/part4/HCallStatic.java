package pl.mberkan.oca.part4;

/**
 * How to call static method/field.
 */
public class HCallStatic {
    public static void main(String[] args) {

        System.out.println(GStaticFieldAndMethod.count);

        GStaticFieldAndMethod.main(args);

//        GStaticFieldAndMethod test = new GStaticFieldAndMethod();
//        System.out.println(test.count);
//
//        test = null;
//        System.out.println(test.count);
    }
}
