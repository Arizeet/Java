class OuterClass{
    void display(){
        System.out.println("Hello There");
    }
}
class InnerClass{
    void  create(){
        OuterClass ob = new OuterClass(){
            void display(){
                System.out.println("This is anonymous Inner class");
            }
        };
    }
    ob.display();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        obj.create();
    }
}
