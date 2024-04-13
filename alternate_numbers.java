public class alternate_numbers {
    public static void main(String[] args) 
    {
        int[] A = {1, 2, -4, -5}, 
        result = new int[A.length];
        for (int i = 0; i < A.length; i++) 
        result[i] = A[i / 2 + (i % 2) * (A.length / 2)];
        for (int num : result) 
        System.out.print(num+" ");
    }
}

