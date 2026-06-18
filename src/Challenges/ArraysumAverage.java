package Challenges;

import chap08_Array.Arrayutility;

public class ArraysumAverage {
    static void main(String[] args) {
        System.out.println("welcome to the array of Sum and Average");
        int[] numArray = Arrayutility.inputArray();
        long sum = sum(numArray);
        double average  = average(numArray);
        System.out.println("Sum of the number is "+sum);
        System.out.println("Average of the number is " +average);
    }
    public static long sum(int[]numArray){
        long sum = 0;
        int i = 0;
        while (i<numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum ;
    }
    public static double average(int[]numArray){
        double sum = sum(numArray);

        return (sum/numArray.length);
    }
}
