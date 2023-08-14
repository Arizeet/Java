import java.util.Scanner;

public class OccurInSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (c > 0) {
                if (a > b) {
                    System.out.println("NO");
                } else if ((b - a) % c == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else if (c < 0) {
                if (a < b) {
                    System.out.println("NO");
                } else if ((b - a) % c == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (a != b) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}
