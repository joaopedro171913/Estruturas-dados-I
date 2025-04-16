    import java.util.Scanner;

public class Algoritmo495 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nome = new String[5]; 

        for (int l = 0; l < 5; l++) {
            System.out.print("Digite nome " + (l + 1) + ": ");
            nome[l] = teclado.nextLine();
        }

        ordena(nome, 5);

        System.out.println("\n\nNOMES ORDENADOS");
        for (int l = 0; l < 5; l++) {
            System.out.println((l + 1) + " - " + nome[l]);
        }

        teclado.close();
    }

    public static void ordena(String[] vet, int tam) {
        String aux;

        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (vet[i].compareTo(vet[j]) > 0) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }
}