package Challenges100;

import java.util.List;

public class StringFilterAndConcatenate {
    static void main(String[] args) {

        List<String> names = List.of("meri ","bhai " ,
                "java ","complete ","hone ","wali hai ");
        names.stream().
                filter(name -> name.length()>10)
                .reduce(" ",(a,b) -> a + " "+ b );


        System.out.println(names);


    }
}
