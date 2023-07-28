import java.util.NoSuchElementException;

public class QueueSLL {
    private ListNode front;
    private ListNode rear;
    private int length;

    public QueueSLL() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }
    
    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    int length() {
        return length;
    }

    boolean isEmpty() {
        return length == 0;
    }

    void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is already empty");
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        return result;
    }

    void display() {
        if (isEmpty()) {
            return;
        }
        ListNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    int first() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is already empty");
        }
        return front.data;
    }

    int last() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is already empty");
        }
        return rear.data;
    }
    
    public static void main(String[] args) {
        QueueSLL queue = new QueueSLL();
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(7);
        queue.display();
        queue.dequeue();
        System.out.println("After dequeue");
        queue.display();
    }
}
