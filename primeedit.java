public class primeedit {
    public static void main(String[] args) {
        int n=20;
        int count;
        System.out.println("Prime numbers upto"+n);
        for(int i=1;i<=n;i++){
            count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if (count==0) 
            {
                System.out.println(i);    
            }
        }

     
    }
}
