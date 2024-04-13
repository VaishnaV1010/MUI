abstract class A
{
    abstract void show();
   
    abstract void give();
   
    void print()
    {
        System.out.println("print() method");
    }
}

class Main extends A
{
     void show()
    {
        System.out.println("show() method");
    }
     
     abstract void give();
}


class D extends Main
{
                   void give()
                  {
                       System.out.println("give() method");
                   }      
    void display()
    {
        System.out.println("display() method");
    }
    public static void main(String[] args)
    {
        D obj = new D();
        obj.show();
        obj.display();
        obj.print();
       
    }
}