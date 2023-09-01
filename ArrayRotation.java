public class ArrayRotation {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void reverse(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotate1(int[] arr, int d) {
        int temp[] = new int[d];
        int j = 0;
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < arr.length - d; i++) {
            arr[i] = arr[i + d];
        }
        for (int i = arr.length - d; i < arr.length; i++) {
            arr[i] = temp[j++];
        }
    }
    
    static void rotate2(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
    }

    static void rotate3(int[] arr, int d) {
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        // rotate1(arr, 2);
        // rotate2(arr, 3);
        rotate3(arr, 2);
        display(arr);
    }
}
