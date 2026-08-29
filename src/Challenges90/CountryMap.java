package Challenges90;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    static void main(String[] args) {
        Map<String,String> countrymap = new HashMap<>();
        countrymap.put("india","newDelhi");
        countrymap.put("America","washington");
        countrymap.put("Australia","Melbourne");
        countrymap.put("Russia","Morocco");
        countrymap.put("China","Beijing");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your country name :");
        String country = input.next();
        if (countrymap.containsKey(country)){
            System.out.printf("Capital of %s is %s",country,
                    countrymap.get(country));

        }else{
            System.out.println(" Sorry, we don't know the capital");
        }




    }
}
