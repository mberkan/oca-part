package pl.mberkan.oca.part4;

/**
 * Methods names
 */
public class AMethods {

//    public void walk() {};
//
//    default void walk2() {};
//
//    void public walk3() {};
//
//    void walk4() {};

    // optional specifiers

//
//    public void walk5() {};
//
//    public final void walk6() {};
//
//    public static final void walk7() {};
//
//    public modifier void walk8() {};
//
//    public void final void walk9() {};
//
//    final public void walk10() {};

    // return type

//    public void walk11() { };
//
//    public void walk12() { return; }
//
//    public String walk13() { };
//
//    public String walk14() { return ""; };
//
//    public walk15() {};
//
//    String walk16(int a) { if(a == 4) return "";};

    // method names

//    public void walk21() {};
//
//    public void 2walk22() {};
//
//    public walk3 void() {};
//
//    public void Walk_$() {};
//
//    public void() {};

    // varargs

//    public void walk31(int... nums) {};
//
//    public void walk32(int starts, int... nums) {};
//
//    public void walk33(int... nums, int starts) {};
//
//    public void walk34(int... starts, int... nums) {};

    public static void walk40(int start, int... nums) {
        System.out.println(nums.length);
    }

    public static void main(String[] args) {
        walk40(1);
//        walk40(1, 2);
//        walk40(1, 2, 3);
//        walk40(1, new int[] {4, 5 });
//        walk40(1, null);
    }
}
