public class testShape {
    public static void main(String[] args) {
        Circle c1 =new Circle();
        Square s1 = new Square();
        Sphere sp1= new Sphere();
        Cube cu1 = new Cube();
        Shape sh = new Shape();
        System.out.printf("%s\n%s\n%s\n%s\n%s",c1.toString(),s1.toString(),sp1.toString(),cu1.toString(),sh.toString());
    }
}
