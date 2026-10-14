public class PlayerLinkedList {
    private PlayerNode head;
    private PlayerNode tail;        // tracks end of doubly linked list
    private int size; // size variable needed

    public PlayerLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        if (head == null) {
            tail = playerNode;      // tail points to new node if list was empty
        } else {
            head.setPreviousPlayer(playerNode);         // links old head to new node
            playerNode.setNextPlayer(head);             // links new node to old head
        }

        head = playerNode;
        size++; //increment to automatically update size when adding
    }

    public PlayerNode removeFirst() {
        if (head == null) {
            return null;
        }
        PlayerNode removedNode = head; // saves reference to the current head

        if (head.getNextPlayer() == null) {
            tail = null;
        } else {
            head.getNextPlayer().setPreviousPlayer(null); // disconnects tail
        }

        head = head.getNextPlayer();         // moves the head to the next node
        removedNode.setNextPlayer(null);     // disconnects the removed node
        size--; //decrement to automatically update size when removing

        return removedNode;
    }

    public int getSize() {  //getter for size
        return size;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public boolean contains(Player player) {
        return indexOf(player) != -1;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getPlayer() == player) {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }
        return -1;
    }

}
