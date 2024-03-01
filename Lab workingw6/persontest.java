public class persontest{
    public static void main( String args[] ){
        Person person = new Person( "John", "Smith", 19 );
        System.out.printf( "Created %s %s, age %d\n",person.getFirstName(), person.getLastName(), person.getAge() );
        int age = person.getAge() + 1;
        person.setAge(age);
        System.out.printf( "Happy Birthday to %s %s\n",person.getFirstName(), person.getLastName());
    } // end main
}
