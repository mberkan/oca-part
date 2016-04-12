package pl.mberkan.oca.part3;

import java.util.ArrayList;

/**
 *
 */
public class GArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>(); // generics -> Java 5
        ArrayList<String> list2 = new ArrayList<>(); // diamond operator -> Java 7

        list1.add("hawk");
        list1.add(0, "robin");
        System.out.println(list1);

//        list1.remove("AAA"); // -> returns 0
//        list1.remove("hawk");
//        list1.remove(0);
//        System.out.println(list1);
//
//        System.out.println(list1.isEmpty());
//
//        System.out.println(list1.size());
//
//        list1.add("hawk");
//        System.out.println(list1.contains("hawk"));
//
//        list1.clear();
//
//        // equals
//        list1.add("hawk");
//        list1.add(0, "robin");
//
//        list2.add("hawk");
//        list2.add(0, "robin");
//
//        System.out.println(list1.equals(list2));
//
//        // tricky
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.remove(1);
//        System.out.println(numbers);
    }
}
