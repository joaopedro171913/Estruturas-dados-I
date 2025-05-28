import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;    
import java.util.Stack;       

public class Sorteio2000 {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();

    
        LinkedList<Integer> numerosParaSortear = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            numerosParaSortear.add(random.nextInt(1000) + 1); 
            numerosParaSortear.add(-(random.nextInt(1000) + 1)); 
        }

        
        Collections.shuffle(numerosParaSortear);
        for (Integer num : numerosParaSortear) {
            fila.offer(num);
        }

        System.out.println("Iniciando o processamento da fila...");
        System.out.println("Tamanho inicial da fila: " + fila.size());
        System.out.println("------------------------------------");
        while (!fila.isEmpty()) {
            Integer numeroAtual = fila.poll(); 

            if (numeroAtual > 0) {
                
                System.out.println("Número positivo (" + numeroAtual + ") retirado da fila e empilhado.");
                pilha.push(numeroAtual);
            } else {
                
                System.out.println("Número negativo (" + numeroAtual + ") retirado da fila.");
                if (!pilha.isEmpty()) {
                    Integer numeroDesempilhado = pilha.pop();
                    System.out.println("   --> Número desempilhado: " + numeroDesempilhado);
                } else {
                    System.out.println("   --> Pilha vazia! Não há número para desempilhar.");
                }
            }
            System.out.println("------------------------------------");
        }

        System.out.println("\nProcessamento da fila concluído.");
        System.out.println("Tamanho final da fila: " + fila.size());
        System.out.println("Tamanho final da pilha: " + pilha.size());

    
        if (!pilha.isEmpty()) {
            System.out.println("Números restantes na pilha:");
            while (!pilha.isEmpty()) {
                System.out.println("   " + pilha.pop());
            }
        }
    }
}
