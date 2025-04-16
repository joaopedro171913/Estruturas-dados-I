    import java.util.Scanner;

public class Algoritmo500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        boolean temA = false, temB = false;
        int opcao;

        do {
            System.out.println("\nVETORES");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("OPCAO: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Entrada do VETOR A:");
                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite numero " + (i + 1) + ": ");
                    vetorA[i] = sc.nextInt();
                }
                temA = true;
            } else if (opcao == 2) {
                System.out.println("Entrada do VETOR B:");
                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite numero " + (i + 1) + ": ");
                    vetorB[i] = sc.nextInt();
                }
                temB = true;
            } else if (opcao == 3) {
                if (temA && temB) {
                    System.out.println("VETOR A:");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(vetorA[i]);
                    }
                    System.out.println("VETOR B:");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(vetorB[i]);
                    }
                } else {
                    System.out.println("Preencha primeiro os vetores A e B.");
                }
            } else if (opcao == 4) {
                if (temA && temB) {
                    System.out.println("SOMA:");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(vetorA[i] + vetorB[i]);
                    }
                } else {
                    System.out.println("Preencha primeiro os vetores A e B.");
                }
            } else if (opcao == 5) {
                if (temA && temB) {
                    System.out.println("DIFERENÇA:");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(vetorA[i] - vetorB[i]);
                    }
                } else {
                    System.out.println("Preencha primeiro os vetores A e B.");
                }
            } else if (opcao == 6) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opcao invalida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}
