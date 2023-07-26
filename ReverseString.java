import java.util.Stack;

public class ReverseString {
    static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }
        for (int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "Arizeet";
        String result = reverse(str);
        System.out.println(result);
    }
}
