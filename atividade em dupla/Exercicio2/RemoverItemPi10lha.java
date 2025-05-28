import java.util.Scanner;
import java.util.Stack;

public class RemoverItemPi10lha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(20);
        
        System.out.println("Pilha original: " + pilha);

        int chave;
        System.out.print("Digite o valor a ser removido: ");
        chave = sc.nextInt();
        
        removerItem(pilha, chave);
        
        System.out.println("Pilha após remoção: " + pilha);
        
        sc.close();
    }
    
    public static void removerItem(Stack<Integer> pilha, int chave) {
        boolean encontrado;
        int elemento;
        Stack<Integer> pilhaAuxiliar = new Stack<>();
        encontrado = false;
        
        while (!pilha.isEmpty()) {
            elemento = pilha.pop();
            if (elemento == chave && !encontrado) {
                encontrado = true;
            } else {
                pilhaAuxiliar.push(elemento);
            }
        }
        
        while (!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }
}