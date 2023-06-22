class Employee{
    int salary = 50000;
}

class programmer1 extends Employee{
    int bonus = 100;
}

public class tp {
    public static void main(String[] args){
        programmer1 p = new programmer1();
        System.out.println(p.bonus);
        System.out.println(p.salary);
    }
}
