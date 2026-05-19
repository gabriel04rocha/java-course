package application;

import entities.Course;
import entities.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            Set<Student> totalStudents = new HashSet<>();

            int studentQuantityA = getStudentQuantity("A");
            Course courseA = new Course("A");
            for (int i = 0; i < studentQuantityA; i++) {
                System.out.print("enter the IDs for course A students: ");
                Student newStudent = new Student(sc.nextInt());
                totalStudents.add(newStudent);
                newStudent.addCourse(courseA);
                courseA.addStudents(newStudent);
            }

            int studentQuantityB = getStudentQuantity("B");
            Course courseB = new Course("B");
            for (int i = 0; i < studentQuantityB; i++) {
                System.out.print("enter the IDs for course B students: ");
                Student newStudent = new Student(sc.nextInt());
                totalStudents.add(newStudent);
                newStudent.addCourse(courseB);
                courseA.addStudents(newStudent);
            }

            int studentQuantityC = getStudentQuantity("C");
            Course courseC = new Course("C");
            for (int i = 0; i < studentQuantityC; i++) {
                System.out.print("enter the IDs for course c students: ");
                Student newStudent = new Student(sc.nextInt());
                totalStudents.add(newStudent);
                newStudent.addCourse(courseC);
                courseA.addStudents(newStudent);
            }

            System.out.print("Total students: " + totalStudents.size());

            sc.close();
    }

    public static Integer getStudentQuantity(String courseName) {
        int studentQuantity = 0;
        try {
            System.out.print("How many students for course " + courseName + "? " );
            studentQuantity = sc.nextInt();
        } catch(NoSuchElementException e) {
            System.out.println("enter only integer numbers!");
            getStudentQuantity(courseName);
        }
        return studentQuantity;
    }
}