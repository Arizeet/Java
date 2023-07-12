public class MissingNum {
    public static int findMissingNum(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 4, 3, 9, 6, 7 };
        System.out.println("The missing num is: "+findMissingNum(arr));
    }
}
