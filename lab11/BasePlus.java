public class BasePlus extends CommissionEmployee3{
    private double Salary;
    public BasePlus(String f,String l, String ss,double s,double c,double salary){
        super(f,l,ss,s,c);
        Salary=salary;
    }
    public void setSalary(double salary) {
        Salary = (salary<0.0)?0.0:salary;
    }
    public double getSalary() {
        return Salary;
    }
    public double earnings(){
        return Salary+super.earnings();
    }
    public String toString() {
        return String.format( "%s %s\n%s: %.2f", "base-salaried",
    super.toString(), "base salary", getSalary()); 
    }
}
