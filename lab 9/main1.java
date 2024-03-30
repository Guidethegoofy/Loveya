public class main1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4.0,2,4,"yellow");
        System.out.println(t1.toString());
        System.out.println("Area = "+t1.getArea());
        t1.print();
    }
}
