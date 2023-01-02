class OuterClass{
    private int a;
    OuterClass(int a){
        this.a=a;
    }
    void print(){
        System.out.println("a = "+a);
    }
    static class InnerClass{
        int b;
        InnerClass(int b){
            int c=b+10;
            this.b=c;
        }
        void show(){
            OuterClass ob = new OuterClass(10);
            ob.print();
            System.out.println("b = "+b);
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass obj = new OuterClass.InnerClass(100);
        obj.show();
    }
}
