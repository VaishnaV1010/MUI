public class reverse_num {
    public static void main(String[] args) {
        int a=123456789,b=0;
        System.out.println("Original Number is:"+" "+a);
        while (a!=0) {
            int num=a%10;
            b=b*10+num;
            a /=10;            
        }
        System.out.println("Reversed Number is:"+" "+b);
    }
}
