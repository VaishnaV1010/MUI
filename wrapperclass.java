public class wrapperclass {
    private int i;
    wrapperclass(){}
    wrapperclass(int i)
    {
        this.i=i;
    }
    public int getValue()
    {
        return i;
    }
    public void setValue(int i)
    {
        this.i=i;
    }
    @Override
    public String toString()
    {
        return Integer.toString(i);
    }
}
public class Test
{
    public static void main(String[] args) {
        wrapperclass j=new wrapperclass(10);
        System.out.println(j.toString());
    }
}