import java.util.Enumeration;
import java.util.Stack;

public class stackop 
{
    public static void main(String[] args) 
    {
        Stack s=new Stack();
       s.push(30);
       s.push(50);
       s.push(70);
       s.push(60);
       s.pop();
       s.pop();
       System.out.println(s);
        Object o=s.peek();
        System.out.println(o);

        s.add(300);
        s.add(400);
        Enumeration e=s.elements();
        while (e.hasMoreElements()) 
        {
            System.out.println(e.nextElement());
        }
        
        
    }
}
Difference betweeen collection and collections?
Develop a program to perform serialization and Deserialization?
Why we need default and abstract methods?
Write a program to apppend String data into a File?
Write a program to clone an object using clonable Interface?
If equals() method is not there in StringBuffer than can i check the contents of string?
Practice programs : Even or odd ,prime numbers
Armstrong number : parlindrome numbers,perfect number ,fibonacci series
Practice opps
