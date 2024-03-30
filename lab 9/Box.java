public class Box extends Rectangle{
    private double height;
    Box(){
        super.length=0;
        super.width=0;
        height = 0;
    }
    public Box(double l,double w ,double h){
        Setdimension(l, w, h);
    }
    public void Setdimension(double l,double w,double h){
        if (l >= 0){
            super.length=l;
        }else{
            super.length=0;
        }
        if(w >=0){
            super.width=w;
        }else{
            super.width=0;
        }
        if (h >=0){
            height=h;
        }else{
            height=0;
        }
    }
    public double getHeight() {
        return height;
    }
    public double area(){
        return 2 * (getLength() * getWidth()
        +getLength() * height +getWidth() * height); 
    }
    public double volume(){
        return super.area()*height;
    }
    public String toString() {
        return super.toString()+" Height = "+height;
    }
}
