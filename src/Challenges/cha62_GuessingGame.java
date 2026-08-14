package Challenges;

import java.util.Scanner;

class GuessingGame {
     int random;

     GuessingGame(){
         random = (int)Math.ceil(Math.random()*100);

     }

     /**
      *
      * @param guessnumber the number that player guessed
      * @return
      * - negative if the guessed number is smaller.
      * -0 if the guesssed number is correct.
      * - positive if the guessed number is higher .
      */

     int  guess(int guessnumber){
         return guessnumber-random;

     }
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         GuessingGame game = new GuessingGame();
         System.out.println("welcome to the guessing game.Guess the number between 1-100");
         int guess;
         int result;
         do {
             System.out.print("Guess the number :");
             guess = input.nextInt();
             result = game.guess(guess);
             if (result ==0){
                 System.out.println("congrats,your guess is correct");
             }else if (result<0){
                 System.out.println("please Guess higher");

             }else {
                 System.out.println("please guess lower");
             }
         }while (result !=0);


     }
}
