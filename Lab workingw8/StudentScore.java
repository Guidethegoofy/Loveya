public class StudentScore {
    private String name;
    private double midtermScore;
    private double finalScore;
    public StudentScore(String n,double m,double f){
        name = n;
        midtermScore = m;
        finalScore = f;
    }
    public String getName() {
        return name;
    }
    public double getMidtermScore() {
        return midtermScore;
    }
    public double getFinalScore() {
        return finalScore;
    }
    public double averageScore(){
        return (midtermScore+finalScore)/2;
    }
    public char grading(){
        if(averageScore()>80){
            return 'A';
        }else if(averageScore()>70){
            return 'B';
        }else if(averageScore()>60){
            return 'C';
        }else if(averageScore()>50){
            return 'D';
        }else if(averageScore()<=50&&averageScore()>=0){
            return 'F';
        }else{
            return 'W';
        }
    }
}
