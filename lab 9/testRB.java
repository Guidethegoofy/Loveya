public class testRB {
    public static void main(String[] args) {
        Rectangle Rec1 = new Rectangle(3,2);
        Box Box1 = new Box(2,3,4);
        System.out.println(Rec1);
        double AreaRec = Rec1.area();
        System.out.println("AreaRec = "+AreaRec); 
        System.out.println(Box1);
        double AreaBox = Box1.area();
        double VBox = Box1.volume();
        System.out.println("AreaBox = "+AreaBox);
        System.out.println("VBox = "+VBox);
    }
}
