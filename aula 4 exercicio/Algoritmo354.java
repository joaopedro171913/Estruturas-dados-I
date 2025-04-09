import java.util.Scanner;
public class Algoritmo354 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] Numero = new int[15];

        for (int i = 0; i < 15; i++){
            System.out.println ("  digite o " + (i+1) + "º numero");
            Numero[i] = sc.nextInt();
        }
        System.out.println("\n numero par ou impar ");

        for ( int i = 0; i < 15; i++){
            if(Numero[i] % 2 ==0 ){
                System.out.println("o numero " + Numero[i] + " é par");
                }
                else{
                    System.out.println("o numero " + Numero[i] + " é impar");
                    }
                
        

    }
}
}