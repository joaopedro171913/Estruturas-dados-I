import java.util.Scanner;
public class Algoritmo358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] preco_Compra = new double[100];
        double[] preco_Venda = new double[100];
        int lucroMenor10 = 0;
        int lucroEntre10e20 = 0;
        int lucroMaior20 = 0;   
        double lucro;

        for (int i = 0; i < 100; i++) {
            System.out.print("preço de compra da mercadoria " + (i + 1) + ": ");
            preco_Compra[i] = sc.nextDouble();

            System.out.print("preço de venda da mercadoria " + (i + 1) + ": ");
            preco_Venda[i] = sc.nextDouble();
        }

        for (int i = 0; i < 100; i++) {
            lucro= ((preco_Venda[i] - preco_Compra[i]) / preco_Compra[i]) * 100;

            if (lucro < 10.0) {
                lucroMenor10++;
            } else if (lucro<= 20.0) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }

        System.out.println("\nTOTAL DE MERCADORIAS:");
        System.out.println("Lucro < 10%: " + lucroMenor10);
        System.out.println("10% <= Lucro <= 20%: " + lucroEntre10e20);
        System.out.println("Lucro > 20%: " + lucroMaior20);


    }
    }
}