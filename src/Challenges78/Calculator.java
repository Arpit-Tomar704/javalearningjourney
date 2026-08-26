package Challenges78;

public class Calculator {
    public int add(int first ,int second){
        return first + second;

    }
    public int add(int first ,int second, int third){
        return first + second+ third;
    }

    public double add(double first ,double second){
        return first + second;
    }

    static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,5));
        System.out.println(calc.add(4,3,2));
        System.out.println(calc.add(5.5,4.3));
    }

}
