package WorkingWithAbstractionExercises._01_CardSuite;

public class Main {
    enum CardSuits_1{
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }
    public static void main(String[] args) {
        System.out.println("Card Suits:");

        CardSuits_1[] values = CardSuits_1.values();
        for (CardSuits_1 value : values) {

            System.out.printf("Ordinal value: %d; Name value: %s%n", value.ordinal(),value.name());


        }
    }
}
