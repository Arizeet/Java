public class ResizeArray {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] original = new int[] { 1, 2, 3, 4 };
        System.out.println("Size of original array: " + original.length);
        original = resize(original, 10);
        System.out.println("Size of original array after resize: " + original.length);
        
    }
}
