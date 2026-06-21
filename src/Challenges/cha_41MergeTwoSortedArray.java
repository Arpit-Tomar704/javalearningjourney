package Challenges;

import chap08_Array.Arrayutility;

public class cha_41MergeTwoSortedArray {
    static void main(String[] args) {
        System.out.println("welcome to the Merging  sorteed array\n ");
        int[] numArr1 = Arrayutility.inputArray();
        int[] numArr2 = Arrayutility.inputArray();
        int[] mergedArr = merge(numArr1,numArr2);
        System.out.print("your merged array is : ");
        Arrayutility.displayArray(mergedArr);

    }

    public static int[] merge(int[] numArr1, int[] numArr2){
        int newsize = numArr1.length + numArr2.length;
        int [] newArr = new int[newsize];

        int i =0 , j=0 ,k=0;
        while (i<numArr1.length || j<numArr2.length){
            if (j==numArr2.length ||
                    (i<numArr1.length && numArr1[i]<numArr2[j])){
                newArr [k] = numArr1[i];
                i++;
                k++;

            }else {
                newArr[k] = numArr2[j];
                k++;
                j++;
            }
        }



        return  newArr;

    }
}
