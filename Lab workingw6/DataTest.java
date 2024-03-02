public class DataTest {
    public static void main(String[] args) {
        Data data = new Data(4,7,2004);
        System.out.print("The inital data is: ");
        data.displayeDate();
        data.setDay(11);
        data.setMonth(1);
        data.setYear(2003);
        System.out.print("\nDate with new values is: ");
        data.displayeDate();
        System.out.println("\n");
    }
}
