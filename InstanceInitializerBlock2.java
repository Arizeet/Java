class A{  
    A(){  
    System.out.println("parent class constructor invoked");  
    }  
    }  
      
    class InstanceInitializerBlock2 extends A{  
    InstanceInitializerBlock2(){  
    super();  
    System.out.println("child class constructor invoked");  
    }  
      
    InstanceInitializerBlock2(int a){  
    super();  
    System.out.println("child class constructor invoked "+a);  
    }  
      
    {System.out.println("instance initializer block is invoked");}  
      
    public static void main(String args[]){  
    InstanceInitializerBlock2 b1=new InstanceInitializerBlock2();  
    InstanceInitializerBlock2 b2=new InstanceInitializerBlock2(10);  
    }  
    }  