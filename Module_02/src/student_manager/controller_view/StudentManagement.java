package student_manager.controller_view;


import student_manager.io_library.ReadFileStudent;
import student_manager.io_library.WriteFileStudent;
import student_manager.model.Student;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("=============StudentManager=============\n"
                    + "1.Add new student.\n"
                    + "2.Display list students.\n"
                    + "3.Delete Student.\n"
                    + "4.Find student's name.\n"
                    + "5.Exit.\n"
                    + "Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    List<Student> students = null;
                    try {
                        students = ReadFileStudent.readFileStudent();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }

                    System.out.print("Enter student id : ");
                    String studentID = scanner.nextLine();

                    System.out.print("Enter student name : ");
                    String studentName = scanner.nextLine();

                    System.out.print("Enter student yearold: ");
                    String yearOld = scanner.nextLine();

                    System.out.print("Enter student phone number: ");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();

                    Student student = new Student(studentID, studentName, yearOld, phoneNumber, address);

                    students.add(student);
                    try {
                        WriteFileStudent.writeFileStudent(students);
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case "2":
                    displayListStudent();
                    break;
                case "3":
                    System.out.print("Enter student id you want delete: ");
                    String idStudentDelete = scanner.nextLine();

                    List<Student> students1 = deleteStudent(idStudentDelete);
                    try {
                        WriteFileStudent.writeFileStudent(students1);
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    displayListStudent();

                    break;
                case "4":
                    System.out.print("Enter name student you want find: ");
                    String nameStudentFind = scanner.nextLine();

                    List<Student> studentList = findStudent(nameStudentFind);

                    for (Student student1 : studentList) {
                        System.out.println(student1);
                    }
                    break;
                case "5":
                    System.out.print("Sort by Address - Optional + Name: ");

//                    List<Student> studentList1 = findStudent(nameStudentFind);
//
//                    for (Student student1 : studentList1) {
//                        System.out.println(student1);
//                    }
                    break;
                case "6":
                    System.exit(1);
                default:
                    System.out.println("Your choice not valid!");
            }
        } while (true);
    }

    private static void displayListStudent() {
        List<Student> students1 = null;
        try {
            students1 = ReadFileStudent.readFileStudent();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        for (Student student1 : students1) {
            System.out.println(student1);
        }
    }

    private static List<Student> findStudent(String name) {
        List<Student> students1 = null;
        List<Student> studentsFind = new LinkedList<>();

        try {
            students1 = ReadFileStudent.readFileStudent();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        for (Student element : students1) {
            if (element.getStudentName().toLowerCase().contains(name)) {
                studentsFind.add(element);
            }
        }
        return studentsFind;
    }

    private static List<Student> deleteStudent(String id) {
        List<Student> students1 = null;

        try {
            students1 = ReadFileStudent.readFileStudent();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        for (Student element : students1) {
            if (element.getStudentID().contains(id)) {
                students1.remove(element);
                break;
            }
        }
        return students1;
    }

    private static void sortOptional(){
        List<Student> students1=null;
    }
}
