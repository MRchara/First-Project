package org.example;


import org.example.DAO.AssignemntDAO;
import org.example.DAO.StudentDAO;
import org.example.Model.assignments;
import org.example.Model.students;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        System.out.println("Student Management System");
        System.out.println("=========================");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Delete All Students");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            System.out.println("7. Add Assignment");
            System.out.println("8. View Assignments by Student ID");
            System.out.println("9. Update Assignment Score");
            System.out.println("10. Delete Assignment");


            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = sc.nextLine();
                    dao.add(new students(name, age, grade));
                    System.out.println("✅ Student Added Successfully!");
                }
                case 2 -> {
                    List<students> list = dao.getall();
                    System.out.println("All Students:");
                    for (students s : list) {
                        System.out.println(s.getId() + " | " + s.getName() + " | " + s.getAge() + " | " + s.getGrade());
                    }
                }
                    case 3 -> {
                        System.out.print("Enter ID to update: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter new age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new grade: ");
                        String grade = sc.nextLine();
                        dao.update(id, name, age, grade);
                        System.out.println(" Student Updated Successfully!");
                    }
                    case 4 -> {
                        System.out.print("Enter ID to delete: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        dao.deletebyId(id);
                        System.out.println(" Student Deleted Successfully!");
                    }
                    case 5 -> {
                        dao.DeleteAll();
                        System.out.println(" All Students Deleted Successfully!");
                    }

                    case 6 -> {
                        System.out.println(" Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid option");
                case 7 -> {
                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Assignment Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Score: ");
                    int score = sc.nextInt();
                    sc.nextLine();
                   AssignemntDAO.addAssignment(new assignments(studentId, score));
                    System.out.println("✅ Assignment Added Successfully!");
                }

                case 8 -> {
                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();
                    List<assignments> assignments = AssignemntDAO.getAssignmentsByStudent(studentId);
                    for (assignments a : assignments) {
                        System.out.println(a.getId() + " | " + "" + " | " + a.getScore());
                    }
                }

                case 9 -> {
                    System.out.print("Enter Assignment ID to update score: ");
                    int assignmentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new score: ");
                    int score = sc.nextInt();
                    sc.nextLine();
                    AssignemntDAO.updateScore(assignmentId, score);
                    System.out.println("✅ Score Updated Successfully!");
                }

                case 10 -> {
                    System.out.print("Enter Assignment ID to delete: ");
                    int assignmentId = sc.nextInt();
                    sc.nextLine();
                 AssignemntDAO.deleteAssignment(assignmentId);
                    System.out.println("✅ Assignment Deleted Successfully!");
                }


            }

        }
    }
}

