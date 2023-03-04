package EncapsulationLab._02_SalaryIncrese;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);

            Person personToAdd = new Person(firstName, lastName, age,salary);
            people.add(personToAdd);
        }
        double bonus = Double.parseDouble(scanner.nextLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person);
        }

       // Collections.sort(people, Comparator.comparing(Person::getFirstName).thenComparingInt(Person::getAge));
        //int comparisonResult = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

//            if (comparisonResult == 0) {
//                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
//            }
//            return comparisonResult;

//        for (Person person : people) {
//            System.out.println(person.toString());
//
//        }
    }


}

