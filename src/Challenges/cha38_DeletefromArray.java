package Challenges;

import chap08_Array.Arrayutility;

import java.util.Scanner;

public class cha38_DeletefromArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the delete from an array\n");
        int[] numArr = Arrayutility.inputArray();
        System.out.print("please enter the array you want to delete : ");
        int numtodelete = input.nextInt();
        int[] newArr = deletenumber(numArr, numtodelete);
        System.out.print("here is your new array ");
        Arrayutility.displayArray(newArr);
    }

    public static int[] deletenumber(int[] numArr, int numtodelete) {
        int occ = cha35_OccurenceArray.noOfoccurence(numArr, numtodelete);
        if (occ == 0) {
            return numArr;
        }
        int newsize = numArr.length - occ;
        int[] newArr = new int[newsize];


        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numtodelete) {
                newArr[j] = numArr[i];
                j++;

            }
            i++;

        }
        return newArr;
    }
}
