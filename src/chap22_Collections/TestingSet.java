package chap22_Collections;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("arpit"));
        System.out.println(names.add("ansh"));
        Utility.print(names);
        System.out.println(names.add("ansh"));
        System.out.println(names.size());
        Utility.print(names);
        System.out.println(names.contains("arpit"));
        System.out.println(names.remove("arpit"));
        Utility.print(names);
        System.out.println(names.add("Arpit"));
        Utility.print(names);
    }
}
