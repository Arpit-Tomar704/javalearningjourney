package Challenges;



import java.util.Scanner;

class PallindromeRecursion {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the pallindrome checker\n");
        System.out.print("enter the string to be checked: ");
        String str = input.next();
        System.out.println("your string is " +((ispalindrome(str) ?"palindrome" :"not palindrome")));


    }

    public static  boolean ispalindrome(String str){
        if (str.length()<=1){
            return true;
        }
        int lastpos = str.length()-1;
        if(str.charAt(0)!=str.charAt(lastpos)){
            return false;
        }
        String newStr = str.substring(1,lastpos);
        return ispalindrome(newStr);
    }



}
