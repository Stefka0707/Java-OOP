package EncapsulationLab._01_SortByNameAndAge;


import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(reader.nextLine());

        List<Person_01> people = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] input = reader.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);

            Person_01 personToAdd = new Person_01(firstName, lastName, age);
            people.add(personToAdd);
        }

        Collections.sort(people, Comparator.comparing(Person_01::getFirstName).thenComparingInt(Person_01::getAge));
            //int comparisonResult = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

//            if (comparisonResult == 0) {
//                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
//            }
//            return comparisonResult;

        for (Person_01 person : people) {
            System.out.println(person.toString());

        }
    }
}
