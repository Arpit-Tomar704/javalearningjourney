package Challenges;

import java.util.StringJoiner;

class studentDetails{
    String name;
    int age;
    int height;
    String colour;

    public studentDetails(String name, int age, int height, String colour) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.colour = colour;
    }


    @Override
    public String toString() {
        return "Student Details:{name:"+ name
                +",age:"+ age
                +",height;"+ height
                +",colour:"+ colour +"}";


    }

    static void main(String[] args) {
        studentDetails details = new studentDetails("harsh",20,165,"white");
        System.out.println(details.toString());
    }
}
