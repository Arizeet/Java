class OuterClass{
    private int a;
    OuterClass(int a){
        this.a=a;
    }
    void print(){
        System.out.println("a= "+a);
    }
    class InnerClass{
        int b;
        InnerClass(int b){
            int c = b+10;
            this.b=c;
        }
        void show(){
            print();
            System.out.println("b = "+b);
        }
    }
}
public class NonStaticInnerClass {
    public static void main(String[] args) {
        OuterClass ob = new OuterClass(40);
        OuterClass.InnerClass obj = ob.new InnerClass(100);
        obj.show();
    }
}
