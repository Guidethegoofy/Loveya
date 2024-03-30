public class testPartTimeEmployee {
    public static void main(String[] args) {
        PartTimeEmployee p1= new PartTimeEmployee();
        p1.setNameRateHours("Somchai","Jaidee", 20, 5);
        p1.calculatePay();
        System.out.println(p1);
        PartTimeEmployee p2 = new PartTimeEmployee("Harry", "Porter", 100, 5);
        p2.calculatePay();
        System.out.println(p2); 
        p2.setHoursWorked(20);
        p2.calculatePay();
        System.out.println(p2);

        p1.setPayRate(100);
        p1.setHoursWorked(3);
        System.out.println(p1);

        PartTimeEmployee p3 = new PartTimeEmployee("Somsak", "Seesai ", 0, 0);
        p3.setLastName("SeeSaArd ");
        p3.setRateAndHours(35, 12);
        System.out.println(p3);
    }
}
