package chap08_Array;

import java.util.Scanner;



public class Arrayutility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number of Elements : ");
        int size = input.nextInt();
        int nums[] = new int[size];
        int i =0;
        while (i<size){
            System.out.print("Please enter  element no " +(i+1)+": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;


    }


    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number of Rows : ");
        int Rows = input.nextInt();
        System.out.print("Please Enter The Number of Columns : ");
        int Columns = input.nextInt();
        int nums[][] = new int[Rows][Columns];
        int i =0;
        while (i<Rows){
            int j =0;
            while (j<Columns){
                System.out.print("Please enter element row  " +(i+1)+
                                ",column : " +(j+1)+ ":");
                nums[i] [j] = input.nextInt();
                j++;


            }

            i++;
        }
        return nums;


    }


    public static void displayArray(int[]numArray){
        int i =0;
        while (i<numArray.length){
            System.out.println(numArray[i] + "");
            i++;
        }
        System.out.println();
    }

}
