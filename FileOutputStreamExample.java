import java.io.FileOutputStream;
public class FileOutputStreamExample
{
    public static void main(String[] args) 
    {
        String s="Gurijala Vaishnav Reddy";
        try{
            FileOutputStream fout=new FileOutputStream("C:\\Users\\VAISHNAVREDDY\\Downloads\\DEMO\\Java\\abcd.txt");
            byte[] b=s.getBytes();
            fout.write(b);
            fout.flush();
            fout.close();
            System.out.println("Success...");

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}