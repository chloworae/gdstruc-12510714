import java.util.EmptyStackException;
// make sure TOP is always empty

public class ArrayStack {
    private Player[] stack;
    private int top;

    public ArrayStack(int capacity)
    {
        stack = new Player[capacity];
    }

    public void push(Player player)
    {
        if (top == stack.length) // stack is full, resizing array if full
        {
            Player[] newStack = new Player[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = player; // top element will be the new player added
    }

    public Player pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Player poppedPlayer = stack[--top];
        stack[top] = null;
        return poppedPlayer;
    }

    public Player peek() //top value should always be next available slot/position
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top - 1]; // we dont remove, we just access
    }

    public boolean isEmpty() { return top == 0;}

    public void printStack()
    {
        System.out.println("Printing stack: ");
        for (int i = top - 1; i >= 0; i-- ) // printing stack from top to bottom (top - 1)
        {
            System.out.println(stack[i]);
        }
    }

}
