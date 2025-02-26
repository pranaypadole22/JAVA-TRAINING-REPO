package day_5;
//Implement a program for maintaining a database of student records.
//Student has student_id,name,Roll No,Class,Marks,and address.
//Display the data for few students
//1)create database
//2)Display database
//3)delete records
//4)update records
//5)Search records
import java.util.*;
class Student {
    int studentId;
    String name;
    int rollNo;
    String studentClass;
    double marks;
    String address;
    public Student(int studentId, String name, int rollNo, String studentClass, double marks, String address) {
        this.studentId = studentId;
        this.name = name;
        this.rollNo = rollNo;
        this.studentClass = studentClass;
        this.marks = marks;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Roll No: " + rollNo + ", Class: " + studentClass + ", Marks: " + marks + ", Address: " + address;
    }
}
public class task_4 {
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Class: ");
        String studentClass = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        studentList.add(new Student(studentId, name, rollNo, studentClass, marks, address));
        System.out.println("Student added successfully!\n");
    }
    public static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }
    public static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        boolean removed = studentList.removeIf(student -> student.studentId == studentId);
        if (removed) {
            System.out.println("Student record deleted successfully!");
        } else {
            System.out.println("Student ID not found.");
        }
    }
    public static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        for (Student student : studentList) {
            if (student.studentId == studentId) {
                System.out.print("Enter New Name: ");
                student.name = scanner.nextLine();
                System.out.print("Enter New Roll No: ");
                student.rollNo = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter New Class: ");
                student.studentClass = scanner.nextLine();
                System.out.print("Enter New Marks: ");
                student.marks = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter New Address: ");
                student.address = scanner.nextLine();
                System.out.println("Student record updated successfully!");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }
    public static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        for (Student student : studentList) {
            if (student.studentId == studentId) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student ID not found.");
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Database Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Update Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
                switch (choice) {
                case 1: addStudent(); break;
                case 2: displayStudents(); break;
                case 3: deleteStudent(); break;
                case 4: updateStudent(); break;
                case 5: searchStudent(); break;
                case 6: System.out.println("Exiting...\n"); return;
                default: System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

