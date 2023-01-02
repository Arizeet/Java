class OuterClass{
    int x = 5;
    class InnerClass{
        int y = 2;
    }
}
public class OuterInnerClass {
    public static void main(String[] args) {
        OuterClass outObj = new OuterClass();
        OuterClass.InnerClass inObj = outObj.new InnerClass();
        System.out.println("x + y = "+(outObj.x+inObj.y));
    }
}
