public class Rectangle {
    protected double length;
    protected double width;
    Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(double l,double w){
        setdimension(l, w);
    }
    public void setdimension(double l,double w){
        if (l >= 0){
            length=l;
        }else{
            length=0;
        }
        if(w >=0){
            width=w;
        }else{
            width=0;
        }
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double area(){
        return width*length;
    }
    public double perimeter(){
        return 2*length+2*width;
    }
    public String toString(){
        return ("Length = "+length+" Width = "+ width);
    }

}
