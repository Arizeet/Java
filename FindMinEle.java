public class FindMinEle {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int MinEle(int[] arr) {
        if (arr.length == 0 || arr == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 3, 4, 9, 6, 8 };
        System.out.println("Min ele is: " + MinEle(arr));
    }
}
