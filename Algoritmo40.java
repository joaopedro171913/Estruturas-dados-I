import java.util.Scanner;
public class Algoritmo40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\ndigite o valor do dividendo:");
        int dividendo = sc.nextInt();
        System.out.println("\ndigite o valor do divisor: ");
        int divisor = sc.nextInt();
        int resto = dividendo % divisor;
        int quociente = dividendo / divisor;
        System.out.println("quociente: " + quociente);
        System.out.println("divisor: " + divisor);
        System.out.println("dividendo: " + dividendo);
        System.out.println ("resto: " + resto);

    }
}
