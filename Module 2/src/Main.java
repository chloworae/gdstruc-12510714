//Notes:
// Abstract data types -> doesn't dictate how data is organized, but can dictate operations we can perform
// declarations of functions we can use for lists
// ArrayList - list backed by an array | ArrayList() initial capacity of 10 - size 10, each element is placed in a continuous block
// have an idea of the spceified number the array is going to handle
// Linked lists -> first element is also the "Head", each element scattered around your memory
// each element is called a node, each node/element holds a reference to its next node/element
// Array list adds elements at the end, while Linked lists adds (and removes) at the front,  -> it doesn't matter how big the linked list is
// just switching the HEAD to the new node, then connect that new node to the next node
// before switching heads, always connect the new element to existing first
// how to know if were already at the end of our list -> if the next node of the last element is poiting to NULL

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<Player> playerList = new ArrayList<>();

//        playerList.add(new Player(1, "Asuna", 100));        // add element at end of an array
//        playerList.add(new Player(2, "Tenz", 240));
//        playerList.add(new Player(3, "Zekken", 42));

        Player asuna = new Player(1, "Asuna", 100);
        Player tenz = new Player(2, "Tenz", 240);
        Player zekken = new Player(3, "Zekken", 42);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(tenz);
        playerLinkedList.addToFront(zekken);        // last = element one, as new elements adds at front/at top

        playerLinkedList.printList();

        // System.out.println(playerList.get(1));      // get function | to accesss an element from the arraylist,REMEMBER STARTS AT 0 -> 0 = ELEMENT 1
//        playerList.add(2, new Player(5, "Trent", 36)); // insert an element at middle of an array
//        playerList.remove(2);       // remove an element from array list
//      System.out.println(playerList.contains(new Player(2, "Tenz", 240))); // can determine if array list contains specific player/element
//        System.out.println(playerList.indexOf(new Player(2, "Tenz", 240)));
        // java 8 foreach | advanced for loop
        //playerList.forEach(player -> System.out.println(player)); // list returns true if the list contains the specifiec element
//        for (Player p: playerList)
//        {
//            System.out.println(p);
//        }


    }
}
