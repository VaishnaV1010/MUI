public class alternate_numbers_with_uqual {
    public static void main(String[] args) {
        int[] A = {1, 2, -4, 5, 7, -5}, result = new int[A.length];
        for (int i = 0, j = 0, k = 0; i < A.length; i++) {
            if (A[i] >= 0 && j < A.length / 2 || k == A.length) result[j++] = A[i];
            else result[k++] = A[i];
        }
        for (int num : result) System.out.print(num + " ");
    }
}
