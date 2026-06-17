package chap08_Array;

import java.util.Scanner;

public class arraySearching {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,4,6,8,10,12,14};
        System.out.println("welcome to the Array Searching\n ");
        System.out.print("please enter the number you want to search : ");
        int num = input.nextInt();
        boolean isfound = isfound(arr,num);
        if (isfound){
            System.out.println("your number was found in the array ");
        }else {
            System.out.println("your number waas not found in the array ");
        }
    }
    public static boolean isfound(int[] arr,int num){
        int index = 0;
        while (index< arr.length){
            if (arr[index] == num){
                return  true;
            }
            index++;

        }
        return false;
    }
}
