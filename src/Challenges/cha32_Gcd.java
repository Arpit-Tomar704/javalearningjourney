package Challenges;

import java.util.Scanner;

public class cha32_Gcd {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Gcd\n");
        System.out.print("please enter your number: ");
        int first =input.nextInt();
        System.out.print("please enter the  number : ");
        int second = input.nextInt();
        int gcd = gcd(first,second);
        System.out.println("Gcd of the number is : " +gcd);

    }
    public static  int gcd(int num1,int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1,num2);
        while (i<=least){
            if(num1  % i== 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;

    }
    public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}
