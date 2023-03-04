package EncapsulationLab._01_SortByNameAndAge;

public class Person_01 {
    private int age;
    private String firstName;
    private String lastName;


    public Person_01(String firstName, String lastName, int age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", firstName, lastName, age);
    }

}
