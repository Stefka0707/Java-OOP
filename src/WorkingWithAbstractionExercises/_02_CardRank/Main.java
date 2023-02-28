package WorkingWithAbstractionExercises._02_CardRank;

enum CardRank{

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
public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks: ");
        //CardRank[] values = CardRank.values();
        for (CardRank value : CardRank.values()) {

            System.out.printf("Ordinal value: %d; Name value: %s%n", value.ordinal(),value.name());


        }

    }
}
