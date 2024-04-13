@FunctionalInterface
interface FuncInterface
{
    public void dragon_Ball();
    
}
public class FuncInter
{
    public static void main (String[] args)
    {
        FuncInterface fi=new FuncInterface()
        {
            public void dragon_Ball()
            {
                System.out.println("GOKU"+" "+"(Aka)");
            }
        };
        FuncInterface f1 =()->
        {
            System.out.println("KAKAROT");
        };


        fi.dragon_Ball();
        f1.dragon_Ball();
    }
    
}
~