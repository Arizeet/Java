import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long count = 0;
            for (long i = 1; i <= n; i = i * 10) {
                count = count + n - i + 1;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
