package Challenges101;

import java.util.List;

public class OddNumbers {
    static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        numbers.stream().filter(num -> num%2 ==1)
                .forEach(num -> System.out.println(num));
    }
}
