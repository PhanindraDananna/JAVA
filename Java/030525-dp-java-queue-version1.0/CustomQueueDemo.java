// Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class
class CustomQueue {
    private Node front, rear;

    public CustomQueue() {
        this.front = this.rear = null;
    }

    // Enqueue (Add an element to the queue)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue (Remove an element from the queue)
    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty!");
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    // Peek (View front element)
    public int peek() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty!");
        }
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Print the queue
    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Driver class
public class CustomQueueDemo {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Queue:");
        queue.printQueue();  // Output: 10 -> 20 -> 30 -> 40 -> null

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        System.out.println("Queue after dequeuing:");
        queue.printQueue();  // Output: 30 -> 40 -> null
    }
}
