//Notes:
// push()- adds element, replaces as new "top" | add card ontop of your deck
// pop() - removes element, removing top element | draw a card (top most)
// peak() - access the top element
// TO ACCESS ELEMENT -> array - square brackets | list - get function, peek for STACK

public class Main {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();
       // ArrayStack stack = new ArrayStack(5);

        stack.push(new Player(1, "aceu", 100));
        stack.push(new Player(2, "zekken", 100));
        stack.push(new Player(3, "trent", 82));
        stack.push(new Player(4, "f0rsakeN", 40)); // last = top

        stack.printStack();

        System.out.println("\nPopping: " + stack.pop());
        stack.printStack();

    }

}
