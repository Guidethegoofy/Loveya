public class Employee {
    private String FirstName;
    private String lastName;
    private double Salary;
    public Employee(String fname,String lname,double salary){
        FirstName = fname;
        lastName = lname;
        Salary = salary;
    }
    public void setFname(String fname){
        FirstName = fname;
    }
    public void setlname(String lname){
        lastName = lname;
    }
    public void setsalary(double salary){
        if (salary < 0){
            Salary = 0;
        }else{
            Salary = salary;
        }
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getSalary() {
        return Salary;
    }
}
