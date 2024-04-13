import java.util.HashSet;
import java.util.Set;
public class duplicates_in_array {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 3, 1, 4, 5};
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            if (set.contains(num)) {
                System.out.println(num);
            } else {
                set.add(num);
            }
        }
    }
}
