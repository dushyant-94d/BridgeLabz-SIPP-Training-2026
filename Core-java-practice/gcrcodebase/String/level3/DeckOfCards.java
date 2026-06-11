import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize deck
    static String[] initializeDeck() {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"
        };

        int numOfCards = suits.length * ranks.length;

        String[] deck = new String[numOfCards];

        int index = 0;

        for (int i = 0; i < suits.length; i++) {

            for (int j = 0; j < ranks.length; j++) {

                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }

        return deck;
    }

    // Method to shuffle deck
    static void shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCardNumber =
                    i + (int)(Math.random() * (n - i));

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards
    static String[][] distributeCards(String[] deck,
                                      int players,
                                      int cardsPerPlayer) {

        if (players * cardsPerPlayer > deck.length) {

            System.out.println(
                    "Not enough cards to distribute!");

            return null;
        }

        String[][] playerCards =
                new String[players][cardsPerPlayer];

        int cardIndex = 0;

        for (int i = 0; i < players; i++) {

            for (int j = 0; j < cardsPerPlayer; j++) {

                playerCards[i][j] = deck[cardIndex++];
            }
        }

        return playerCards;
    }

    // Method to print players and cards
    static void printPlayersCards(String[][] playerCards) {

        if (playerCards == null)
            return;

        System.out.println("\n===== Cards Distribution =====");

        for (int i = 0; i < playerCards.length; i++) {

            System.out.println("\nPlayer " + (i + 1) + ":");

            for (int j = 0; j < playerCards[i].length; j++) {

                System.out.println(playerCards[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize Deck
        String[] deck = initializeDeck();

        // Shuffle Deck
        shuffleDeck(deck);

        System.out.print("Enter Number of Players: ");
        int players = sc.nextInt();

        System.out.print("Enter Number of Cards Per Player: ");
        int cardsPerPlayer = sc.nextInt();

        // Distribute Cards
        String[][] playerCards =
                distributeCards(deck, players, cardsPerPlayer);

        // Display Cards
        printPlayersCards(playerCards);
    }
}