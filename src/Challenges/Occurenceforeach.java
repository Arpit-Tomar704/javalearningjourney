package Challenges;

import chap08_Array.Arrayutility;

import java.util.Scanner;

class Occurenceforeach {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to the  finding occurences\n");
         int[] num = Arrayutility.inputArray();
         System.out.print("now Enter  the number you want to search:  ");
         int elements = input.nextInt();
         int occ = countoccurences(num,elements);
         System.out.println("your elements was found " +occ +" times ");


     }
     public static  int countoccurences(int[] nums,int elements){
         int occ=0;
         for (int num :nums){
             if (num==elements){
                 occ++;
             }
         }
         return occ;

     }
}
