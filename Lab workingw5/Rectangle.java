public class Rectangle {
    private int area;
    private int perimeter;
    private int width;
    private int height;
    public Rectangle(int w,int h){
        width = w;
        height = h;
    }
    public int area(){
        return width*height;
    }
    public int perimeter(){
        return width*2+height*2;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}
