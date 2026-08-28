package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {
     static void main(String[] args) {
         List<Integer> list = Arrays.asList(1,4,2,3,5,6,5);
         System.out.println(Collections.frequency(list,1));
         System.out.println(Collections.frequency(list,4));
         System.out.println(Collections.frequency(list,3));
         System.out.println(Collections.frequency(list,5));



     }
}
