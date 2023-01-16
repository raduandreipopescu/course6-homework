package ex1And2;

public class Person {
    private String name;
    private int age;
    private boolean married;

    Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    @Override
    public String toString() {
        if (this.isMarried()) {
            return "This persons is %s, who is %d years old and is married.".formatted(this.name, this.age);
        } else {
            return "This persons is %s, who is %d years old and is not married.".formatted(this.name, this.age);
        }
    }
}
