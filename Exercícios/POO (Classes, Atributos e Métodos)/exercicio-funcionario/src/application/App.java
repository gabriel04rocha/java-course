package application;

import java.util.Scanner;
import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Digite o nome do funcionário: ");

        employee.name = sc.nextLine();

        System.out.print("Digite o salário bruto do funcionário: ");

        employee.salary = sc.nextDouble();
        
        System.out.print("Digite o imposto em reais sobre o salário do funcionário: ");

        employee.tax = sc.nextDouble();

        System.out.printf("Funcionário: %s%nSalário: %.2f%nImposto sobre salário: %.2f%nSalário líquido: %.2f%n", employee.name, employee.salary, employee.tax, employee.netSalary());

        System.out.print("Digite em quantos porcento você quer aumentar o salário desse funcionário: ");

        employee.increaseSalary(sc.nextDouble());        
        
        sc.close();

    }
}
