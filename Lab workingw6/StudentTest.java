public class StudentTest{
    public static void main(String[] args){
        Student S1 = new Student();
        System.out.printf("\n%s %s \nScore1: %d \nScore2: %d \nScore3: %d \n",S1.getName(),S1.getSurname(),S1.getScore1(),S1.getScore2(),S1.getScore3());
        System.out.printf("Average Score: %.2f\n\n",S1.getAverage());
        System.out.println("New set Start - - - -");
        S1.setName("Tinnapat");
        S1.setSurname("Prem");
        S1.setScore1(100);
        S1.setScore2(100);
        S1.setScore3(100);
        System.out.println("New set loading - - - -");
        System.out.printf("\n%s %s \nScore1: %d \nScore2: %d \nScore3: %d \n",S1.getName(),S1.getSurname(),S1.getScore1(),S1.getScore2(),S1.getScore3());
        System.out.printf("Average Score: %.2f\n\n",S1.getAverage());
    }
}
