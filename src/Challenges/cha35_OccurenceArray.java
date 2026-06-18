package Challenges;

import chap08_Array.Arrayutility;

import java.util.Scanner;

public class cha35_OccurenceArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Array Ocurrneces\n");
        int[] numArray = Arrayutility.inputArray();
        System.out.print("please enter the number you want to find : ");
        int num = input.nextInt();
        int occurences = noOfoccurence(numArray ,num);
        System.out.println("your element was found " + occurences +" times in the array");


    }
    public static int noOfoccurence(int[] numArr,int num){
        int occ = 0;
        int i =0;
        while (i< numArr.length){
            if (numArr[i]==num){
                occ++;
            }
            i++;        }
        return occ ;
    }

}
