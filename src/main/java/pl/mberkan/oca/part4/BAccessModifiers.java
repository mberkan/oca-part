package pl.mberkan.oca.part4;

/**
 * Access modifiers:
 *
 * - private: only within the same class
 * - default (package private): private and other classes in the same package
 * - protected: default + child classes
 * - public: all
 */
public class BAccessModifiers {

    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;

    public static void main(String[] args) {
        BAccessModifiers test = new BAccessModifiers();
        System.out.println(test.name);
        System.out.println(test.hasFur);
        System.out.println(test.hasPaws);
        System.out.println(test.id);
    }
}
