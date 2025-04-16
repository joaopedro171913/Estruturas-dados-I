import java.util.Scanner;
public class Algoritmo499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int op = 0;
        boolean flag = false;

        for (int i = 0; i < 5; i++) {
            num[i] = 0;
        }

        do {
            System.out.println("\n\nMENU VETOR - FUNCAO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.print("OPCAO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    entrada(num);
                    flag = true;
                    break;
                case 2:
                    if (flag) {
                        ordena(num);
                    } else {
                        System.out.println("Escolha primeiro opcao 1");
                    }
                    break;
                case 3:
                    if (flag) {
                        imprime(num);
                    } else {
                        System.out.println("Escolha primeiro opcao 1");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do algoritmo");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        } while (op != 4);

        sc.close();
    }

    public static void entrada(int[] vet) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEntrada do VETOR:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite numero " + (i + 1) + ": ");
            vet[i] = sc.nextInt();
        }
    }

    public static void ordena(int[] vet) {
        int aux;
        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        System.out.println("Vetor ordenado com sucesso!");
    }

    public static void imprime(int[] vet) {
        System.out.println("\nVETOR:");
        for (int i = 0; i < vet.length; i++) {
            System.out.println((i + 1) + " - " + vet[i]);
        }
    }
}
