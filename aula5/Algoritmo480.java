import java.util.Scanner;

public class Algoritmo480 {

    public static int reverso(int num) {
        int soma = 0, r;

        while (num != 0) {
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, x;

        System.out.print("Digite numero: ");
        n = teclado.nextInt();

        x = reverso(n);

        System.out.println("\n" + n + " - " + x);

        if (x == n) {
            System.out.println("É um número capicua");
        } else {
            System.out.println("Não é um número capicua");
        }

        teclado.close();
    }
}
