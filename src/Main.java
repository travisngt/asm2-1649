import java.util.NoSuchElementException;
import java.util.Scanner;
import linkedlist.*;
import stack.Stack;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command (enqueue/dequeue/push/pop/exit):");
            String command = scanner.next();
            if (command.equals("enqueue")) {
                System.out.println("Enter message:");
                String message = scanner.next();
                queue.enqueue(message);
                System.out.println("Message \"" + message + "\" enqueued.");
            } else if (command.equals("dequeue")) {
                try {
                    String message = queue.dequeue();
                    System.out.println("Message \"" + message + "\" dequeued.");
                } catch (NoSuchElementException e) {
                    System.out.println("Queue is empty.");
                }
            } else if (command.equals("push")) {
                System.out.println("Enter message:");
                String message = scanner.next();
                stack.push(message);
                System.out.println("Message \"" + message + "\" pushed.");
            } else if (command.equals("pop")) {
                try {
                    String message = stack.pop();
                    System.out.println("Message \"" + message + "\" popped.");
                } catch (NoSuchElementException e) {
                    System.out.println("Stack is empty.");
                }
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}
