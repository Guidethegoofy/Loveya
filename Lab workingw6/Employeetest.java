import java.util.Scanner;

public class Employeetest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee("Bob", "jones", 34500);
        Employee employee2 = new Employee("Susan", "Baker", 37809);
        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary());
        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n\n",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary());
        System.out.println("Increasing employee salaries by 10%\n");
        double x = employee1.getSalary();
        double y = employee2.getSalary();
        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n",employee1.getFirstName(),employee1.getLastName(),x*10/100+x);
        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n\n",employee2.getFirstName(),employee2.getLastName(),y*10/100+y);
    }
}
