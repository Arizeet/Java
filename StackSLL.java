import java.util.EmptyStackException;

public class StackSLL {
    private ListNode top;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            // this.next = null;
        }
    }
    
    StackSLL(){
        top = null;
        length=0;
    }

    int length() {
        return length;
    }

    boolean isEmpty() {
        return length == 0;
    }

    void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }
    
    int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
    
    public static void main(String[] args) {
        StackSLL stack = new StackSLL();
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }
}
