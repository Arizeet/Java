class MyException extends Exception {
    public MyException(String s){
        super(s);
    }
}
public class UserDefinedException{
    public static void main(String[] args) {
        try{
            throw new MyException("German");
        }
        catch(MyException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}
