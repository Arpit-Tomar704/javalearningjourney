package in.equals;

public class EqualsAndHashCodeTest {
    static void main(String[] args) {
        Person person1 = new Person("Arpit",19,"110");
        Person person2 = new Person("Arpit",20,"110");
        if (person1.equals(person2)){
            System.out.println("Equals");
        }else {
            System.out.println("Not Equal");
        }

    }

}
