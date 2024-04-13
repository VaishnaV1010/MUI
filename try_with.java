import java.io.FileOutputStream;

public class try_with 
{
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\VAISHNAVREDDY\\Downloads\\DEMO\\Java\\abcd.txt");
            String msg="Welcome to College";
            byte byteArray[]=msg.getBytes();
            fileOutputStream.write(byteArray);

        }
            
        
    }
}
