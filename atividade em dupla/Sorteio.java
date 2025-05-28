import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Sorteio{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int posicao;
    Queue<Integer> fila = new LinkedList<>();
    Stack<Integer> pilha = new Stack();

    System.out.println("digite os 20 valores das posicoes");

    for (int i = 0; i < 20; i ++){
        System.out.println("valor" + (i + 1 )+ ":");  
        posicao = sc.nextInt();
        fila.add(posicao);
        }

        while (!fila.isEmpty()) {
            pilha.push(fila.remove());
        }

        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        System.out.println("\nFila invertida:");
        for (int valor : fila) {
            System.out.print(valor + " ");
        }
    }
}
