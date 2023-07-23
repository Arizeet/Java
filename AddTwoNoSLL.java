public class AddTwoNoSLL {
    private ListNode head;

    private static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }   
    }

    public void insertE(int val) {
        if (head == null) {
            ListNode newNode = new ListNode(val);
            head = newNode;
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static ListNode add(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (a != null || b != null) {
            int x = (a != null) ? a.val : 0;
            int y = (b != null) ? b.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (a != null)
            a = a.next;
            if (b != null)
            b = b.next;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
            tail = tail.next;
        }
        return dummy.next;
    }
    
    public static void main(String[] args) {
        AddTwoNoSLL a = new AddTwoNoSLL();
        a.head = new ListNode(2);
        a.insertE(8);
        a.insertE(7);
        a.insertE(3);
        display(a.head);

        AddTwoNoSLL b = new AddTwoNoSLL();
        b.head = new ListNode(3);
        b.insertE(4);
        b.insertE(1);
        b.insertE(9);
        display(b.head);

        System.out.println("After adding:");
        display(add(a.head, b.head));
    }
}
