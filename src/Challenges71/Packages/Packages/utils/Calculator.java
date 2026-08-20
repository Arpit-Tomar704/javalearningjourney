package Challenges71.Packages.Packages.utils;

import Challenges71.Packages.Packages.geometry.Circle;
import Challenges71.Packages.Packages.geometry.Rectangle;

public class Calculator {
    static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double cirArea = Math.PI*Math.pow(cir.radius,2);
        double rectArea = rect.length *rect.breadth;

        System.out.printf("Area of the circle is:%f,Area of the rectangle is:%f" ,cirArea,rectArea);

    }
}
