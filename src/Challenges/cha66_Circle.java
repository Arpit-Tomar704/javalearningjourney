package Challenges;


import java.util.Scanner;

class Circle {
    double radiusInMm;

     Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }
    double getCircumference(){
         return 2 *radiusInMm*Math.PI;

    }
    double getArea(){
         return Math.PI*Math.pow(radiusInMm,2);
    }

    @Override
    public String toString() {
        return "circle props:radius in mm:"+ radiusInMm
                +", circumference in mm:"+ getCircumference()
                +",Area in mm2:"+getArea();
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the world of circle\n");
        System.out.print("please enter your radius: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);


    }
}
