class OuterClass{
    private int a;
    protected static int b = 10;
    OuterClass(int a){
        this.a= a;
    }
    void show(){
        final int c = 10;
        class InnerClass{
            private int b;
            InnerClass(int b){
                this.b=b;
            }
            void display(){
                System.out.println("a = "+a);
                System.out.println("b = "+b);
                System.out.println("c = "+c);
            }
        }
        InnerClass ob = new InnerClass(25);
        ob.display();
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        new OuterClass(67).show();
    }
}
