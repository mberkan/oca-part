/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part4;

/**
 * Created by mberkan on 20.04.16.
 */
public class QLambda {

    static QLambda a = new QLambda();
    static QLambda b = new QLambda();

    private static void print(CheckableWithTwoParameters checkable) {
    }

    private static void print(CheckableWithOneParameter checkable) {
    }

    private static void print(CheckableWithoutParameters checkable) {
    }

    public int value;

    public static void main(String[] args) {

        // two args
        print( (QLambda a, QLambda b) -> { a.value++; return a.value > 0 && b.value > 0; }  ); // any logic
        print( (QLambda a, QLambda b) -> { return a.value > 0 && b.value > 0; }  );
        print( (QLambda a, QLambda b) -> { return true; }  );
        print( (QLambda a, QLambda b) -> true  );
        print( (a, b) -> true  );

        // one arg
        print( (QLambda a) -> true  );
        print( (a) -> true  );
        print( a -> true  );

        // zero
        print(() -> true); // zero


        // invalid:
//        print( a, b -> true  );
//        print( () -> { true; }  );
//        print( () -> { return true }  );
//        print( (a, b) -> { int a = 1; return true; }  );
    }


}

@FunctionalInterface
interface CheckableWithoutParameters {
    boolean canHop();
}

@FunctionalInterface
interface CheckableWithOneParameter {
    boolean canHop(QLambda a);
}

@FunctionalInterface
interface CheckableWithTwoParameters {
    boolean canHop(QLambda a, QLambda b);
}
