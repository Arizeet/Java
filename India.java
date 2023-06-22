import java.util.*;
import java.sql.Struct;
import java.util.Scanner;
class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}
public class India {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        try{
            if(s.equalsIgnoreCase("India")){
                System.out.println("Matched");
            }
            else{
                throw new MyException(s);
            }
        }
        catch(MyException e){
            System.out.println("Not Matched");
        }
    }
}
