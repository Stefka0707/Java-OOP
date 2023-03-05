package EncapsulationExercise._03_ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> peopleMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new LinkedHashMap<>();
        String[] peopleInput = scanner.nextLine().split(";");

        for (String personData : peopleInput) {
            String[] personParts = personData.split("=");
            String name = personParts[0];
            double money = Double.parseDouble(personParts[1]);
            try {
                Person person = new Person(name, money);
                peopleMap.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        String[] productInput = scanner.nextLine().split(";");

        for (String productData : productInput) {
            String[] ProductParts = productData.split("=");
            String nameProduct = ProductParts[0];
            double costProduct = Double.parseDouble(ProductParts[1]);
            try {
                Product product = new Product(nameProduct, costProduct);
                productMap.put(nameProduct, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        String command = scanner.nextLine();
        while (!"End".equalsIgnoreCase(command)) {
            String[] commandParts = command.split(" ");
            String personName = commandParts[0];
            String productName = commandParts[1];
            Person buyer = peopleMap.get(personName);
            Product productToBuy = productMap.get(productName);
            try {
                buyer.buyProduct(productToBuy);
                System.out.printf("%s bought %s%n",personName,productName);
                 //peopleMap.get(personName).buyProduct(productMap.get(productName));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            command = scanner.nextLine();
        }
        for (Person product : peopleMap.values()) System.out.println(product);


    }


}

