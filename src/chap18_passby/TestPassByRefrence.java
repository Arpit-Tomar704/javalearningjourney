package chap18_passby;

import java.awt.*;
import java.util.StringJoiner;

public class TestPassByRefrence {

    static void main(String[] args) {
        Point first = new Point(4,8);
        System.out.println("first: "+first);
        move(first);
        System.out.println("first: " +first);

    }
    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }




    public static  class point {
        int x;
        int y;
        public point(int x,int y){
            this.x=x;
            this.y=y;

        }

        @Override
        public String toString() {
            return new StringJoiner(", ", point.class.getSimpleName() + "[", "]")
                    .add("x=" + x)
                    .add("y=" + y)
                    .toString();
        }
    }
}
