import java.util.Scanner;
import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person oldest = new Person();

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai inserir? ");

        int numberOfPeople = sc.nextInt();

        sc.nextLine();

        Person[] people = new Person[numberOfPeople];

        for (int i = 0; i < people.length; i++) {

            System.out.printf("Dados da %dº pessoa:\n", i + 1);
            System.out.print("Nome: ");

            String name = sc.nextLine();

            System.out.print("Idade: ");

            int age = sc.nextInt();

            sc.nextLine();

            people[i] = new Person(name, age);

            if (people[i].getAge() > oldest.getAge()) {

                oldest = people[i];

            }

        }

        System.out.printf("A pessoa mais velha é: %s", oldest.getName());
        
        sc.close();

    }
}
