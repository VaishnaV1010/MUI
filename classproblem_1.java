public class classproblem_1 {
    


    int a=12;
    void abc()
    {
        System.out.println("abc");
    }
}
class B
{

    classproblem_1 a;
    void show()
    {
        a.abc();
        System.out.println("show");
    }
    public static void main(String[] args) {
        B obj=new B();
        obj.a=new classproblem_1();
        obj.show();
    }
}
