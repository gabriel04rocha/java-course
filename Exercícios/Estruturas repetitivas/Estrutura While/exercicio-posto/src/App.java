import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a preferência do cliente:\n1. Álcool\n2. Gasolina\n3. Diesel\n4. Sair\nSua resposta: ");

        int answer = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (answer != 4) {
            switch (answer) {
                case 1:
                    alcool += 1;
                    System.out.println("Obrigado por responder! Responda a preferência do próximo cliente:\n1. Álcool\n2. Gasolina\n3. Diesel\n4. Sair\nSua resposta: ");
                    answer = sc.nextInt();
                    break;
                case 2:
                    gasolina += 1;
                    System.out.println("Obrigado por responder! Responda a preferência do próximo cliente:\n1. Álcool\n2. Gasolina\n3. Diesel\n4. Sair\nSua resposta: ");
                    answer = sc.nextInt();
                    break;
                case 3:
                    diesel += 1;
                    System.out.println("Obrigado por responder! Responda a preferência do próximo cliente:\n1. Álcool\n2. Gasolina\n3. Diesel\n4. Sair\nSua resposta: ");
                    answer = sc.nextInt();
                    break;
                default:
                    System.out.println("Resposta inválida! Digite uma opção de 1 a 4, por favor.");
                    answer = sc.nextInt();
                    break;
            }
        }

        System.out.printf("Muito obrigado! O resultado foi o seguinte:\nÁlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
        
        sc.close();

    }
}
