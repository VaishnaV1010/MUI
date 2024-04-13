import java.io.Serializable;
import java.io.*;
public class Student implements Serializable 
{
    int id;
    String name;
    public Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }   
    
} 
class College{
    public static void main(String[] args) {
        try{
            Student s1= new Student(217, "Vaishnav");
            FileOutputStream fout=new FileOutputStream("C:\\Users\\VAISHNAVREDDY\\Downloads\\DEMO\\Java\\abcd.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Success...");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}