import  java.util.Scanner;
public class Algoritmo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite o numero de tres casas");
        int x = sc.nextInt();
        int y = x % 100 / 10;
        System.out.println("Algarismo da casa das dezenas:\n" + y);
    }


}
