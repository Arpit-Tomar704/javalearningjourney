package Challenges;

import chap08_Array.Arrayutility;

public class cha40_palindromeArrray {
    static void main(String[] args) {
        System.out.println("welcome to the palindrome ");
        int[] numArr = Arrayutility.inputArray();
        boolean ispalin = isplaindrome(numArr);
        if (ispalin){
            System.out.println("your array is panindrome ");
        }else{
            System.out.println("your array is not palindrome ");
        }

    }
    public static  boolean isplaindrome(int[]numArr){
        int i = 0;
        while (i<numArr.length/2){
            if (numArr[i]!= numArr[numArr.length-1-i]){
                return false;
            }
            i++;

        }

        return true;
    }
}
