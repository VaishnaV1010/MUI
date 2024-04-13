abstract class A
{
    static void abc()
    {
        System.out.println("Hello");
    }
    abstract void bcd();
    
}
abstract class B extends A
{
    abstract void bcd()
    static void abc()
    {
        System.out.println("Welcome");
    }
}
class C extends B
{
    void bcd()
    {
        System.out.println("hello");
    }
    public static void main(String[] args)
    {
        C obj = new C()
        obj.bcd();
    }
}