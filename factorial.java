public class factorial {
    public static void main(String[] args) {
        int facto=1;
        int num=5;
        for(int i=1;i<=num;i++)
        {
            facto=facto*i;
            System.out.println(facto);
        }
        System.out.println("The factorial of 5 is:"+" "+facto);
    }
}
