public class Stringequalexample 
{
    public static void main(String[] args) 
    {
        StringBuffer sb1 = new StringBuffer("ABCD");
        StringBuffer sb2 = new StringBuffer("ABCD");

        // Convert StringBuffer to String
        String str1 = sb1.toString();
        String str2 = sb2.toString();

        if(str1.equals(str2))
        {
            System.out.println("The contents are equal");
        } 
        else
        {
            System.out.println("The contents are not equal");
        }

    }
}
