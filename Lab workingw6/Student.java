public class Student {
    private String name;
    private String surname;
    private int score1;
    private int score2;
    private int score3;
    public Student(){
        name = "tin";
        surname = "pat";
        score1 = 31;
        score2 = 50;
        score3 = 21;
    }
    public void setName(String n) {
        name = n;
    }
    public void setSurname(String sn) {
        surname = sn;
    }
    public void setScore1(int score1) {
        this.score1 = score1;
    }
    public void setScore2(int score2) {
        this.score2 = score2;
    }
    public void setScore3(int score3) {
        this.score3 = score3;
    }
    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getScore1() {
        return score1;
    }
    public int getScore2() {
        return score2;
    }
    public int getScore3() {
        return score3;
    }
    public double getAverage(){
        return (score1+score2+score3)/3;
    }
    
}
