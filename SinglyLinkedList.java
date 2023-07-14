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

    public void display(ListNode head) {
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
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode curr = head;
            ListNode prev = null;
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            return curr;
        }
    }

    public ListNode delete(int pos) {
        if (pos == 1) {
            ListNode temp = head;
            head = head.next;
            return temp;
        } else {
            ListNode prev = head;
            int count = 1;
            while (count < pos - 1) {
                prev = prev.next;
                count++;
            }
            ListNode curr = prev.next;
            prev.next = curr.next;
            curr.next = null;
            return curr;
        }
    }

    public void search(int searchKey) {
        if (head == null) {
            System.out.println("No nodes in SLL");
            return;
        }
        ListNode temp = head;
        int count = 1;
        int flag = 0;
        System.out.print("Element " + searchKey + " found at pos: ");
        while (temp != null) {
            if (searchKey == temp.data) {
                System.out.print(count + " ");
                flag++;
            }
            temp = temp.next;
            count++;
        }
        if (flag == 0) {
            System.out.print("NA");
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(8);
        ListNode fouth = new ListNode(7);
        ListNode fifth = new ListNode(11);

        //connet them
        sll.head.next = second;
        second.next = third;
        third.next = fouth;
        fouth.next = fifth;

        //display
        sll.display(sll.head);

        
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
        // System.out.println("Deleted node: "+sll.deleteE().data);
        // sll.display();

        //delete at any position
        // System.out.println("Deleted node: "+sll.delete(3).data);
        // sll.display();

        //search
        // sll.search(2);
        
        //reverse
        // System.out.println("Reverse");
        // sll.display(sll.reverse(sll.head));

        //middle element
        
    }
}
