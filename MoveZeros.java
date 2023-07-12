public class MoveZeros {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void moveZeros(int[] arr) {
        int j = 0;  //focuses on zero elements
        for (int i = 0; i < arr.length; i++) {  //focuses on non-zero elements
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        printArr(arr);
    }
    public static void main(String[] args) {
        int[] arr = { 3, 0, 9, 4, 6, 0, 6, 0, 5, 1 };
        moveZeros(arr);
    }
}
