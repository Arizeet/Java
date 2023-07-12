public class Palindrome {
    public static boolean isPalindrome(String word) {
        char[] charArr = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (charArr[start] != charArr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String word = "mada";
        System.out.println(word + " is " + (isPalindrome(word) ? "" : "not") + " a palindrome");
    }
}
