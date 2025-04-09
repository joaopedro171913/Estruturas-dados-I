import java.util.Scanner;
public class Algoritmo400 {
    
    static final int MAX = 50;
    static int[] leitos = new int[MAX], nd = new int[MAX];
    static String[] sit = new String[MAX], din = new String[MAX], dout = new String[MAX];
    static String[] nome = new String[MAX], tel = new String[MAX];
    static double[] precos = new double[MAX], despesas = new double[MAX];
    static boolean cadastrados = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n\nHotel Fazenda Sucesso");
            System.out.println("1. Cadastra quartos");
            System.out.println("2. Lista todos os quartos");
            System.out.println("3. Lista quartos ocupados");
            System.out.println("4. Aluguel/reserva quarto");
            System.out.println("5. Entra despesas extras");
            System.out.println("6. Calcula despesa do quarto");
            System.out.println("7. Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1 -> cadastrarQuartos(sc);
                case 2 -> listarTodos();
                case 3 -> listarOcupados();
                case 4 -> aluguelOuReserva(sc);
                case 5 -> entrarDespesas(sc);
                case 6 -> calcularDespesa(sc);
                case 7 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (op != 7);

        sc.close();
    }

    static void cadastrarQuartos(Scanner sc) {
        if (cadastrados) {
            System.out.println("Atenção: dados já cadastrados!");
            return;
        }
        for (int i = 0; i < MAX; i++) {
            System.out.print("\nQuantidade de leitos para o quarto " + (i + 1) + ": ");
            leitos[i] = sc.nextInt();
            System.out.print("Preço do quarto: ");
            precos[i] = sc.nextDouble();

            sit[i] = "L";
            despesas[i] = 0;
            nd[i] = 0;
            din[i] = dout[i] = nome[i] = tel[i] = "XXXX";
        }
        cadastrados = true;
    }

    static void listarTodos() {
        if (!cadastrados) {
            System.out.println("Escolha a opção 1 primeiro!");
            return;
        }
        for (int i = 0; i < MAX; i++) {
            System.out.println("\nQuarto " + (i + 1));
            System.out.println("Situação: " + sit[i]);
            if (!sit[i].equals("L")) {
                System.out.println("Nome: " + nome[i]);
                System.out.println("Telefone: " + tel[i]);
            }
            System.out.println("Leitos: " + leitos[i]);
            System.out.println("Preço: €" + precos[i]);
            System.out.println("Despesas: €" + despesas[i]);
            System.out.println("Entrada: " + din[i]);
            System.out.println("Saída: " + dout[i]);
            System.out.println("Dias: " + nd[i]);
        }
    }

    static void listarOcupados() {
        if (!cadastrados) {
            System.out.println("Escolha a opção 1 primeiro!");
            return;
        }
        for (int i = 0; i < MAX; i++) {
            if (sit[i].equals("A")) {
                System.out.println("\nQuarto " + (i + 1));
                System.out.println("Despesas: €" + despesas[i]);
                System.out.println("Entrada: " + din[i]);
                System.out.println("Saída: " + dout[i]);
                System.out.println("Dias: " + nd[i]);
            }
        }
    }

    static void aluguelOuReserva(Scanner sc) {
        if (!cadastrados) {
            System.out.println("Escolha a opção 1 primeiro!");
            return;
        }

        System.out.print("Digite A (aluguel) ou R (reserva): ");
        String resp = sc.nextLine().toUpperCase();

        while (!resp.equals("A") && !resp.equals("R")) {
            System.out.print("Resposta inválida. Digite A ou R: ");
            resp = sc.nextLine().toUpperCase();
        }

        int quarto = -1;

        if (resp.equals("A")) {
            System.out.print("Tinha reserva (S/N)? ");
            String respi = sc.nextLine().toUpperCase();
            if (respi.equals("S")) {
                System.out.print("Nome da reserva: ");
                String nomep = sc.nextLine();
                for (int i = 0; i < MAX; i++) {
                    if (nome[i].equalsIgnoreCase(nomep)) {
                        quarto = i;
                        sit[i] = "A";
                        break;
                    }
                }
                if (quarto == -1) {
                    System.out.println("Reserva não encontrada.");
                    return;
                }
            }
        }

        if (quarto == -1) {
            for (int i = 0; i < MAX; i++) {
                if (sit[i].equals("L")) {
                    System.out.println("Quarto " + (i + 1) + " - Leitos: " + leitos[i] + ", Preço: €" + precos[i]);
                }
            }
            System.out.print("Digite o número do quarto para " + (resp.equals("A") ? "aluguel" : "reserva") + ": ");
            quarto = sc.nextInt() - 1;
            sc.nextLine();
            if (quarto < 0 || quarto >= MAX || sit[quarto].equals("A")) {
                System.out.println("Quarto inválido ou já ocupado.");
                return;
            }
            sit[quarto] = resp;
        }

        System.out.print("Nome: ");
        nome[quarto] = sc.nextLine();
        System.out.print("Telefone: ");
        tel[quarto] = sc.nextLine();
        System.out.print("Data de entrada: ");
        din[quarto] = sc.nextLine();
        System.out.print("Data de saída: ");
        dout[quarto] = sc.nextLine();
        System.out.print("Número de dias: ");
        nd[quarto] = sc.nextInt();
        sc.nextLine();
    }

    static void entrarDespesas(Scanner sc) {
        if (!cadastrados) {
            System.out.println("Escolha a opção 1 primeiro!");
            return;
        }
        System.out.print("Número do quarto: ");
        int quarto = sc.nextInt() - 1;
        if (quarto < 0 || quarto >= MAX) {
            System.out.println("Número de quarto inválido.");
            return;
        }
        System.out.print("Valor da despesa: ");
        double valor = sc.nextDouble();
        despesas[quarto] += valor;
    }

    static void calcularDespesa(Scanner sc) {
        if (!cadastrados) {
            System.out.println("Escolha a opção 1 primeiro!");
            return;
        }
        System.out.print("Número do quarto: ");
        int quarto = sc.nextInt() - 1;
        if (quarto < 0 || quarto >= MAX) {
            System.out.println("Número de quarto inválido.");
            return;
        }
        double total = despesas[quarto] + precos[quarto] * nd[quarto];
        System.out.println("Total a pagar: €" + total);

        sit[quarto] = "L";
        despesas[quarto] = 0;
        din[quarto] = dout[quarto] = nome[quarto] = tel[quarto] = "XXXX";
        nd[quarto] = 0;
    }
}
