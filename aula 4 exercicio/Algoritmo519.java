import java.util.Scanner;
public class Algoritmo519 {
    
public class Matriz18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] DIF = new int[5][5];

        System.out.println("Digite os valores da matriz A:");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("A[" + (L + 1) + "][" + (c + 1) + "]: ");
                A[L][c] = sc.nextInt();
            }
        }

        System.out.println("\nDigite os valores da matriz B:");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("B[" + (L + 1) + "][" + (c + 1) + "]: ");
                B[L][c] = sc.nextInt();
                DIF[L][c] = A[L][c] - B[L][c];
            }
        }

        System.out.println("\nMATRIZ DIFERENÇA (A - B):");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(DIF[L][c] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

}