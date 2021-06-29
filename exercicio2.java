import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int[] xArray = new int[10];
        int[] menorDez = new int[10];
        int[] maiorCinq = new int[10];
        ;
        int i = 0, y = 0, maior = 0, menor = 0, media = 0, counter10 = 0, counter50 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dez números:");
        for (i = 0; i < 10; i++) {
            xArray[i] = sc.nextInt();
            maior = xArray[i];
            menor = xArray[i];
        }
        for (i = 0; i < 10; i++) {
            if (xArray[i] < menor) {
                menor = xArray[i];
            } else if (xArray[i] > maior) {
                maior = xArray[i];
            }
        }
        for (i = 0; i < 10; i++) {
            if (xArray[i] < 10) {
                counter10++;
                menorDez[i] = xArray[i];
            } else if (xArray[i] > 50) {
                counter50++;
                maiorCinq[i] = xArray[i];
            }
            y = y + xArray[i];
        }
        media = y / 10;

        System.out.println("O maior número é " + maior + " e o menor é " + menor + ".");
        System.out.println("A média entre os valores é: " + media + ".");
        System.out.println("Houveram " + counter10 + " números menores que 10, e " + counter50 + " maiores que 50. Os menores de dez são:");
        for (i = 0; i < counter10; i++) {
            if (menorDez[i] < 10) {
                System.out.println(menorDez[i]);
            }
        }
        System.out.println("E os maiores de 50 são: ");
        for (i = 0; i < 10; i++) {
            if (maiorCinq[i] > 50) {
                System.out.println(maiorCinq[i]);
            }
        }
    }
}