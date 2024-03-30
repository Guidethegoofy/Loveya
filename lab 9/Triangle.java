public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    Triangle(){
        super.setColor("white");
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }
    public Triangle(Double s1,double s2,double s3,String c){
        side1 = s1;
        side2 = s2;
        side3 = s3;
        super.setColor(c);
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public double getArea(){
        return 0.5*side1*side2;
    }
    public double getPerimeter(){
        return side1 +side2+side3;
    }
    public String toString() {
        return "Triangle: side1 = "+side1+" side2 = "+side2+" side3 = "+side3;
    }
}
