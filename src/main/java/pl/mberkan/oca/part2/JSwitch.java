package pl.mberkan.oca.part2;

/**
 * Switch supported types:
 * - int, short, byte, char
 * - enum (since 1.5)
 * - String (since 1.7)
 * - Integer, Short, Byte, Char
 *
 * Be aware of "break" existing!
 *
 * Be aware of types!
 *
 * Be aware of final values
 */
public class JSwitch {
    public static void main(String[] args) {
        int dayOfWeek = 5;
        int friday = 4;
        switch (dayOfWeek) {
            default:
                System.out.println("Default");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
//            case "Monday":
//                System.out.println("Monday");
//                break;

//            case friday:
//                System.out.println("Friday");
//                break;
        }
    }
}
