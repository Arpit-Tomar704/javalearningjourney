import java.util.Scanner;

class Recursion {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to the factorial of a number \n");
         System.out.println("please enter your number: ");
         int num = input.nextInt();
         long fact = factorial(num);
         System.out.println("your factorial is: " +fact);

     }
     public static  long factorial(int num){
        long result =1;
        for (int i =1;i<=num;i++) {
            result *= i;
        }
        return result;


     }
}
