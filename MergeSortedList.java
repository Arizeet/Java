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
    
    public void display() {
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
    public static void main(String[] args) {
        MergeSortedList a = new MergeSortedList();
        a.head = new ListNode(1);
        ListNode a_second = new ListNode(3);
        ListNode a_third = new ListNode(6);
        //connect a
        a.head.next = a_second;
        a_second.next = a_third;

        MergeSortedList b = new MergeSortedList();
        b.head = new ListNode(2);
        ListNode b_second = new ListNode(4);
        ListNode b_third = new ListNode(5);
        //connect b
        b.head.next = b_second;
        b_second.next = b_third;

        //display
        a.display();
        b.display();
    }
}
