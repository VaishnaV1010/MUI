import java.util.*;

class whileloop
{
    public static void main(String[]args)
    {
        int i=1000;
        Scanner sc = new Scanner(System.in);
        
        while(i>0)
        {
            int penCount = sc.nextInt();
            if(penCount==2)
            {
                System.out.println("allow");
            }
            else{
                System.out.println("not allow");
            }

           

            if(i==5)
            {
                break;
            }
            i--;

        }
    }

}