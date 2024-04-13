//import java.util.Scanner;
//
//public class miniproject {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n; // Number of subjects
//        System.out.println("Enter the total number of subjects: ");
//        n = sc.nextInt();
//
//        // Declare an array to store marks
//        int[] arr = new int[n];
//        System.out.println("Enter the marks secured in each subject: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int total = 0;
//        for (int i = 0; i < n; i++) {
//            total += arr[i];
//        }
//
//        System.out.println("Total marks obtained: " + total);
//
//        float percentage = (total / (float) n);
//        System.out.println("Total percentage: " + percentage + "%");
//
//        // Access marks for a specific semester
//        System.out.println("Enter the semester number (1 to " + n + "): ");
//        int semester = sc.nextInt();
//        if (semester >= 1 && semester <= n) {
//            System.out.println("Marks for semester " + semester + ": " + arr[semester - 1]);
//        } else {
//            System.out.println("Invalid semester number.");
//        }
//    }
//}


















