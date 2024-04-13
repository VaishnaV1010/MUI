class A extends Thread
{
    public void run()
    {
        System.out.println("another Thread");

    }
    public static void main(String[]args)
        {
            
            A obj1=new A();
              //Thread obj2= new A();
             // Thread obj3= new Thread(new A());
            obj1.start();
            System.out.println(Thread.currentThread().getPriority());

        }
    

}


