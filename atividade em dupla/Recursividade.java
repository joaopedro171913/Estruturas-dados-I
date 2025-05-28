import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Recursividade {
    public static int soma(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        }
        return lista.get(0) + soma(lista.subList(1, lista.size()));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 4 ; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        int resultado = soma(numeros);
        System.out.println("Soma da lista: " + resultado);
    }
}
