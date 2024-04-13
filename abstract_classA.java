abstract class A {
    abstract void show();


    void print()
    {
        System.out.println("print();method");

    }
    abstract void display();
    
}
class Main extends A
{
    void show()
    {
        System.out.println("Welcome");
    }
    void display()
    {
        System.out.println("display();method");

    }
   public static void main(String[] args) 
   {
     A obj=new Main();
     obj.show();
     obj.display();
     obj.print();

    }
    
}
