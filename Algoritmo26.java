import  java.util.Scanner;
public class Algoritmo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite a dia do mês: ");
        int dia = sc.nextInt();
        System.out.println("\nDigite o mês: ");
        int mes = sc.nextInt();
        System.out.println("\nDigite o ano: ");
        int ano = sc.nextInt();
        System.out.println("Dia do mês:\n" + dia );
        System.out.println("Mês:\n" + mes );
        System.out.println("Ano:\n" + ano );

        System.out.println( "Data: " + dia + "/" + mes + "/" + ano );
    }
}
