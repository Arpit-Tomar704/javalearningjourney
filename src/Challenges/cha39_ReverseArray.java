package Challenges;

import chap08_Array.Arrayutility;

public class cha39_ReverseArray {
    static void main(String[] args) {
        System.out.println("welcome the reverse array\n");
        int[] numArr= Arrayutility.inputArray();
        reverse(numArr);
        System.out.print("your reversed arraqy is ");
        Arrayutility.displayArray(numArr);
        
    }
    public static void reverse(int[] arr){
        int i = 0 ;
        while(i< arr.length/2){
            int swap = arr[i];
            arr[i]= arr[(arr.length-1) -i];
            arr[(arr.length-1)-i]= swap;
            i++;
        }
    }
}
