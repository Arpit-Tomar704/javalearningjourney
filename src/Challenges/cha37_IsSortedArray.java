package Challenges;

import chap08_Array.Arrayutility;

public class cha37_IsSortedArray {
    static void main(String[] args) {
        System.out.println("welcome to the Sorted  Array\n");
        int[] numArr = Arrayutility.inputArray();
        boolean isDec = isDecreasing(numArr);
        boolean isInc = isIncreasing(numArr);
        if (isInc || isDec ){
            System.out.println("your array is sorted ");
        }else {
            System.out.println("your array is not  sorted ");
        }

    }
    public static boolean isDecreasing(int[]numArr){
        int i = 1;
        while (i< numArr.length){
            if (numArr[i]>numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isIncreasing(int[]numArr){
        int i = 1;
        while (i< numArr.length){
            if (numArr[i] < numArr[i-1]){
                return false;

            }
            i++;
        }
        return true;
    }
}
