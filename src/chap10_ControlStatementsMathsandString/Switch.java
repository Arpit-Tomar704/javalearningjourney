package chap10_ControlStatementsMathsandString;

import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Day of the week Detector\n");
        System.out.println("Enter your day in number: ");
        int day = input.nextInt();
        // oldSwitch(day);
        newSwitch(day);


    }

    public  static void newSwitch(int day){
        String daystr = switch (day){
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default -> "invalid";

        };
        System.out.println(daystr);
    }
    public static  void oldSwitch(int day){

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day");
                break;


        }

    }
}
