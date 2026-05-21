package application;

import model.entities.Employee;
import model.exceptions.EmptyFileException;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter full file path: ");
        String filePath = sc.nextLine();
        System.out.print("Enter the salary: ");
        Double parameterSalary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String newLine = br.readLine();
            if (newLine == null) {
                throw new EmptyFileException("The file provided is empty.");
            }

            while (newLine != null) {
                String[] fileInfo = newLine.split(",");
                Employee newEmployee = new Employee(fileInfo[0], fileInfo[1], Double.valueOf(fileInfo[2]));
                employees.add(newEmployee);
                newLine = br.readLine();
            }

            List<String> higherSalaryEmployees = employees.stream()
                    .filter(p -> p.getSalary() > parameterSalary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();

            Double sumOfMInitials = employees.stream()
                    .filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Email of the people whose salary is higher than R$2000,00");
            higherSalaryEmployees.forEach(System.out::println);
            System.out.print("Sum of salary of people whose names start with \"M\": " + sumOfMInitials);

        } catch (EmptyFileException | IOException | ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception was found: " + e.getMessage());
        }
    }
}
