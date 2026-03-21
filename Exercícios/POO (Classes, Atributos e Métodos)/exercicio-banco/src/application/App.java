package application;

import java.util.Scanner;
import entities.Holder;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Para criar uma nova conta, digite os dados abaixo: ");
        System.out.print("O nome do titular da conta: ");

        String holderName = sc.nextLine();

        System.out.print("O número da conta: ");

        int accountNumber = sc.nextInt();

        System.out.print("O valor do primeiro depósito. Se não deseja fazer um depósito inicial, digite 0: ");

        double firstDeposit = sc.nextDouble();

        Holder holder = new Holder(accountNumber, holderName, firstDeposit);

        System.out.println("\nSua conta foi criada com sucesso!\n");
        System.out.println(holder.toString());

        System.out.print("O que você deseja fazer?\n1. Fazer depósito\n2. Fazer um saque\n3. Mudar o nome do titular da conta\n4. Saber os dados da minha conta\n5. Sair\n\nSua escolha: ");

        int option = sc.nextInt();

        double volatileValue;

        do {

            switch (option) {
                case 1:
                    System.out.print("\nQual é o valor do depósito? ");

                    volatileValue = sc.nextDouble();

                    holder.makeDeposit(volatileValue);

                    System.out.printf("\nDepósito realizado. Novo saldo: R$%.2f%n\n", holder.getAccountBalance());

                    System.out.print("O que você deseja fazer em seguida?\n1. Fazer depósito\n2. Fazer um saque\n3. Mudar o nome do titular da conta\n4. Saber os dados da minha conta\n5. Sair\n\nSua escolha: ");

                    option = sc.nextInt();
                    break;
                case 2:
                    System.out.printf("\nHá R$%.2f na conta. Quanto você deseja retirar? ", holder.getAccountBalance());

                    volatileValue = sc.nextDouble();

                    while (volatileValue > holder.getAccountBalance()) {
                        System.out.print("\nValor maior do que seu saldo atual! Tente novamente: ");

                        volatileValue = sc.nextDouble();
                    }

                    holder.makeWithdrawal(volatileValue);

                    System.out.printf("\nSaque realizado. Novo saldo: R$%.2f%n", holder.getAccountBalance());

                    System.out.print("O que você deseja fazer em seguida?\n1. Fazer depósito\n2. Fazer um saque\n3. Mudar o nome do titular da conta\n4. Saber os dados da minha conta\n5. Sair\n\nSua escolha: ");

                    option = sc.nextInt();
                    break;
                case 3:
                    sc.nextLine();

                    System.out.print("Digite o novo nome: ");
                    
                    String newName = sc.nextLine();

                    holder.setHolderName(newName);

                    System.out.println(holder.toString());

                    System.out.print("O que você deseja fazer em seguida?\n1. Fazer depósito\n2. Fazer um saque\n3. Mudar o nome do titular da conta\n4. Saber os dados da minha conta\n5. Sair\n\nSua escolha: ");

                    option = sc.nextInt();
                    break;
                case 4:
                    System.out.println(holder.toString());

                    System.out.print("O que você deseja fazer em seguida?\n1. Fazer depósito\n2. Fazer um saque\n3. Mudar o nome do titular da conta\n4. Saber os dados da minha conta\n5. Sair\n\nSua escolha: ");

                    option = sc.nextInt();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");

                    System.out.print("O que você deseja fazer em seguida?\n1. Fazer depósito\n2. Fazer um saque\n3. Mudar o nome do titular da conta\n4. Saber os dados da minha conta\n5. Sair\n\nSua escolha: ");

                    option = sc.nextInt();
                    break;
            }

        } while(option != 5);
        
        sc.close();

    }
}
