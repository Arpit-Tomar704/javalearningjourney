package Challenges;


import java.util.Scanner;

class AbsoluteValue {
 static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("wlecome to AbsoluteValue\n");
  System.out.print("Enter your number: ");
  int num = input.nextInt();
  int result = num>=0?num:-num;
  System.out.println("Absolute value is:" +result);

 }
}
