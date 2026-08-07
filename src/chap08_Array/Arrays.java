package chap08_Array;

import java.util.Scanner;

public class Arrays {
    static void main(String[] args) {

        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        int n = arr.length;
        //intput
        for(int i=0;i<=n-1;i++){
            System.out.println("provide input for index " +i);
            arr[i]=input.nextInt();
        }
        //print
        System.out.println("your array contain");
        for(int val:arr){
            System.out.println(val);
        }

        //declareation of array
        // int arr[];
        //Allocation
        //arr = new int[5];
        //initalization
       // int brr[] = {10,20,30};

//        System.out.println("value at index 0 " +brr[0]);
//        System.out.println("value at index 1 " +brr[1]);
//        System.out.println("value at index 2 " +brr[2]);
    }
}
