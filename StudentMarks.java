//import java.util.Scanner;
//
//public class StudentMarks {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] marks = new int[5][5]; // 5 semesters, 5 subjects each
//
//        // Input marks for all semesters
//        for (int semester = 0; semester < 5; semester++) {
//            System.out.println("Enter marks for Semester " + (semester + 1) + ":");
//            for (int subject = 0; subject < 5; subject++) {
//                System.out.print("Subject " + (subject + 1) + ": ");
//                marks[semester][subject] = sc.nextInt();
//            }
//        }
//
//        // Access marks for a specific semester
//        System.out.print("Enter the semester number to access (1-5): ");
//        int semesterNumber = sc.nextInt() - 1; // Adjust for array index
//        if (semesterNumber >= 0 && semesterNumber < 5) {
//            System.out.println("Marks for Semester " + (semesterNumber + 1) + ":");
//            for (int subject = 0; subject < 5; subject++) {
//                System.out.println("Subject " + (subject + 1) + ": " + marks[semesterNumber][subject]);
//            }
//        } else {
//            System.out.println("Invalid semester number. Please enter a number between 1 and 5.");
//        }
//
//        sc.close(); // Close the scanner
//    }
//}
//
//

//import java.util.Scanner;
//
//public class StudentMarks {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] marks = new int[5][5]; // 5 semesters, 5 subjects each
//
//        // Input marks for all semesters
//        for (int semester = 0; semester < 5; semester++) {
//            System.out.println("Enter marks for Semester " + (semester + 1) + ":");
//            for (int subject = 0; subject < 5; subject++) {
//                System.out.print("Subject " + (subject + 1) + ": ");
//                marks[semester][subject] = sc.nextInt();
//            }
//        }
//
//        // Prompt for which semester's marks to access
//        System.out.print("Enter the semester number to access (1-5): ");
//        int semesterNumber = sc.nextInt();
//
//        // Using switch case to access the marks for the chosen semester
//        switch (semesterNumber) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Marks for Semester " + semesterNumber + ":");
//                for (int subject = 0; subject < 5; subject++) {
//                    System.out.println("Subject " + (subject + 1) + ": " + marks[semesterNumber - 1][subject]);
//                }
//                break;
//            default:
//                System.out.println("Invalid semester number. Please enter a number between 1 and 5.");
//                break;
//        }
//
//        sc.close(); // Close the scanner
//    }
//}




//import java.util.Scanner;
//
//public class StudentMarks {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] marks = new int[5][5]; // 5 semesters, 5 subjects each
//
//        // Input marks for all semesters
//        for (int semester = 0; semester < marks.length; semester++) {
//            System.out.println("Enter marks for Semester " + (semester + 1) + ":");
//            for (int subject = 0; subject < marks[semester].length; subject++) {
//                System.out.print("Subject " + (subject + 1) + ": ");
//                marks[semester][subject] = sc.nextInt();
//            }
//        }
//
//        // Prompt for which semester's marks to access
//        System.out.print("Enter the semester number to access (1-5): ");
//        int semesterNumber = sc.nextInt() - 1; // Adjust for array index
//
//        // Check if the semester number is valid
//        if (semesterNumber >= 0 && semesterNumber < marks.length) {
//            System.out.println("Marks for Semester " + (semesterNumber + 1) + ":");
//            for (int subject = 0; subject < marks[semesterNumber].length; subject++) {
//                System.out.println("Subject " + (subject + 1) + ": " + marks[semesterNumber][subject]);
//            }
//        } else {
//            System.out.println("Invalid semester number. Please enter a number between 1 and 5.");
//        }
//
//        sc.close(); // Close the scanner
//    }
//}





import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int semesters = 5; // Total number of semesters
        int subjects = 5; // Subjects per semester

        // 2D array to store marks for 5 semesters, each with 5 subjects
        int[][] marks = new int[semesters][subjects];

        // Input marks for all semesters
        for (int i = 0; i < semesters; i++) {
            System.out.println("Enter marks for Semester " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.println("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Calculate total and percentage for each semester
        for (int i = 0; i < semesters; i++) {
            int total = 0;
            for (int j = 0; j < subjects; j++) {
                total += marks[i][j];
            }
            float percentage = (float) total / subjects;
            System.out.println("Total marks for Semester " + (i + 1) + ": " + total);
            System.out.println("Percentage for Semester " + (i + 1) + ": " + percentage + "%");
        }

        // Access marks for a specific semester
        System.out.println("Enter the semester number to access (1-5): ");
        int semesterNumber = sc.nextInt();
        if (semesterNumber >= 1 && semesterNumber <= semesters) {
            System.out.println("Marks for Semester " + semesterNumber + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.println("Subject " + (j + 1) + ": " + marks[semesterNumber - 1][j]);
            }
        } else {
            System.out.println("Invalid semester number. Please enter a number between 1 and 5.");
        }

        sc.close(); // Close the scanner
    }
}