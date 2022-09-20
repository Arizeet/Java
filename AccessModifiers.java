class X{
    public static int a=1;
    private int b =2;
    int c=3;
    protected int d =4;
}
public class AccessModifiers {
    public static void main(String[] args) {
        X ob1= new X();
        X ob2= new X();
        X ob3 = new X();
        X ob4= new X();
        System.out.println(ob1.a);
    }
}
