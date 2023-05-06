 class A 
{
    public static void m1(){
        System.out.println("hi");
    }

}
 class B extends A
{
    public static void m1(String a){
        System.out.println("hii");
    }

}
 class C extends B
{
    public static void m1(String a){
        System.out.println("hiii");
    }

}
 class ABCDriver
{
    public static void main(String[] args)
    {
        // C b = new A();
        // b.m1();

        
        A b = new C();
        b.m1();
        
        // C c = new C();
        // c.m1();
        // // C b = new A();
        // b.m1();
        // C b = new A();
        // b.m1();
    }
}
