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
        System.out.println("class B");
    }
     public static void main(String[] args)
    {
        A obj = new A();
         obj.abc();
    }
         

} 
     
