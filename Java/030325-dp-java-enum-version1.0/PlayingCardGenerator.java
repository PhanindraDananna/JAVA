import java.util.Random;

public class PlayingCardGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int cardNumber = random.nextInt(52); // Generate a random number between 0-51

        Suit suit = Suit.getSuit(cardNumber);
        Rank rank = Rank.getRank(cardNumber % 13);

        System.out.println(rank + " of " + suit);
    }
}

// Enum for Card Suits
enum Suit {
    SPADES, HEARTS, CLUBS, DIAMONDS;

    public static Suit getSuit(int cardNumber) {
        if (cardNumber < 13) return SPADES;
        if (cardNumber < 26) return HEARTS;
        if (cardNumber < 39) return CLUBS;
        return DIAMONDS;
    }
}

// Enum for Card Ranks
enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

    public static Rank getRank(int rankNumber) {
        return values()[rankNumber]; // Maps 0-12 to corresponding ranks
    }

    @Override
    public String toString() {
        // Proper formatting (e.g., "Ace" instead of "ACE")
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
