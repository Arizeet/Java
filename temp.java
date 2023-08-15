public class temp {
    public static void main(String[] args) {
        int a = 100;
        int sum = 0;
        for (int i = 1; i <=9; i++) {
            sum = sum + a;
            a = a * 3;
        }
        System.out.println(sum);
    }
}
