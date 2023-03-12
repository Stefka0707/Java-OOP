package InterfacesAndAbstractionExercises._03_BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Birthable> thingsWithBurtDay = new ArrayList<>();


        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] inputParts = input.split("\\s+");
            String typeToCreate = inputParts[0];
            switch (typeToCreate) {
                case "Citizen":
                    String citizenName = inputParts[1];
                    int age = Integer.parseInt(inputParts[2]);
                    String citizenId = inputParts[3];
                    String citizenBirthDate = inputParts[4];
                    Citizen citizen = new Citizen(citizenName, age, citizenId, citizenBirthDate);
                    //Birthable citizen = new Citizen(citizenName,age,citizenId,citizenBirthDate);
                    thingsWithBurtDay.add(citizen);
                    break;
                case "Pet":
                    String petName = inputParts[1];
                    String petBirthDate = inputParts[2];
                    Pet pet = new Pet(petName, petBirthDate);
                    // Birthable pet = new Pet(petName,petBirthDate);
                    thingsWithBurtDay.add(pet);
                    break;
                case "Robot":
                    break;
            }
            input = scanner.nextLine();
        }
        String year = scanner.nextLine();
        thingsWithBurtDay.stream().filter(s -> s.getBurtDate().endsWith(year))
                .forEach(s-> System.out.println(s.getBurtDate()));

//        for (Birthable birthable : thingsWithBurtDay) {
//            if (birthable.getBurtDate().endsWith(year)) {
//                System.out.println(birthable.getBurtDate());
//
//            }
//        }
        thingsWithBurtDay.stream()
                .map(Birthable::getBurtDate)
                .filter(burtDay ->burtDay.endsWith(year))
                .forEach(System.out::println);
    }
}