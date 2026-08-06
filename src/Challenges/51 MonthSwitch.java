package Challenges;

import java.util.Scanner;

class MonthSwitch {
  static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("welcome to the Month Mapping\n ");
   System.out.print("please enter your Month Number  : ");
   int month = input.nextInt();
   newswitch(month);


  }
  public static  void newswitch(int month){
   String monthstr = switch(month){
    case 1-> "January";
    case 2-> "februray";
    case 3-> "march";
    case 4-> "April";
    case 5-> "May";
    case 6-> "June";
    case 7-> "July";
    case 8-> "August";
    case 9-> "September";
    case 10-> "October";
    case 11-> "November";
    case 12-> "December";
    default -> "invalid";


   };
   System.out.println(monthstr);



 }
}
