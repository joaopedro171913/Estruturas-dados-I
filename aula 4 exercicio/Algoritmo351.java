import java.util.Scanner;
public class Algoritmo351 {
    public  static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        String[] nome = new String[5];

        for (int i = 0; i < 5; i++){
            System.out.println("digite o nome da primeiro pessoa " + (i+1) + " :");
            nome[i] = sc.nextLine();
            
        }
        System.out.println("digite um valor entre 1 e 5");      
        numero = sc.nextInt();
        sc.nextLine();

        while (1 > numero && numero > 5){
            System.out.println("Número fora do intervalo.");
            System.out.print("Digite o número da pessoa (1 a 5): ");
            numero = sc.nextInt();
    }
    System.out.println ("O nome da pessoa escolhida é: " + nome[numero-1]);

}
}