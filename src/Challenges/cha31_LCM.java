package Challenges;

import java.util.Scanner;

public class cha31_LCM {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the LCM\n ");
        System.out.print("Enter the number : ");
        int first = input.nextInt();
        System.out.print("Enter the other number : ");
        int second = input.nextInt();
        int lcm =Lcm(first ,second);
        System.out.println("The lcm  of two number is : " +lcm);


    }
    public static  int Lcm(int first ,int second){
        int i = 1;
        while (true){
            int factor = first*i;
            if (factor%second==0){
                return factor;
            }
            i++;

        }

    }
}
