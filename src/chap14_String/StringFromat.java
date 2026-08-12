package chap14_String;

public class StringFromat {
    static void main(String[] args) {
        String name = "sandeep";
        int marks = 50;
        System.out.println("hey," +name+" your marks is : "+ marks  );
        System.out.printf("hey, %s your marks is :%d" ,name,marks);
    }
}
