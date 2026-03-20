package application;

import java.util.Scanner;
import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Digite a nota do primeiro trimestre do aluno: ");
        
        student.firstGrade = sc.nextDouble();
        
        System.out.print("Digite a nota do segundo trimestre do aluno: ");
        
        student.secondGrade = sc.nextDouble();
        
        System.out.print("Digite a nota do terceiro trimestre do aluno: ");

        student.thirdGrade = sc.nextDouble();

        student.isStudentApproved();
        
        sc.close();

    }
}
