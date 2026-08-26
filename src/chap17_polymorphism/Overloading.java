package chap17_polymorphism;

public class Overloading {
    public int add(int a,int b){
        return a+b;
    }
    public String add(String a,String b){
        return a+b;
    }


    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }


    static void main(String[] args) {
        Overloading overload = new Overloading();
        int add = overload.add(3,4);
        System.out.println(overload.add(5,5));

    }
}
