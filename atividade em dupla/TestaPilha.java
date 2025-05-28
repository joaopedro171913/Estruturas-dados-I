import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
public class TestaPilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pilhaP = new Stack<>();
        Stack <Integer> pilhaN = new Stack<>();
        Random random = new Random();
        System.out.println("os numeros sorteados:");

        for (int i = 0; i < 1000; i++){
            int numero = random.nextInt(201) - 100;
            if (numero < 0){
            pilhaP.push(numero);
            System.out.println(numero +" P " );
            
            }else if (numero > 0) {

                pilhaN.push(numero);
                System.out.println(numero +" N");
            }
            else{
                System.out.println("0");

            }

            if (!pilhaP.isEmpty() && !pilhaN.isEmpty()) {
                    int valorP = pilhaP.pop();
                    int valorN = pilhaN.pop();
                    System.out.println("numero 0 retirar um elemento da pilha 'p': " + valorP);
                    System.out.println("numero 0 retirar um elemento da pilha N': " + valorN);
        }
        }


    }
}