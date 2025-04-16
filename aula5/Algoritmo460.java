import java.util.Scanner;

public class Algoritmo460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        int c = 0;
        while (c < 3) {
            System.out.print("Digite numero: ");
            numero = sc.nextInt();

            System.out.println("Dobro: " + dobro(numero));

            c = c + 1;
        }
        
        System.out.println("\nFIM DO PROGRAMA");
    }

    public static int dobro(int x) {
        return x * 2;
    }
}
