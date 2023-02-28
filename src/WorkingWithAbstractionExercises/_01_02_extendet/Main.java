package WorkingWithAbstractionExercises._01_02_extendet;

import java.util.Scanner;

public class Main {
    enum CardRank {

        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }

    enum CardSuits_1 {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }
    static <E extends Enum<E>>  void printEnumOrdinalsAndNames(Enum <E> [] values){
        for (Enum<E>value : values) {

            System.out.printf("Ordinal value: %d; Name value: %s%n", value.ordinal(),value.name());


        }
    }

    public static void main(String[] args) {
       String  command = new Scanner(System.in).nextLine();
        System.out.println(command + ":");

if (command.equals("Card Suits")){
        printEnumOrdinalsAndNames(CardSuits_1.values());

}else if (command.equals("Card Ranks")){
    printEnumOrdinalsAndNames(CardRank.values());
}

    }
}
