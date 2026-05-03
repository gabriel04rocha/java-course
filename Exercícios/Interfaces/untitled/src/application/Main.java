package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Insira os dados: ");

        System.out.print("Insira o número do contrato: ");
        Integer number = sc.nextInt();

        System.out.print("Insira a data do contrato (DD/MM/AAAA): ");
        LocalDate contractDate = LocalDate.parse(sc.next(), dtf);

        System.out.print("Insira o valor do contrato: ");
        Double contractAmount = sc.nextDouble();

        System.out.print("Insira o número de parcelas: ");
        int months = sc.nextInt();

        Contract contract = new Contract(number, contractDate, contractAmount);

        ContractService contractService = new ContractService();

        PaypalService ppService = new PaypalService();

        contractService.processContract(contract, months, ppService);

        System.out.println("Parcelas: ");
        for (Installment listInstallment : contract.getInstallments()) {
            System.out.println(listInstallment.toString());
        }
        sc.close();
    }
}
