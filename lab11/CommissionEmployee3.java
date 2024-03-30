public class CommissionEmployee3 {
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    private String firstname;
    public CommissionEmployee3(String f,String l, String ss,double s,double c){
        firstname=f;
        lastName=l;
        socialSecurityNumber=ss;
        grossSales=s;
        commissionRate=c;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setCommissionRate(double r) {
        this.commissionRate = (r>0.0&&r<1.0)?r:0.0;
    }
    public void setGrossSales(double s) {
        this.grossSales = (s<0)?0.0:s;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    public String getFirstname() {
        return firstname;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public double earnings(){
        return commissionRate*grossSales;
    }
    public String toString(){
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
           "commission employee", firstname, lastName,
        "social security number", socialSecurityNumber,
        "gross sales", grossSales,
        "commission rate", commissionRate );
    }
}
