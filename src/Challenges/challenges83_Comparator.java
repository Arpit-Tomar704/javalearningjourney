package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Comparator {
     static void main(String[] args) {
         List<String> list = Arrays.asList("heyy","hii","bye");
         System.out.println(list);
         sortInDescending(list);
         System.out.println(list);

     }

     public static  void sortInDescending(List<String> stringlist){
         Collections.sort(stringlist, new java.util.Comparator<String>() {
             @Override
             public int compare(String o1, String o2) {
                 if ( o1.equals(o2)){
                     return 0;
                 } else if (o1.charAt(0)<o2.charAt(0)) {
                     return 1;
                     
                 }else {
                     return -1;
                 }

             }
         });

     }
}
