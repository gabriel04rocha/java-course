package application;

import java.util.Scanner;

import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {

        int menQuantity = 0;
        int womenQuantity = 0;
        double womenHeightSum = 0;
        Person tallest = new Person();
        Person shortest = null;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão inseridas? ");

        int peopleQuantity = sc.nextInt();

        Person[] people = new Person[peopleQuantity];

        for (int i = 0; i < people.length; i++) {

            System.out.printf("Altura da %dº pessoa: ", i + 1);

            double height = sc.nextDouble();

            System.out.printf("Gênero da %dº pessoa: ", i + 1);

            char gender = sc.next().charAt(0);

            people[i] = new Person(height, gender);

            if (shortest == null) {

                shortest = people[i];

            }

            if (people[i].getGender() == 'M') {

                menQuantity++;

            }

            if (people[i].getGender() == 'F') {

                womenHeightSum += people[i].getHeight();

                womenQuantity++;

            }

            if (people[i].getHeight() < shortest.getHeight()) {

                shortest = people[i];

            }

            if (people[i].getHeight() > tallest.getHeight()) {

                tallest = people[i];

            }

        }

        double womenHeightMean = womenHeightSum / womenQuantity;

        System.out.printf("Menor altura: %.2f%n", shortest.getHeight());
        System.out.printf("Maior altura: %.2f%n", tallest.getHeight());
        System.out.printf("Média de altura das mulheres: %.2f%n", womenHeightMean);
        System.out.printf("Número de homens: %d", menQuantity);
        
        sc.close();

    }
}
