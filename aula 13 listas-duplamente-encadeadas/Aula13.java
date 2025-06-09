import java.util.Random;

public class Aula13 {

    static class No {
        int valor;
        No anterior;
        No proximo;

        No(int valor) {
            this.valor = valor;
        }
    }

    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random gerador = new Random();

        System.out.println("Numeros gerados:");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(19999) - 9999;
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n\nInserindo na lista duplamente encadeada...");

        No inicio = null;
        No fim = null;

        for (int i = 0; i < vetor.length; i++) {
            No novoNo = new No(vetor[i]);

            if (inicio == null) {
                inicio = novoNo;
                fim = novoNo;
            } else {
                No atual = inicio;
                while (atual != null && vetor[i] > atual.valor) {
                    atual = atual.proximo;
                }

                if (atual == inicio) {
                    novoNo.proximo = inicio;
                    inicio.anterior = novoNo;
                    inicio = novoNo;
                } else if (atual == null) {
                    fim.proximo = novoNo;
                    novoNo.anterior = fim;
                    fim = novoNo;
                } else {
                    novoNo.proximo = atual;
                    novoNo.anterior = atual.anterior;
                    atual.anterior.proximo = novoNo;
                    atual.anterior = novoNo;
                }
            }
        }

        System.out.println("\nLista em ordem crescente:");
        No temp = inicio;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.proximo;
        }

        System.out.println("\n\nLista em ordem decrescente:");
        temp = fim;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.anterior;
        }

        System.out.println("\n\nRemovendo numeros primos da lista...");

        temp = inicio;
        while (temp != null) {
            No proximo = temp.proximo;

            if (ehPrimo(temp.valor)) {
                if (temp.anterior != null) {
                    temp.anterior.proximo = temp.proximo;
                } else {
                    inicio = temp.proximo;
                }

                if (temp.proximo != null) {
                    temp.proximo.anterior = temp.anterior;
                } else {
                    fim = temp.anterior;
                }
            }

            temp = proximo;
        }

        System.out.println("\nLista apos remover primos (crescente):");
        temp = inicio;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.proximo;
        }

        System.out.println("\n\nLista apos remover primos (decrescente):");
        temp = fim;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.anterior;
        }
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
