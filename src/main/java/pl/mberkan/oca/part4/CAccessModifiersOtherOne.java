package pl.mberkan.oca.part4;

/**
 * Access from another class in the same package.
 */
public class CAccessModifiersOtherOne {
    public static void main(String[] args) {
        BAccessModifiers test = new BAccessModifiers();
//        System.out.println(test.name);
//        System.out.println(test.hasFur);
//        System.out.println(test.hasPaws);
//        System.out.println(test.id);
    }
}
