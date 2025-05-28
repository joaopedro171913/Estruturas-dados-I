import java.util.Scanner;
import java.util.Stack;
public class PilhaOperacoes {

    public static String inverterSequencia(String texto) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }

        StringBuilder invertido = new StringBuilder();
        while (!pilha.isEmpty()) {
            invertido.append(pilha.pop());
        }

        return invertido.toString();
    }

    public static boolean Palindromo(String texto) {
        Stack<Character> pilha = new Stack<>();
        StringBuilder textoLimpo = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter != ' ' && caracter != '.') {
                textoLimpo.append(caracter);
                pilha.push(caracter);
            }
        }

        StringBuilder invertido = new StringBuilder();
        while (!pilha.isEmpty()) {
            invertido.append(pilha.pop());
        }

        return textoLimpo.toString().equalsIgnoreCase(invertido.toString());
    }

    public static void main(String[] args) {
        String sequencia, sequenciaInvertida;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma sequencia de caracteres: ");

        sequencia = sc.nextLine();
        sequenciaInvertida = inverterSequencia(sequencia);
        System.out.println("A sequencia invertida e: " + sequenciaInvertida);

        if (Palindromo(sequencia)) {
            System.out.println("A sequencia e um palindromo");
        } else {
            System.out.println("A sequencia nao e um palindromo");
        }
        sc.close();
    }
}
