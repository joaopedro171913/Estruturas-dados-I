import java.util.Scanner;
public class Algoritmo413 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] n = new int[5][5];
        int soma = 0;

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Elemento [" + L + "][" + c + "]: ");
                n[L][c] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz completa:");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(n[L][c] + "\t");
            }
            System.out.println();
        }

        for (int L = 1; L < 5; L++) {
            for (int c = 5 - L; c < 5; c++) {
                if (n[L][c] % 2 != 0) {
                    soma += n[L][c] * n[L][c];
                }
            }
        }

        double raiz = Math.sqrt(soma);
        System.out.printf("\nRaiz quadrada da soma dos quadrados dos números ímpares abaixo da diagonal secundária: %.2f\n", raiz);

        scanner.close();
    }
}
