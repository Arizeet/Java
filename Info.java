import java.util.*;
public class Info {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = name.nextLine();
        Scanner address = new Scanner(System.in);
        System.out.println("Enter your address:");
        String userAddress = address.nextLine();
        System.out.println("Your Information");
        System.out.println("Name- "+userName+"\nAddress- "+userAddress);
        name.close();
        address.close();
    }
}
