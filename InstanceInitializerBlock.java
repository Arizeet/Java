class A {
    A() {
        System.out.println("parent class constructor invoked");
    }
}

class InstanceInitializerBlock extends A {
    InstanceInitializerBlock() {
        // super();
        System.out.println("child class constructor invoked");
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]) {
        InstanceInitializerBlock b = new InstanceInitializerBlock();
    }
}