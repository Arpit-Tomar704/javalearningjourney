package chap19_Exception;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the division Caculator\n");
        System.out.print("please enter your two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        }catch (ArithmeticException exception){
            System.out.printf("%s , enter valid values" ,
                    exception.getMessage());
        }
    }
}
