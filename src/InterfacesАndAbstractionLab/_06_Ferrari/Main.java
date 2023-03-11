package InterfacesАndAbstractionLab._06_Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String driverCar = new Scanner(System.in).nextLine();


        Car ferrari = new Ferrari(driverCar);
        System.out.println(ferrari);

    }

}
