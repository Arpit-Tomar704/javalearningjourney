package chap07_Function;

import java.util.Scanner;

public class Return {
    static void main(String[] args) {

        greet();
        int first = Readnumber();
        int Second = Readnumber();
        int Third = Readnumber();
        int result = first +Second +Third;
        System.out.println("The sum  Number is : " +result);
    }
    public static int Readnumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Number: ");
        int Number = input.nextInt();
        return Number;
    }




    public static void greet(){
        System.out.println("welcom to the calculator\n");
    }
}
