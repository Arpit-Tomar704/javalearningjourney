package Challenges;


import chap08_Array.Arrayutility;

import java.util.Scanner;

class MAXArray {
     static void main() {
         System.out.println("welcome to finding the maximum array\n");
         int arr[] = Arrayutility.inputArray();
         int max = Integer.MIN_VALUE;
         for (int num:arr){
             if (max<num){
                 max=num;
             }
         }
         System.out.println("maximum number is :"+max);

     }
}
