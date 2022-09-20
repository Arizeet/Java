import java.util.*;
public class LargestOf3 {
    public static void main(String[] args) {
        Scanner ob1 = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = ob1.nextInt();
        Scanner ob2 = new Scanner(System.in);
        System.out.println("Enter b: ");
        int b = ob2.nextInt();
        Scanner ob3 = new Scanner(System.in);
        System.out.println("Enter c: ");
        int c = ob3.nextInt();  
        int big = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("Largest among 3 nos is: "+big);
        ob1.close();ob2.close();ob3.close();
    }
}
