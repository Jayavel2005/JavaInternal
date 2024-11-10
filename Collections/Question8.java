import java.util.HashMap;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        HashMap<String, Integer> details = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the grade: ");
                    int grade = scanner.nextInt();
                    addStudent(details, name, grade);
                }
                case 2 -> {
                    System.out.print("Enter the student name to update: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the new grade: ");
                    int grade = scanner.nextInt();
                    updateStudent(details, name, grade);
                }
                case 3 -> displayStudents(details);
                case 4 -> {
                    System.out.println("Exiting the program.");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to add a student to the HashMap
    public static void addStudent(HashMap<String, Integer> details, String name, Integer grade) {
        if (details.containsKey(name)) {
            System.out.println("Student already exists. Use the update option to change the grade.");
        } else {
            details.put(name, grade);
            System.out.println("Student added successfully.");
        }
    }

    // Method to update an existing student's grade
    public static void updateStudent(HashMap<String, Integer> details, String name, Integer grade) {
        if (details.containsKey(name)) {
            details.put(name, grade);
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Student not found. Use the add option to add a new student.");
        }
    }

    // Method to display all students and their grades
    public static void displayStudents(HashMap<String, Integer> details) {
        if (details.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\nStudent Grades:");
            for (String name : details.keySet()) {
                System.out.println(name + ": " + details.get(name));
            }
        }
    }
}
