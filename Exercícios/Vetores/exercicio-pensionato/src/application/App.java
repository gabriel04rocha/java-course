import java.util.Scanner;
import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos estudantes irão alocar-se? ");

        int studentsQuantity = sc.nextInt();

        sc.nextLine();

        Student[] rooms = new Student[10]; 

        for (int i = 0; i < studentsQuantity; i++) {

            System.out.printf("%dº Estudante:\n", i+1);

            System.out.print("Nome: ");

            String name = sc.nextLine();

            System.out.print("E-mail: ");

            String  email = sc.next();

            System.out.print("Quarto: ");

            int room = sc.nextInt();

            sc.nextLine();

            Student student = new Student(name, email);

            rooms[room] = student;

        }

        System.out.println("Quartos ocupados: ");

        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i] != null) {

                 System.out.printf("%d: %s, %s\n", i, rooms[i].getName(), rooms[i].getEmail());

            }

        }

        sc.close();

    }
}
