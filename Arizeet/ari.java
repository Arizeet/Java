import java.io.*;
import java.time.*;
import java.util.*;
public class ari {
    public static void main(String[] args) {
        // System.out.println("Folder inside Folder");
        // String g1 = "Hello";
        // String g2 = "HELLO";
        // String s = g1.substring(0,4);
        // System.out.println(s);
        // System.out.println(g2.equals(g1));
        // System.out.println(g2.equalsIgnoreCase(g1));
        // String greeting = "Hello"; //initialize greeting to a string
        // if (greeting == "Hello")
        //     System.out.println("True");// probably true
        // if (greeting.substring(0, 3) == "Hel")
        //     System.out.println("False");// probably false
        // if (greeting.compareTo("Hello") == 0)
        //     System.out.println("same");
        // String name = "Arizeet";
        // int age = 21;
        // Console cons = System.console();
        // String username = cons.readLine("User name: ");
        // char[] passwd = cons.readPassword("Password: ");
        // String message = String.format("My name is %s and I am %d yrs old", name, age);
        // System.out.println(message);
        // System.out.printf("%tc\n",new Date());
        // System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due date:", new Date());
        String[] a = new String[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int i=0;
        int arr[]=new int[10];
        for (int element : arr) {
            element=i++;
        }
        for (int element : arr) {
            System.out.print(element+" ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
