public class circle extends GeometricObject {
    private double radius;
    circle(){
        
        radius=0;
    }
    public circle(double r){
        radius = r;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public void print(){
        System.out.println("Radius = "+radius+" color : "+getColor()+" Area = "+getArea());
    }
}
