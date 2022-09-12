class Shapes{
    public void area() {
        System.out.println("Displays Area...");
    }
}
class Circle extends Shapes{
    public void area(int r) {
        System.out.println((3.14159)*r*r);
    }
}
class Triangle extends Shapes{
    public void area(int l,int h) {
        System.out.println((0.5)*l*h);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int b) {
        System.out.println(1.717/4*b*b);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area(7);
        Triangle t=new Triangle();
        t.area(10, 8);
        EquilateralTriangle eqt=new EquilateralTriangle();
        eqt.area(9);
    }
}
