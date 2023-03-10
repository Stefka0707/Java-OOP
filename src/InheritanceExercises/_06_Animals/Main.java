package InheritanceExercises._06_Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();
        while (!"Beast!".equals(animalType)) {
            String[] animalInfo = scanner.nextLine().split("\\s+");
            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];

            try {
                switch (animalType){
                    case "Cat":

                        Cat cat = new Cat(name,age,gender);
                        System.out.println(cat);
                        cat.produceSound();
                        break;
                    case "Frog":

                        Frog frog = new Frog(name,age,gender);
                        System.out.println(frog);
                        frog.produceSound();
                        break;
                    case "Dog":

                        Dog dog = new Dog(name,age,gender);
                        System.out.println(dog);
                        dog.produceSound();
                        break;
                    case "Kitten":

                        Kitten kittens = new Kitten(name,age);
                        System.out.println(kittens);
                        kittens.produceSound();
                        break;
                    case "Tomcat":

                        Tomcat tomcat = new Tomcat(name,age);
                        System.out.println(tomcat);
                        tomcat.produceSound();
                        break;
                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            animalType = scanner.nextLine();
        }
    }

}
