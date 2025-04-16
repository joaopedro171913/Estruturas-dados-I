import java.util.Scanner;
public class Algoritmo490 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[10];

        for (int l = 0; l < 10; l++) {
            System.out.print("Digite palavra em letras minusculas " + (l + 1) + ": ");
            nome[l] = sc.nextLine();
            restantes(nome, l, 'c');
        }

        System.out.println();
        for (int l = 0; l < 10; l++) {
            System.out.println((l + 1) + " - " + nome[l]);
        }

    }

    public static int restantes(String[] vetor, int posicao, char x) {
        String palavra = vetor[posicao];
        int cont = 0;
        char[] letras = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == x) {
                letras[i] = '*';
                cont++;
            }
        }

        vetor[posicao] = new String(letras);
        return cont;
    }
}