class Pen{
    String color;
    String type;    //ballpoint; gel
    public void write() {
        System.out.println("Writing sth...");
    }
    public void printColour() {
        System.out.println(this+" is "+this.color+" "+this.type+" pen");
    }
}
public class Oops {
    public static void main(String[] args) {
        Pen pen1= new Pen();
        pen1.color="blue";
        pen1.type="gel";

        Pen pen2= new Pen();
        pen2.color="black";
        pen2.type="ball-point";

        pen1.printColour();
        pen2.printColour();
    }
}
