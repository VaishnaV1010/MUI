//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class StudentManagementSystem {
//    private Map<Integer, Student> students = new HashMap<>();
//
//    public void addStudent(int id, String name, int[] marks) {
//        if (!students.containsKey(id)) {
//            students.put(id, new Student(name, marks));
//            System.out.println("Student added successfully.");
//        } else {
//            System.out.println("A student with this ID already exists.");
//        }
//    }
//
//    public void deleteStudent(int id) {
//        if (students.containsKey(id)) {
//            students.remove(id);
//            System.out.println("Student removed successfully.");
//        } else {
//            System.out.println("No student found with this ID.");
//        }
//    }
//
//    public void calculateTotalMarks(int id) {
//        if (students.containsKey(id)) {
//            Student student = students.get(id);
//            int total = student.calculateTotal();
//            System.out.println("Total marks for student ID " + id + ": " + total);
//        } else {
//            System.out.println("No student found with this ID.");
//        }
//    }
//
//    public static void main(String[] args) {
//        StudentManagementSystem sms = new StudentManagementSystem();
//        Scanner sc = new Scanner(System.in);
//
//        // Example usage:
//        // Add students
//        sms.addStudent(1, "Alice", new int[]{80, 70, 85, 90, 95});
//        sms.addStudent(2, "Bob", new int[]{75, 85, 77, 88, 90});
//
//        // Delete a student
//        sms.deleteStudent(1);
//
//        // Calculate total marks for a student
//        sms.calculateTotalMarks(2);
//
//        sc.close();
//    }
//
//    private class Student {
//        String name;
//        int[] marks;
//
//        public Student(String name, int[] marks) {
//            this.name = name;
//            this.marks = marks;
//        }
//
//        public int calculateTotal() {
//            int total = 0;
//            for (int mark : marks) {
//                total += mark;
//            }
//            return total;
//        }
//    }
//}



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementSystem {
    private Map<Integer, String> studentNames = new HashMap<>();
    private Map<Integer, int[]> studentMarks = new HashMap<>();

    public void addStudent(int id, String name, int[] marks) {
        if (!studentNames.containsKey(id)) {
            studentNames.put(id, name);
            studentMarks.put(id, marks);
            System.out.println("Student added successfully.");
        } else {
            System.out.println("A student with this ID already exists.");
        }
    }

    public void deleteStudent(int id) {
        if (studentNames.containsKey(id)) {
            studentNames.remove(id);
            studentMarks.remove(id);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("No student found with this ID.");
        }
    }

    public void calculateTotalMarks(int id) {
        if (studentMarks.containsKey(id)) {
            int[] marks = studentMarks.get(id);
            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            System.out.println("Total marks for student ID " + id + ": " + total);
        } else {
            System.out.println("No student found with this ID.");
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        // Example usage:
        system.addStudent(1, "Alice", new int[]{80, 70, 85, 90, 95});
        system.addStudent(2, "Bob", new int[]{75, 85, 77, 88, 90});

        // Delete a student
        system.deleteStudent(1);

        // Calculate total marks for a student
        system.calculateTotalMarks(1);
        system.calculateTotalMarks(2);

        sc.close();
    }
}
