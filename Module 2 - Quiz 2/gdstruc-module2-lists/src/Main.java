import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1, "Asuna", 100);
        Player tenz = new Player(2, "Tenz", 240);
        Player zekken = new Player(3, "Zekken", 42);
        Player forsaken = new Player(4, "f0rsakeN", 0);
        Player johnqt = new Player(5, "JohnQT", 25);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(tenz);
        playerLinkedList.addToFront(zekken);
        playerLinkedList.addToFront(forsaken);
        playerLinkedList.addToFront(johnqt);    // last = element one, as new elements adds at front/at top

        //function to determine if list contains a specific element
        System.out.println("Found element [Tenz]? " + playerLinkedList.contains(tenz));

        System.out.println("\nVal Players: " + playerLinkedList.getSize());   // calls getSize to display size of list
        playerLinkedList.printList();
        System.out.println("\nIndex of Zekken Before: " + playerLinkedList.indexOf(zekken));         //function to determin index before removing an element

        //function that Removes the first element
        playerLinkedList.removeFirst();

        System.out.println("\nVal Players After: " + playerLinkedList.getSize()); // displays size of list after removing first element
        playerLinkedList.printList();

        //function to determin index after removing an element
        System.out.println("\nIndex of Zekken Now: " + playerLinkedList.indexOf(zekken));

    }

}