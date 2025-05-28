import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class InverterFila {
    public static void main(String[] args) {
        Queue<Integer> f1 = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            f1.add(random.nextInt(1000));
        }

        System.out.println("Fila original F1: " + f1);
        Queue<Integer> f2 = inverterFila(f1);
        System.out.println("Fila invertida F2: " + f2);
    }

    public static Queue<Integer> inverterFila(Queue<Integer> f1) {
        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> f2 = new LinkedList<>();

        while (!f1.isEmpty()) {
            pilha.push(f1.poll());
        }

        while (!pilha.isEmpty()) {
            f2.add(pilha.pop());
        }

        return f2;
    }
}
