public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee3 commissionEmployee = new CommissionEmployee3("Sue", "Jones", "222-22-2222", 10000, .06 );
        System.out.printf( "%s %s:\n\n%s\n\n","Call CommissionEmployee3's toString with superclass reference ",
        "to superclass object", commissionEmployee.toString());
        BasePlus basePlusCommissionEmployee =new BasePlus("Bob", "Lewis", "333-33-3333", 5000, .04, 300 ); 
        System.out.printf( "%s %s:\n\n%s\n\n","Call BasePlusCommissionEmployee's toString with subclass","reference to subclass object",basePlusCommissionEmployee.toString());
        CommissionEmployee3 commissionEmployee2 = basePlusCommissionEmployee;
        System.out.printf( "%s %s:\n\n%s\n","Call BasePlusCommissionEmployee's toString with superclass",
        "reference to subclass object", commissionEmployee2.toString() );
    }
}
