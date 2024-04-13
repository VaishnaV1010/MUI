class A
{
      static void abc()  
    {
        System.out.println("class A");
    }
}
class B extends A
{
      static void abc()
    {
        System.out.println("Welcome");
    }
     public static void main(String[] args)
    {
         B obj = new B();
         obj.abc();
    }
         

} 
     


