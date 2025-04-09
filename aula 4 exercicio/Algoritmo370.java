import java.util.Scanner;

public class Algoritmo370 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nv; // nv = numero de voo
        String[] nome = new String[1000]; 
        int[] voos = new int[1000]; 

        System.out.print("\nEntre com o número de voos: ");
        nv = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nv; i++) {
            System.out.print("\nEntre com a identificação do voo " + (i + 1) + ": ");
            nome[i] = scanner.nextLine();

            System.out.print("Entre com a quantidade de lugares disponíveis no voo " + nome[i] + ": ");
            voos[i] = Integer.parseInt(scanner.nextLine());
        }

        String nvd;
        System.out.print("\nEntre com o número do voo desejado ou 0 para terminar: ");
        nvd = scanner.nextLine();

        while (!nvd.equals("0")) {
            int i = 0;
            while (i < nv && !nome[i].equals(nvd)) {
                i++;
            }

            if (i < nv) {
                if (voos[i] > 0) {
                    voos[i]--;
                    System.out.print("Qual o número da identidade do cliente? ");
                    String id = scanner.nextLine();
                    System.out.println("Identidade: " + id + " | Voo: " + nvd + "\n");
                } else {
                    System.out.println("Não existem mais lugares neste voo.\n");
                }
            } else {
                System.out.println("Não existe este voo.\n");
            }

            System.out.print("Entre com o número do voo desejado ou 0 para terminar: ");
            nvd = scanner.nextLine();
        }

        System.out.println("\nFim do programa.");
        scanner.close();
    }
}
