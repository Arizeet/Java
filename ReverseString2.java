public class ReverseString2 {

    public static String reverseWord(String str)
    {
        // Reverse the string str
        char[] arr = str.toCharArray();
        int start = 0;
        int end = str.length()-1;
        char temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str = "Arizeet";
        System.out.println(reverseWord(str));
    }
}
