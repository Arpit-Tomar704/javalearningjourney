package chap08_Array;

public class TwoDimensionalArray {
    static void main(String[] args) {

//        int [][] myArr = new int[2][3];
//        myArr[1][2] =9;
       int arr[][]= {{1,2,3},{3,4,5}};
//        System.out.println(arr[0].length);
//        traversal method
        int i = 0;
        while (i< arr.length){
            int j = 0;
            while (j<arr[i].length){
                System.out.print(arr[i][j] + "");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
