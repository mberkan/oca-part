package pl.mberkan.oca.part1;

/**
 * Examples:
 * - java pl.mberkan.oca.part1.BMainWithParams XXX BBB
 * - java pl.mberkan.oca.part1.BMainWithParams 'XXX BBB'
 */
public class BMainWithParams {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println(i + ": " + args[i]);
        }
    }
}
