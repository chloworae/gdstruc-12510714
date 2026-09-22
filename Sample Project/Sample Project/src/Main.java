
import java.util.Scanner;

void main() {
    // prints out hello world
    // System.out.println("Hello World");

    // gets user input
    Scanner scanner = new Scanner(System.in);

    // prints outs what is your name
    System.out.println("What is your name");
    String name = scanner.nextLine(); // creates name variable and goes to next line

    // prints out text variable
    System.out.println("Hello " + name);
}
