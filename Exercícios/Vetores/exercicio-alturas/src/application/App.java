package application;

import entities.Person;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");

        int numberOfPeople = sc.nextInt();

        Person[] people = new Person[numberOfPeople];

        double heightSum = 0.0; 

        int youngerThan16 = 0;
        
        for (int i = 0; i < people.length; i++) {

            System.out.printf("Digite os dados da %dº pessoa:\n", i + 1);

            System.out.print("Nome: ");

            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Idade: ");

            int age = sc.nextInt();

            System.out.print("Altura: ");

            double height = sc.nextDouble();

            people[i] = new Person(name, age, height);

            heightSum += people[i].getHeight();

            if (people[i].getAge() < 16) {
                youngerThan16++;
            }

        }

        double heightMean = heightSum / people.length;
        double youngerPercentage = (double) youngerThan16 / people.length * 100;

        System.out.printf("Altura média: %.2f%n", heightMean);
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%", youngerPercentage);

        sc.close();

    }
}
