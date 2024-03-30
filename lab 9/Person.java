public class Person {
    private String firstName;
    private String lastName;
    Person(){
        firstName="none";
        lastName="none";
    }
    public Person(String f,String l){
        firstName = f;
        lastName = l;
    }
    public String toString() {
        return firstName+" "+lastName;
    }
    public void setName(String f,String l){
        firstName=f;
        lastName=l;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
