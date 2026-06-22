package Challenges;

import chap08_Array.Arrayutility;

public class cha43_SumAverageArray {
    static void main(String[] args) {
        System.out.println("welcome to the sum and averabe of the 2D array \n");
        int[][] numArr = Arrayutility.input2DArray();
        long sum = sum(numArr);
        double average = Average(numArr);
        System.out.println("your sum of the array is : "+sum );
        System.out.println("your average of the array is : " +average);

    }
    public static  double Average(int[][]numArr){
        if (numArr.length==0){
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows*cols;
        return sum(numArr)/size;


    }
    public static  long sum(int[][]numArr){
        long sum = 0 ;
        int  i =0;
        while (i< numArr.length){
            int j=0;
            while (j< numArr.length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum ;

    }
}
