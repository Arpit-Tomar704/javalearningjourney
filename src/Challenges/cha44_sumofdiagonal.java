package Challenges;

import chap08_Array.Arrayutility;

public class cha44_sumofdiagonal {
    static void main(String[] args) {
        System.out.println("welcome to the Diagonal Sum\n");
        int[][] numArr = Arrayutility.input2DArray();
        long sum = sumofDiagonal(numArr);
        System.out.println("your sum of diagonal is " +sum);

    }
    public static long sumofDiagonal(int[][]numArr){
        long leftsum = sumofleftDiagonal(numArr);
        long rightsum = sumofrightDiagonal(numArr);
        long sum = leftsum + rightsum;
        if (numArr.length%2 !=0){
            int ind = numArr.length/2;
            sum -= numArr[ind][ind];
        }
        return sum;
    }public static long sumofleftDiagonal(int[][]numArr) {
        long sum = 0;
        int i =0;
        while (i< numArr.length){
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }public static long sumofrightDiagonal(int[][]numArr) {
        long sum =0;
        int i = 0;
        while (i< numArr.length){
            int cols = numArr.length-1-i;
            sum += numArr[i][cols];
            i++;
        }
        return sum;
    }
}
