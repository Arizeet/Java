class Students{
    String name;
    int age;
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Students(String name,int age){      //constructor with parameters
        System.out.println("Constructor Students called...");
        this.age=age;
        this.name=name;
    }
}
class Friend{
    String name;
    int age;
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Friend(){      //constructor without parameters
        System.out.println("Constructor Friend called...");
    }
}
class BestFriend{
    String name;
    int age;
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    BestFriend(Friend f1){      //copy constructor
        System.out.println("Constructor BestFriend called...");
        this.age=f1.age;
        this.name=f1.name;
    }
    BestFriend(){}
}
public class Oops2 {
    public static void main(String[] args) {
        Students s1= new Students("Arizeet",20);
        s1.printInfo();
        Friend f1=new Friend();
        f1.age=19;
        f1.name="Purvi";
        f1.printInfo();
        BestFriend bf=new BestFriend(f1);
        bf.printInfo();
    }
}
