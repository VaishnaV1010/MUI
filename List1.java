import java.util.*;
public class List1
{
    public static void main(String[] args) 
    {
        ArrayList ar =new ArrayList();
        ar.add(12);
        ar.add("Inno");
        ar.add("B");
        ar.add(25.5);
        System.out.println(ar);
        ArrayList ar2 =new ArrayList();
        ar2.add(10);
        ar2.add(12);
        ar2.add(16);
        System.out.println(ar2);
        ar.addAll(ar2);
        System.out.println(ar);
        boolean b= ar2.contains(12);
        System.out.println(b);
        
        System.out.println("*****");
        Iterator itr=ar2.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("******");
        ListIterator litr =ar2.listIterator(ar2.size());
    }
}
