import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exponenciacao{

    public static int potenciaRecursiva(Queue<Integer> fila) {
        if (fila.isEmpty()) {
            return 1; 
        }
        int valor = fila.poll(); 
        return valor * potenciaRecursiva(fila);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        System.out.print("Digite o valor de x (base): ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de y (expoente): ");
        int b = scanner.nextInt();


        for (int i = 0; i < b; i++) {
            fila.add(a);
        }


        while (!fila.isEmpty()) {
            pilha.push(fila.remove());
        }

        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        int resultado = potenciaRecursiva(fila);
        System.out.println(a + "^" + b + " = " + resultado);
    }
}
