package stack;

import linkedlist.Node;

import java.util.NoSuchElementException;

public class Stack {
    Node top;
    int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public String pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        String data = top.data;
        top = top.next;
        size--;
        return data;
    }
}
