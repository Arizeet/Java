import java.util.*;;
public class Scan {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = ob.nextInt();
        System.out.println("Value= "+a);
        ob.close();
    }
}
