package entities;

public class Student {

    public double firstGrade;

    public double secondGrade;

    public double thirdGrade;

    public double showFinalGrade() {

        return firstGrade + secondGrade + thirdGrade;

    }

    public void isStudentApproved() {

        double finalGrade = firstGrade + secondGrade + thirdGrade;

        if (firstGrade + secondGrade + thirdGrade >= 60) {
            System.out.printf("Nota final: %.2f%nO aluno passou!", finalGrade);
        } else {
            System.out.printf("O aluno não passou!\nFaltam %.2f pontos para que ele seja aprovado.", 60 - finalGrade);
        }

    }

}
