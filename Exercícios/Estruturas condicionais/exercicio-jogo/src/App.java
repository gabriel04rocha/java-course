import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial e a hora final de um jogo separado por espaços: ");

        int startHour = sc.nextInt();

        int endHour = sc.nextInt();

        int duration;

        if (startHour < endHour) {
            duration = startHour - endHour;
        } else {
            duration = 24 - startHour + endHour;
        }
        
        System.out.printf("A duração do jogo foi de %d.", duration);
    }
}
