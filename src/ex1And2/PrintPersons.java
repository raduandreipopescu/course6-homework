package ex1And2;

public class PrintPersons {
    public static void main(String[] args) {
        Person firstPerson = new Person("Matei", 58, false);
        Person secondPerson = new Person("Luca", 49, false);
        Person thirdPerson = new Person("Andrei", 33, true);

        System.out.println(firstPerson);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);
    }
}
