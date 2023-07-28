public class QueueSLL {
    private ListNode front;
    private ListNode rear;
    private int length;

    public QueueSLL() {
        this.front = null;
        this.rear = null;
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

    void dequeue() {
        front = front.next;
        length--;
    }

    void display() {
        ListNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
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
