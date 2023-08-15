import java.util.Scanner;

public class MinDistinctInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int num = sc.nextInt();
            for (int i = num + 1; i < 9999; i++) {
                int j = i;
                int a = j % 10;
                j = j / 10;
                int b = j % 10;
                j = j / 10;
                int c = j % 10;
                j = j / 10;
                int d = j % 10;
                if (a != b && a != c && a != d && b != c && b != d && c != d) {
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}
