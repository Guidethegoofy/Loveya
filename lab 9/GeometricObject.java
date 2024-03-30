public class GeometricObject {
    private String color;
    GeometricObject(){
        color = "White";
    }
    public GeometricObject(String color){
        this.color=color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void print(){
        System.out.println("Color : "+color);
    }
}
