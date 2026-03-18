import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do funcionário, a quantidade de horas trabalhadas e seu valor recebido por hora separado por espaços: ");

        int employeeNumber = sc.nextInt();

        int hoursWorked = sc.nextInt();

        double hourlySalary = sc.nextDouble();

        double dailySalary = hourlySalary * hoursWorked;
        
        System.out.printf("O número do funcionário é %d.\n Seu salário é R$%.2f.", employeeNumber, dailySalary);

        sc.close();
    }
}
