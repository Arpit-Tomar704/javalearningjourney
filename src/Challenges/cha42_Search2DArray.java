package Challenges;


import chap08_Array.Arrayutility;

import java.util.Scanner;

public class cha42_Search2DArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to 2D search \n");
        int[][] numArr = Arrayutility.input2DArray();
        System.out.print("now enter the number you want to search : ");
        int num = input.nextInt();
        boolean isfound = search(numArr,num);
        if (isfound){
            System.out.println("your number was found");
        }else {
            System.out.println("your number was not found ");
        }

    }
    public static  boolean search(int[][]numArr,int num){
        int i =0;
        while (i<numArr.length){
            int j = 0;
            while (j<numArr[i].length){
                if (numArr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }



}
