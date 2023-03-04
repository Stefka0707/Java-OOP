package EncapsulationLab._02_SalaryIncrese;

public class Person {
    private static double percentage;
    private int age;
    private String firstName;
    private String lastName;
    private  double salary;


    public Person(String firstName, String lastName, int age,double salary) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }
    public void increaseSalary(double percentage) {
        if (this.age > 30){
            this.salary = this.salary + this.salary * percentage/100;

        }else{

         this.salary =  this.salary = this.salary + this.salary * percentage/200;

        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
        return String.format("%s %s gets %f leva", firstName, lastName,salary);
    }

}

