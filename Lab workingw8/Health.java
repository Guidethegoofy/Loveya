public class Health {
    private String name;
    private double weight;
    private double height;
    private int age;
    private char gender;
    public Health(String n,double w,double h,int a,char g){
        name = n;
        weight = w;
        height = h;
        age = a;
        gender = g;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }
    public double calculateBMR(){
        if(gender=='B'){
            return 66+(13.7*weight)+(5*height)-(6.8*age);
        }else if(gender=='G'){
            return 665+(9.6*weight)+(1.8*height)-(4.7*age);
        }else{
            return 0;
        }
    }
    public Boolean isFat(){
        if(gender=='B'){
            return weight>height-100;
        }else if (gender=='G'){
            return weight>height-110;
        }else{
            return false;
        }
    }
    public void setValue(String n,double w,double h,int a,char g){
        name = n;
        weight = w;
        height = h;
        age = a;
        gender = g;
    }
}
