package pl.mberkan.oca.part1;

/**
 * Finalize:
 *  - might be called
 *  - called only once
 */
public class MFinalize {
    @Override
    protected void finalize()  {
        System.out.println("Finalize!");
    }

    public static void main(String[] args) {
        MFinalize m = new MFinalize();

//        for (int i = 0; i < 1000; i++) {
//            MFinalize n = new MFinalize();
//        }
//
//        System.gc();
    }
}
