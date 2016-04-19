package pl.mberkan.oca.part4;

/**
 * Java is a "pass by value" (copy)
 */
public class KPassingDataAmongsMethods {

    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.println(num);

//        String stringValue = "Test";
//        newString(stringValue);
//        System.out.println(stringValue);
//
//        StringBuilder stringBuilderValue = new StringBuilder("Test");
//        newStringBuffer(stringBuilderValue);
//        System.out.println(stringBuilderValue);
    }

    private static void newNumber(int num) {
        num = 8;
    }

    private static void newString(String stringValue) {
        stringValue = "XXX";
    }

    private static void newStringBuffer(StringBuilder stringBuilderValue) {
        stringBuilderValue.append(" YYY");
    }
}
