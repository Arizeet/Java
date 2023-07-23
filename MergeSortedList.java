public class MergeSortedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static void display(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertE(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    public static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        }
        else {
            tail.next = a;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        MergeSortedList a = new MergeSortedList();
        a.head = new ListNode(1);
        a.insertE(4);
        a.insertE(6);
        a.insertE(10);

        MergeSortedList b = new MergeSortedList();
        b.head = new ListNode(2);
        b.insertE(3);
        b.insertE(7);
        b.insertE(9);
        b.insertE(11);
        b.insertE(19);

        //display
        display(a.head);
        display(b.head);
        System.out.println("After merging:");
        display(merge(a.head, b.head));

    }
}
