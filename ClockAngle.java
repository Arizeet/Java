import java.util.Scanner;

public class ClockAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            double hA = (h % 12) * 30 + 0.5 * m;
            double mA = 6 * m;
            System.out.println(Math.abs(mA - hA) > 180 ? (360 - (int) Math.abs(mA - hA)) : (int) Math.abs(mA - hA));
        }
        sc.close();
    }
}
