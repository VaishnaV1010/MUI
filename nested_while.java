class nested_while {
    
    public static void main(String[] args) {
        
        int b=1;
        while (b<=10) {
            System.out.println("The value is"+" "+ b );
            int c=1;
            while (c==b) {
                System.out.println("c is equal to b");
                c++;
                break;
                     
            }
            System.out.println("c is not equal to b");
            b++;
        }
    }
}
