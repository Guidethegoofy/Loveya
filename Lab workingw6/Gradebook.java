public class Gradebook {
    private String Gradebook;
    private String Ins;
    public Gradebook(String book,String nameIns){
        Gradebook = book;
        Ins = nameIns; 
    }
    public void setGradebook(String name){
        Gradebook = name;
    }
    public String getGradebook(){
        return Gradebook;
    }
    public void setInsname(String name){
        System.err.printf("changing instructor name to %s\n\n",name);
        Ins = name;
    }
    public String getInsname(){
        return Ins;
    }
    public void displayMessage(){
        System.out.printf( "Welcome to the grade book for\n%s\n",
        getGradebook() );
        System.out.printf("This course is presented by: %s\n\n",getInsname());
    }
}
