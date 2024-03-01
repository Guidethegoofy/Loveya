import java.util.Scanner;
public class AccoutW5test {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("Enter account1: ");
        double a1 = input.nextDouble();
        AccoutW5 accout1 = new AccoutW5(a1); // 
        System.out.printf( "account1 balance: $%.2f\n", accout1.getBalance() );
        double creditAmount; 
        System.out.print( "Enter credit amount for account1: $" );
        creditAmount = input.nextDouble();
        System.out.printf( "Adding $%.2f to account1 balance\n", creditAmount);
        accout1.credit(creditAmount);
        System.out.printf( "account1 balance: $%.2f\n\n", accout1.getBalance() );
        double withdrawalAmount;
        System.out.print( "Enter withdrawal amount for account1: $");
        withdrawalAmount = input.nextDouble();
        accout1.withdrawal(withdrawalAmount);
        System.out.printf( "account1 balance: $%.2f\n\n", accout1.getBalance() );

        System.out.print("Enter account2: ");
        double a2 = input.nextDouble();
        AccoutW5 accout2 = new AccoutW5(a2);
        System.out.printf( "account2 balance: $%.2f\n", accout2.getBalance() );
        System.out.printf( "Enter withdrawal amount for account2: $%.2f\n",withdrawalAmount);
        accout2.withdrawal(withdrawalAmount);
        System.out.printf( "account2 balance: $%.2f\n\n", accout2.getBalance() );

        System.out.print("Enter account3: 1000\n");
        AccoutW5 accout3 = new AccoutW5(1000);
        double creditAmount1 = 500;
        System.out.printf( "Adding $%.2f to account3 balance\n", creditAmount1);
        accout3.credit(creditAmount1);
        double creditAmount2 = 150;
        System.out.printf( "Adding $%.2f to account3 balance\n", creditAmount2);
        accout3.credit(creditAmount2);
        double withdrawalAmount1 = 800;
        System.out.printf( "Enter withdrawal amount for account3: $%.2f\n",withdrawalAmount1);
        accout3.withdrawal(withdrawalAmount1);
        System.out.printf( "account3 balance: $%.2f\n\n", accout3.getBalance() );


    }
}
