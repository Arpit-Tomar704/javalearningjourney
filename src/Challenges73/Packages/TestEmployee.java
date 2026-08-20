package Challenges73.Packages;

public class TestEmployee {
    static void main(String[] args) {
        Employee emp = new Employee("Arpit",19,80000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Ansh");
        System.out.println(emp.getEmployeeDetails());
    }
}
