package chap04_Operators;

import java.io.PrintStream;
import java.util.Scanner;

class Shorthand {
    static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        a = a + x1;
        System.out.println(a);
        int x2 = input.nextInt();
        a += x2;
        System.out.println(a);
        int x3 = input.nextInt();
        a += x3;
        System.out.println(a);
        int x4 = input.nextInt();
        a += x4;
        System.out.println(a);
    }
}
