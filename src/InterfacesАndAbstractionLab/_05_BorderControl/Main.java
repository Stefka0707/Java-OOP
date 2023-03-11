package InterfacesАndAbstractionLab._05_BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiableList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");

            Identifiable identifiable = tokens.length == 2
                    ? new Robot(tokens[1], tokens[0])
                    : new Citizen(tokens[2], Integer.parseInt(tokens[1]), tokens[0]);
            identifiableList.add(identifiable);


            input = scanner.nextLine();

        }
        String fakeIdPostFix = scanner.nextLine();
        identifiableList
                .stream()
                .map(Identifiable::getId)
                .filter(i -> i.endsWith(fakeIdPostFix))
                .forEach(System.out::println);
    }
}
