public class cyclically_rotate {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int k = 1; // Change this to the number of rotations you want
        int last = A[A.length - 1];
        System.arraycopy(A, 0, A, 1, A.length - 1);
        A[0] = last;
        for (int num : A) System.out.print(num + " ");
    }
}
