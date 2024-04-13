public class problem123 {
    int a=3475;
    static int b=1348;
    void p(){
        System.out.println(a);
    }
    static void q(){
        System.out.println(b);
    }
    public static void main(String[] args) {
        problem123 obj=new problem123();
        System.out.println(obj.a);
        System.out.println(problem123.b);
        obj.p();
        problem123.q();
    }
}
