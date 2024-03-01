import java.util.Scanner;

public class Rectangletest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 1;
        while(N<4){
            int w = input.nextInt();
            int h = input.nextInt();
            Rectangle rec = new Rectangle(w,h);
            System.out.printf("Rectangle%d :: width =%d height = %d\n",N,rec.getWidth(),rec.getHeight());
            System.out.printf("Area = %d\n",rec.area());
            System.out.printf("Perimeter = %d\n\n",rec.perimeter());
            N++;
        }
    }
}
