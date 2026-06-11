package chap07_Function;

public class Parameter {
    static void main(String[] args) {
//        int num = sumTwoNumbers(5,6);
        System.out.println(sumTwoNumbers(5,6));
        System.out.println(sumTwoNumbers(5,3));
        System.out.println(sumTwoNumbers(6,6));
        System.out.println(sumTwoNumbers(7,6));
    }
    public static int sumTwoNumbers(int first ,int second ){
        System.out.println("First number  Received is : "+first);
        System.out.println("second number received is : "+second);
        int sum = first + second ;
        return sum ;
    }
}
