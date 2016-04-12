package pl.mberkan.oca.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * - list.toArray()
 * - Arrays.asList(...)
 */
public class IConvertingBetweenArraysAndLists {
    public static void main(String[] args) {

        // array to list
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        Object[] arrayObject = list.toArray();
        String[] arrayString = list.toArray(new String[0]); // type is expected!

        // list to array
        String[] array = { "hawk", "robin" };
        List<String> listFromArray = Arrays.asList(array); // -> fixed size "backed" list!
        listFromArray.set(0, "aaa");
        array[1] = "bbb";

        System.out.println("List: " + listFromArray);

        System.out.print("Array: ");
        for (String s : array) {
            System.out.print(s + ", ");
        }
        System.out.println();

//        listFromArray.add("AAA");
//        listFromArray.remove(0);
    }
}
