import java.util.Random;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int guess = 0, x = 0;
        Scanner sc = new Scanner(System.in);

        x = (int) Math.random();
        do {
            System.out.println("Tente adivinhar o número gerado!");
            guess = sc.nextInt();
            if (guess != x) {
                System.out.println("Você errou, tente novamente!");
            }
        } while (guess != x);
        if (guess == x) {
            System.out.println("Você acertou, parabéns! :)");
        }
    }
}
