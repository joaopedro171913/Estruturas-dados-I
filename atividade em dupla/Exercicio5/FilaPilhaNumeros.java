import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class FilaPilhaNumeros {
    public static void main(String[] args) {
        Queue<Integer> filaF = new LinkedList<>();
        Stack<Integer> pilhaP = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(10000);
            if (filaF.contains(numero)) {
                pilhaP.push(numero);
            } else {
                filaF.add(numero);
            }
        }

        System.out.println("Fila F: " + filaF);
        System.out.println("Tamanho da Fila F: " + filaF.size());
        System.out.println("\nPilha P: " + pilhaP);
        System.out.println("Tamanho da Pilha P: " + pilhaP.size());
    }
}