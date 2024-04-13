public class A {
    int a=10;
    void add(int[]arr)
    {
        int sum =0;
        for (int a:arr)
        {
            sum=sum+a;
        }
    }
}
public static void main(String[]args)
{
    int arr[]={1,2,3,4,5};
    A obj =new A();
    System.out.println(obj.a); 
    System.out.println(new A().a);



}