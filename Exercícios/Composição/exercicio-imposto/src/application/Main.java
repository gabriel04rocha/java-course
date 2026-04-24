package application;

import entities.NaturalPerson;
import entities.LegalPerson;
import entities.Person;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person;
        Double totalTaxes = 0.0;
        System.out.print("Enter the number of tax payers: ");

        List<Person> people = new ArrayList<>();

        int taxPayerQuantity = sc.nextInt();

        for (int i = 1; i <= taxPayerQuantity; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char taxPayerType = sc.next().charAt(0);

            System.out.print("Name: ");

            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (taxPayerType == 'i') {
                System.out.print("Health Expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                person = new NaturalPerson(anualIncome, name, healthExpenditures);
                people.add(person);

            } else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                person = new LegalPerson(anualIncome, name, numberOfEmployees);
                people.add(person);
            }
        }

        System.out.println("Taxes paid: ");

        for (Person listPerson : people) {
            totalTaxes += listPerson.getTaxes();
            System.out.printf("%s: %.2f%n", listPerson.getName(), listPerson.getTaxes());
        }

        System.out.println();
        System.out.printf("Total taxes: %.2f", totalTaxes);
    }
}