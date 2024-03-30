public class PartTimeEmployee extends Person{
    private double payRate;
    private double hoursWorked;
    PartTimeEmployee(){
        super.setName("None","None");
        payRate = 0;
        hoursWorked = 0;
    }
    public PartTimeEmployee(String f,String l,double p,double h){
        super(f, l);
        payRate=p;
        hoursWorked=h;
    }
    public String toString() {
        return super.toString()+"\npayRate = "+payRate+" hoursWorked = "+ hoursWorked+"\nCalculatePay = "+calculatePay();
    }
    public void setNameRateHours(String f,String l ,double p,double h){
        super.setName(f, l);
        payRate=p;
        hoursWorked=h;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double calculatePay(){
        return payRate*hoursWorked;
    }
    public void setRateAndHours(double r,double h){
        payRate=r;
        hoursWorked=h;
    }
    
}
