import java.util.Scanner;

public class testStudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentScore std1 = new StudentScore("Somchai", 30.5, 50.2);
        StudentScore std2 = new StudentScore("Joy", 80.8, 85.2);

        System.out.println("name : " + std1.getName() + " midterm score : " +
        std1.getMidtermScore() + " final score : " +
        std1.getFinalScore() + " average : " +
        std1.averageScore() + " grade : " +
        std1.grading());

        System.out.println("name : " + std2.getName() + " midterm score : " +
        std2.getMidtermScore() + " final score : " +
        std2.getFinalScore() + " average : " +
        std2.averageScore() + " grade : " +
        std2.grading());

        StudentScore[] students = new StudentScore[5];
        for(int i=0;i<students.length;i++){
            System.out.printf("Student%d\n",i+1);
            System.out.print("Enter name: ");
            String name = input.nextLine();
            System.out.print("Enter midtermScore: ");
            double mid = input.nextDouble();
            System.out.print("Enter finalScore: ");
            double f = input.nextDouble();
            input.nextLine();
            students[i] = new StudentScore(name,mid,f);
        }
        for(int i=0;i<students.length;i++){
            StudentScore S= students[i];
            System.out.println("name : " + S.getName()+"|" + " midterm score : " +
            S.getMidtermScore() +"|"+ " final score : " +
            S.getFinalScore() +"|"+ " average : " +
            S.averageScore()+"|" + " grade : " +
            S.grading());
        }
    }
}
