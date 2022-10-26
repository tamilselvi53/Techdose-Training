class Stack {
    int size;
    int[] stack;
    int top;
    int minElement;
    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    boolean isFull() {
        return top == size - 1;
    }
    boolean isEmpty() {
        return top == -1;
    }
    void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else if (isEmpty()) {
            minElement = val;
            stack[++top] = val;
        } else if (val < minElement) {
            stack[++top] = 2 * val - minElement;
            minElement = val;
        } else {
            stack[++top] = val;
        }
    }
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else if (peek() < minElement) {
            minElement = 2 * minElement - peek();
        }
        return stack[top--];
    }
    int peek() {
        return stack[top];
    }
    int getMin() {
        return minElement;
    }
}

//Main function
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Stack s = new Stack(10);
	    s.push(6);
	    s.push(4);
	    s.push(8);
	    s.pop();
	    System.out.println(s.getMin());
	    s.push(0);
	    System.out.println(s.getMin());
	    s.pop();
	    System.out.println(s.getMin());
	}
}
