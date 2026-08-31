package Challenges99;

import java.util.List;

public class StreamTest {
    static void main(String[] args) {
        List<String> names = List.of("hey ","how ","are ","you ");
        names.stream().forEach(name-> System.out.print(name ));
    }
}
