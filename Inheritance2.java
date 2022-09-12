class Animal{
    public void eat() {
        System.out.println("I am eating");
    }
}
class Dog extends Animal{

}
public class Inheritance2 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
    }
}
