import java.util.Scanner;

public class Algoritmo398 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cod = new int[50];
        int[] quant = new int[50];
        double[] preco = new double[50];
        int k = 0;
        double totalVendido = 0;

        System.out.print("Digite o código do produto ou -1 para terminar: ");
        int codi = scanner.nextInt();

        while (k < 50 && codi != -1) {
            cod[k] = codi;

            System.out.print("Digite a quantidade do produto: ");
            quant[k] = scanner.nextInt();

            System.out.print("Digite o preço do produto: ");
            preco[k] = scanner.nextDouble();

            k++;
            System.out.print("\nDigite o código do produto ou -1 para terminar: ");
            codi = scanner.nextInt();
        }

        System.out.print("\nDigite o código do produto para venda ou 0 para terminar: ");
        int codigo = scanner.nextInt();

        while (codigo != 0) {
            System.out.print("Digite a quantidade requerida: ");
            int quantidade = scanner.nextInt();

            boolean encontrado = false;

            for (int i = 0; i < k; i++) {
                if (cod[i] == codigo) {
                    encontrado = true;

                    if (quant[i] >= quantidade) {
                        quant[i] -= quantidade;
                        double venda = quantidade * preco[i];
                        totalVendido += venda;
                        System.out.println("Venda realizada com sucesso. Total: $" + venda);
                    } else {
                        System.out.println("Estoque Insuficiente.");
                    }
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Produto Não-Cadastrado.");
            }

            System.out.print("\nDigite o código do produto para venda ou 0 para terminar: ");
            codigo = scanner.nextInt();
        }

        System.out.println("\nTotal vendido no dia: $" + totalVendido);

        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (quant[i] < quant[j]) {

                    // aqui faz trocar quantidades
                    int tempQ = quant[i];
                    quant[i] = quant[j];
                    quant[j] = tempQ;

                    // aqui trocar códigos
                    int tempC = cod[i];
                    cod[i] = cod[j];
                    cod[j] = tempC;

                    // ja aqui vai trocar preços
                    double tempP = preco[i];
                    preco[i] = preco[j];
                    preco[j] = tempP;
                }
            }
        }

        // Mostrar produtos
        System.out.println("\nProdutos em estoque (ordem decrescente de quantidade):");
        for (int i = 0; i < k; i++) {
            System.out.println("Código: " + cod[i] + " | Quantidade: " + quant[i] + " | Preço: $" + preco[i]);
        }

    }
}


