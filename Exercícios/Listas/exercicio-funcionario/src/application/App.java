package application;

import entities.Employee;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int option;

        System.out.print("Quantos funcionários você quer cadastrar? ");

        List<Employee> employeeList = new ArrayList<>();
        
        int numberOfUsers = sc.nextInt();

        for (int i = 0; i < numberOfUsers; i++) {

            boolean existing = false;

            System.out.printf("Dados do %dº funcionário:\n", i + 1);

            System.out.print("ID: ");

            int id;

            do {

                id = sc.nextInt();

                if (employeeList.size() > 0) {

                for (Employee employee : employeeList) {

                    if (id == employee.getId()) {

                        System.out.print("ID já existente!");

                        existing = true;

                        System.out.print("Tente novamente: ");

                    } else {

                        existing = false;

                    }

                }
                
            }
            
            } while (existing == true);
            
            System.out.print("Nome: ");

            sc.nextLine();

            String name = sc.nextLine();

            System.out.print("Salário: ");

            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            employeeList.add(employee);
        }
        
        do {

            System.out.print("\nO que você deseja fazer agora?\n\n[1] Aumentar o salário de um funcionário\n[2] Cadastrar um novo funcionário\n[3] Remover um funcionário\n[4] Mudar os dados de um funcionário\n[5] Ver todos os funcionários cadastrados no sistema\n[6] Sair\n\n");
            System.out.print("Sua resposta: ");

            option = sc.nextInt();

            Employee selectedEmployee = new Employee();

            boolean notFound = false;

            switch (option) {
                case 1:
                    
                    System.out.println("\nVocê deseja aumentar o salário de qual funcionário? Digite o ID conforme a lista abaixo:\n");

                    for (Employee employee : employeeList) {

                        System.out.print(employee.toString());

                    }

                    
                    do {
                        System.out.print("\nDigite o ID do funcionário que quer selecionar: ");

                        int employeeId = sc.nextInt();

                        for (Employee employee : employeeList) {

                            if (employeeId == employee.getId()) {

                                selectedEmployee = employee;

                                break;

                            }
                            
                            if (selectedEmployee.getId() == 0 && employeeList.indexOf(employee) == employeeList.size() - 1) {

                                System.out.print("\nFuncionário não encontrado! Tente novamente: ");

                                notFound = true;

                            }

                        }

                    } while (notFound == true);

                    System.out.print("\nDigite a porcentagem pela qual você deseja aumentar o salário deste funcionário: ");

                    double percentage = sc.nextDouble();

                    selectedEmployee.increaseSalary(percentage);
                    
                    break;
                case 2:

                    System.out.print("Digite os dados do novo funcionário:\n");
                    System.out.print("ID: ");

                    int id = sc.nextInt();

                    System.out.print("Nome: ");

                    sc.nextLine();

                    String name = sc.nextLine();

                    System.out.print("Salário: ");

                    double salary = sc.nextDouble();

                    employeeList.add(new Employee(id, name, salary));
                    
                    break;
                case 3:

                    System.out.println("Digite o ID do funcionário que quer retirar conforme a lista abaixo:");

                    for (Employee employee : employeeList) {

                        System.out.print(employee.toString());

                    }

                    do {

                        System.out.print("\nDigite o ID do funcionário que quer selecionar: ");
                        
                        int employeeId = sc.nextInt();

                        for (Employee employee : employeeList) {

                            if (employeeId == employee.getId()) {

                                selectedEmployee = employee;

                                break;

                            }
                            
                            if (selectedEmployee.getId() == 0 && employeeList.indexOf(employee) == employeeList.size() - 1) {

                                System.out.print("\nFuncionário não encontrado! Tente novamente: ");

                                notFound = true;

                            }

                        } 

                    } while (notFound == true);

                    employeeList.remove(selectedEmployee);
                    
                    break;
                case 4:
                    
                    System.out.print("\nDigite o ID do funcionário ao qual deseja fazer a alteração conforme a lista abaixo: ");

                    for (Employee employee : employeeList) {

                        System.out.print(employee.toString());

                    }

                    do {

                        System.out.print("\nDigite o ID do funcionário que quer selecionar: ");
                        
                        int employeeId = sc.nextInt();

                        for (Employee employee : employeeList) {

                            if (employeeId == employee.getId()) {

                                selectedEmployee = employee;

                                notFound = false;

                                break;

                            }
                            
                            if (selectedEmployee.getId() == 0 && employeeList.indexOf(employee) == employeeList.size() - 1) {

                                System.out.print("\nFuncionário não encontrado! Tente novamente: ");

                                notFound = true;

                            }

                        } 

                    } while (notFound == true);

                    System.out.print("\nATENÇÃO! Só é possível fazer a alteração do nome do funcionário selecionado.\nCaso deseje fazer uma alteração no salário, digite o nome do funcionário da forma que está e selecione a opção 1.\n");

                    System.out.print("\nO funcionário selecionado está listado abaixo. Você pode fazer a alteração do nome dele:");

                    System.out.print(selectedEmployee.toString());

                    System.out.print("\nNovo nome: ");

                    sc.nextLine();
                    
                    String employeeName = sc.nextLine();

                    selectedEmployee.setName(employeeName);

                    break;
                case 5:

                    System.out.println("\nOs usuários cadastrados no sistema estão listados abaixo:\n");

                    for (Employee employee : employeeList) {

                        System.out.print(employee.toString());

                    }
                    
                    break;
                case 6:

                    System.out.print("Obrigado por testar!");

                default:

                    System.out.println("Opção inválida! Tente novamente.");

                    break;
            }

        } while (option != 6);
        
        sc.close();

    }
}
