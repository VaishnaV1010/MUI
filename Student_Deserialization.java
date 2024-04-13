import java.io.*;  
class Student_Deserialization
{
 public static void main(String args[]){  
  try{ 
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\VAISHNAVREDDY\\Downloads\\DEMO\\Java\\abcd.txt"));  
  Student s=(Student)in.readObject();    
  System.out.println(s.id+" "+s.name);  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}  
