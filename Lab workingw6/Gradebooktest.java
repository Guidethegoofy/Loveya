import java.util.Scanner;

public class Gradebooktest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gradebook gradebook = new Gradebook("886202 Programming Fundamental 2","Sam Smith");
        gradebook.displayMessage();
        gradebook.setInsname("Judy Jones");
        gradebook.displayMessage();

    }
}
