import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayTest {
    public static void main(String[] args) {
        int n = 1;
        int y = 2;
        Scanner input = new Scanner(System.in);
        Employee[] X = new Employee[y];
        for(int i=0;i<X.length;i++){
            System.out.printf("Employee%d\n",n);
            String fname = input.nextLine();
            String lname = input.nextLine();
            double salary = input.nextDouble();
            input.nextLine();
            X[i]= new Employee(fname, lname, salary);
            n++; 
        }
        for(int i=0;i<X.length;i++){
            Employee print = X[i];
            System.out.printf("Employee %d: %s %s; Yearly Salary: %.2f\n",i+1,print.getFirstName(),print.getLastName(),print.getSalary());
        }
        System.out.println("\nIncreasing employee salaries by 5%\n");
        for(int i=0;i<X.length;i++){
            Employee print = X[i];
            double x = print.getSalary();
            print.setsalary(x+x*5/100);
            System.out.printf("Employee %d: %s %s; Yearly Salary: %.2f\n",i+1,print.getFirstName(),print.getLastName(),print.getSalary());
        }
    }
}
