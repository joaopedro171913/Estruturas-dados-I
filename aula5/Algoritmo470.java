import java.util.Scanner;
public class Algoritmo470 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, pri;

        System.out.print("\nDigite um número: ");
        num = teclado.nextInt();

        pri = primo(num);

        if (pri == 0) {
            System.out.println("\nÉ primo: " + num);
        } else {
            System.out.println("\nNão é primo: " + num);
        }

    }

    public static int primo(int n) {
        int c = 0;
        int p = 2;

        while (c == 0 && p <= n / 2) {
            if (n % p == 0) {
                c = 1;
            }
            p++;
        }

        return c;
    }
}
