// Notes:
// Queues - abstract data type, FIFO -> first in, first out
// FUNCTIONS:
// enqueue() - adds item to end of the queue
// dequeue() - removes item at the front of the queue
// peek() - gets/access first item in front of the queue
// Ideally backed by a Linked List
// stacks - LIFO, last in first out

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(10);
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int games = 0;
        int newPlayer = 1; //to check uniqueness of player if it repeats a name
        int turn = 1;

        String[] valNames = {
                                "tenz",
                                "zekken",
                                "trent",
                                "f0rsakeN",
                                "d4v41",
                                "aspas",
                                "sacy",
                                "something",
                                "zellsis",
                                "johnqt"
        };

        System.out.println("Welcome to Valorant Matchmaking!");
        while (games < 10) {
            System.out.println("\n|[ TURN " + turn + " ]|");

            int x = rand.nextInt(7) + 1;
            System.out.println("Added " + x + " new player/s to queue");
            for (int i = 0; i < x; i++) {
                String randomName = valNames[rand.nextInt(valNames.length)] + "_" + newPlayer; //to recall uniqueness of player if it repeats a name^^
                queue.enqueue(new Player(randomName));
                newPlayer++;
            }

            while (queue.size() >= 5 && games < 10) {
                games++;
                System.out.println("\n|[ GAME NO." + games + " ]|");
                System.out.println("Players matched:");

                for (int i = 0; i < 5; i++) {
                    Player p = queue.dequeue();
                    System.out.println(p);
                }
            }

            System.out.println("--------------------------------");
            System.out.println("Current Queue [" + queue.size() + "]:");
            if (queue.size() == 0) {
                System.out.println("-Queue is empty");
            } else {
                queue.printQueue();
            }

            if (games >= 10) {
                break;
            }

            System.out.print("\nPress Enter to proceed to the next turn...");
            scanner.nextLine();
            System.out.println();

            turn++;
        }

        System.out.println("\n--------------------------------------");
        System.out.println("GAME OVER! Reached 10 games.");
        scanner.close();


    }

}