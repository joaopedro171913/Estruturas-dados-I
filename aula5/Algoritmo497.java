    import java.util.Scanner;

public class Algoritmo497 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[10];
        int n, c;

        for (int l = 0; l < 10; l++) {
            System.out.print("Digite numero " + (l + 1) + ": ");
            num[l] = teclado.nextInt();
        }

        System.out.print("Digite numero de busca: ");
        n = teclado.nextInt();

        ordena(num, 10);

        c = busca(num, 10, n);

        System.out.println("\nVETOR:");
        for (int l = 0; l < 10; l++) {
            System.out.println((l + 1) + " - " + num[l]);
        }

        if (c >= 0) {
            System.out.println("\nPosição no vetor: " + (c + 1));
        } else {
            System.out.println("\nNÃO ENCONTRADO");
        }

        teclado.close();
    }

    public static void ordena(int[] vet, int tam) {
        int aux;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }

    public static int busca(int[] vet, int tam, int chave) {
        int ini = 0;
        int fim = tam - 1;
        int meio;

        while (ini <= fim) {
            meio = (ini + fim) / 2;

            if (chave == vet[meio]) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }

        return -1; 
    }
}
