class CustomStack {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    public CustomStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = value;
    }

    // Pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    // Peek at the top element
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Print the stack
    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Driver class
public class CustomStackDemo {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.push(35);

        System.out.println("Stack:");
        stack.printStack();  // Output: 35 25 15 5

        System.out.println("Top Element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack after popping:");
        stack.printStack();  // Output: 15 5
    }
}
