package chap06_Loops;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

class Loop {
    static void main(String[] args) {
//        int num = 1; //intialization
//        while (num<=10){//applying condition
//            System.out.println(num);//actual work
//            num +=1;//updating the condition
//        }
//
//        int count = 500;
//        while (count>=200){
//            System.out.println(count);
//            count -=1;
//        }
        Scanner input = new Scanner(System.in);
        int i  = 0;
        while (i<=5){
            int inp = input.nextInt();
            System.out.println("your number is "+inp);
            i++;
        }
    }
}
