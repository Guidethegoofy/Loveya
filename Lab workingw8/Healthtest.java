import java.util.Scanner;

public class Healthtest {
    public static void main(String[] args) {
        int n = 1;
        Health[] konthai = new Health[n];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Enter gender: ");
            char gender = input.next().toUpperCase().charAt(0);
            while (gender!='B'&&gender!='G'){
                System.out.print("Enter gender: ");
                gender = input.next().toUpperCase().charAt(0);
            }
            System.out.print("Enter name: ");
            String name = input.next();
            System.out.print("Enter weight: ");
            double weight = input.nextDouble();
            System.out.print("Enter height: ");
            double height = input.nextDouble();
            System.out.print("Enter age: ");
            int age = input.nextInt();
            input.nextLine();
            konthai[i]= new Health(name, weight, height, age, gender);
        } 
        for(int i=0;i<konthai.length;i++){
            Health K = konthai[i];
            String uanmai;
            if(K.isFat()){
                uanmai = "Fat";
            }else{
                uanmai = "not Fat";
            }
            System.out.printf("Name: %s\nWeight: %.2f Height: %.2f\nAge: %d Gender: %c\nBMR= %.2f\nI nee %s",K.getName(),K.getWeight(),K.getHeight()
            ,K.getAge(),K.getGender(),K.calculateBMR(),uanmai);
        }
    }
}
