class laptop {
    String name="Dell";
    int modelNo=5430;
    static String oS="Windows";


    public void show()
    {
        System.out.println(name +":"+modelNo+":"+oS);
    }
    
}
public class ProblemAbcd
{
    public static void main(String[] args) {
        laptop obj1=new laptop();
        obj1.name="Dell";
        obj1.modelNo=1234;
        laptop.oS="Windows";

        laptop obj2=new laptop();
        obj2.name="HP";
        obj2.modelNo=35636;
        laptop.oS="Windows";

        laptop obj3=new laptop();
        obj3.name="sus";
        obj3.modelNo=37979;
        laptop.oS="Windows";

        obj1.show();
        obj2.show();
        obj3.show();


    }
}
