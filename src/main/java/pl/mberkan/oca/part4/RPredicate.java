package pl.mberkan.oca.part4;

import java.util.ArrayList;
import java.util.List;

/**
 * Predicate example
 */
public class RPredicate {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Snake");
        System.out.println(animals);

//        animals.removeIf(s -> s.charAt(0) == 'T');
//        System.out.println(animals);
    }
}
