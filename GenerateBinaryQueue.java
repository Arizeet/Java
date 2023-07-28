import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryQueue {
    String[] generate(int n) {
        Queue<String> q = new LinkedList<>();
        String[] result = new String[n];
        q.offer("1");
        for (int i = 0; i < n; i++) {
            result[i] = q.poll();
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            q.offer(s1);
            q.offer(s2);
        }
        return result;
    }

    void display(String[] arr) {
        for (String str : arr) {
            System.out.print(str+" ");
        }
    }
    
    public static void main(String[] args) {
        GenerateBinaryQueue ob = new GenerateBinaryQueue();
        ob.display(ob.generate(4));
    }
}
