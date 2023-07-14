public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertB(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
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

    public void insert(int data, int pos) {
        ListNode node = new ListNode(data);
        if (pos == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode prev = head;
            int count = 1;
            while (count < pos - 1) {
                prev = prev.next;
                count++;
            }
            ListNode curr = prev.next;
            prev.next = node;
            node.next = curr;
        }
    }

    public ListNode deleteF() {
        if (head == null) {
            return null;
        } else {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }
    }

    public ListNode deleteE() {
        if (head == null) {
            return null;
        } else {
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            return temp;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fouth = new ListNode(11);

        //connet them
        sll.head.next = second;
        second.next = third;
        third.next = fouth;

        //display
        sll.display();

        
        //insert at beginning
        // sll.insertB(7);
        // sll.insertB(2);
        // sll.insertB(9);
        // sll.display();
        
        // //length
        // System.out.println("The length of the SLL is: " + sll.length());

        //insert at end
        // sll.insertE(2);
        // sll.insertE(4);
        // sll.insertE(6);
        // sll.insertE(8);
        // sll.display();

        //insert at any pos
        // sll.insert(4, 1);
        // sll.insert(9, 2);
        // sll.insert(5, 3);
        // sll.insert(7, 1);

        //delete 1st
        // System.out.println("Deleted node:"+sll.deleteF().data);
        // sll.display();

        //delete last
        System.out.println("Deleted node: "+sll.deleteE().data);
        sll.display();
    }
}
