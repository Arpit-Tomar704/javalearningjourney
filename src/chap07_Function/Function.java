package chap07_Function;

public class Function {
    static void main(String[] args) {

//        System.out.println("in main method ");
//        greetUser();
//        System.out.println("Method calling complete ");
//    }public static void greetUser(){
//        System.out.println("good afternoon ansh  ");

        printfirstpattern();



   }public static void printfirstpattern(){
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *");

        int rows = 0;
        while (rows<5){
            System.out.print("*");
            int i = 0 ;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }

    }
}
