public class StackArray {
    private int top;
    private int[] stack;

    StackArray(int capacity) {
        top = -1;
        stack = new int[capacity];
    }

    StackArray() {
        this(10);
    }
    
    void push(int data) {
        if (isFull()) {
            throw new RuntimeException("Stack is Full");
        }
        top++;
        stack[top] = data;
    }

    int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        int result = stack[top];
        top--;
        return result;
    }
    
    int peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        return stack[top];
    }

    void display() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        int temp = top;
        while (temp >=0) {
            System.out.print(stack[temp] + " ");
            temp--;
        }
    }
    boolean isFull() {
        return stack.length == top + 1;
    }
    
    int size() {
        return top + 1;
    }
    
    public static void main(String[] args) {
        StackArray arr = new StackArray(5);
        arr.push(2);
        arr.push(6);
        arr.push(3);
        arr.push(9);
        arr.push(8);
        arr.display();
        System.out.println("\nRemoved ele is: "+arr.pop());
        System.out.println("Top ele is: "+arr.peek());
    }
}
