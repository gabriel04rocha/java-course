package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String approvedStudents = "";

        System.out.print("Quantos alunos serão inseridos? ");

        int studentQuantity = sc.nextInt();

        sc.nextLine();

        String[] studentNames = new String[studentQuantity];

        double[] firstGrades = new double[studentQuantity];

        double[] secondGrades = new double[studentQuantity];

        for (int i = 0; i < studentNames.length; i++) {

            System.out.printf("Digite nome, primeira e segunda nota do %d aluno.\n", i + 1);

            String name = sc.nextLine();

            double firstGrade = sc.nextDouble();

            double secondGrade = sc.nextDouble();

            sc.nextLine();

            double studentMean = (firstGrade + secondGrade) / 2;

            if (studentMean >= 6) {

                approvedStudents += name + "\n";

            }

        }

        System.out.printf("Alunos aprovados:\n%s", approvedStudents);
        
        sc.close();

    }
}
