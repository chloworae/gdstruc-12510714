import java.util.Random;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        CardStack playerDeck = new CardStack();
        CardStack discardedPile = new CardStack();
        CardStack cardDraw =  new CardStack();

        playerDeck.push(new Card("Hush"));
        playerDeck.push(new Card("Miks"));
        playerDeck.push(new Card("Veto"));
        playerDeck.push(new Card("Waylay"));
        playerDeck.push(new Card("Tejo"));
        playerDeck.push(new Card("Vyse"));
        playerDeck.push(new Card("Clove"));
        playerDeck.push(new Card("Iso"));
        playerDeck.push(new Card("Deadlock"));
        playerDeck.push(new Card("Gekko"));
        playerDeck.push(new Card("Harbor"));
        playerDeck.push(new Card("Fade"));
        playerDeck.push(new Card("Neon"));
        playerDeck.push(new Card("Chamber"));
        playerDeck.push(new Card("KAY/O"));
        playerDeck.push(new Card("Astra"));
        playerDeck.push(new Card("Yoru"));
        playerDeck.push(new Card("Skye"));
        playerDeck.push(new Card("Breach"));
        playerDeck.push(new Card("Raze"));
        playerDeck.push(new Card("Reyna"));
        playerDeck.push(new Card("Jett"));
        playerDeck.push(new Card("Phoenix"));
        playerDeck.push(new Card("Sage"));
        playerDeck.push(new Card("Sova"));
        playerDeck.push(new Card("Cypher"));
        playerDeck.push(new Card("Killjoy"));
        playerDeck.push(new Card("Omen"));
        playerDeck.push(new Card("Viper"));
        playerDeck.push(new Card("Brimstone"));

        System.out.println("|[Agents of Valorant | A Card Deck]|\n");

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int turn = 1;

        while (!playerDeck.isEmpty())
        {
            System.out.println("|[ TURN " + turn + " ]|");
            int command = rand.nextInt(3);
            int x = rand.nextInt(5) + 1;

            switch (command) {
                case 0:
                    System.out.println("Chosen Random Command: Draw " + x + " card/s");
                    for (int i = 0; i < x; i++) {
                        if (!playerDeck.isEmpty()) {

                            Card drawnCard = playerDeck.peek();
                            cardDraw.push(playerDeck.pop());
                        }
                    }
                    break;

                case 1:
                    System.out.println("Chosen Random Command: Discard " + x + " card/s");
                    for (int i = 0; i < x; i++) {
                        if (!cardDraw.isEmpty()) {
                            discardedPile.push(cardDraw.pop());
                        }

                    }
                    break;

                case 2:
                    System.out.println("Chosen Random Command: Get " + x + " cards from discarded pile");
                    for (int i = 0; i < x; i++) {
                        if (!discardedPile.isEmpty()) {
                            cardDraw.push(discardedPile.pop());
                        }
                    }
                    break;
            }

            cardDraw.printStack();
            System.out.println("-----------------------------------------");
            System.out.println("No. of remaining cards in player deck: " + playerDeck.size());
            System.out.println("No. of discarded cards: " + discardedPile.size());

            if (playerDeck.isEmpty()) {
                break;
            }

            // Ask user for input to continue to the next turn
            System.out.print("\nProceed to the next turn? yes|no: ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                System.out.println("Surrendered!");
                break;
            }

            System.out.println();
            turn++;

        }

        System.out.println("\nAttackers Win! Game Over");
        scanner.close();

    }
}