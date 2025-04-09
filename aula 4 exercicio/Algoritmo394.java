import java.util.Scanner;
public class Algoritmo394 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[50];
        double[] nota1 = new double[50];
        double[] nota2 = new double[50];
        double[] media = new double[50];
        int flagNomes = 0, flagNota1 = 0, flagNota2 = 0;
        int opcao;

        do {
            System.out.println("\n\nESCOLA VIVA - MENU");
            System.out.println("1 - Entrar nomes");
            System.out.println("2 - Entrar 1ª nota");
            System.out.println("3 - Entrar 2ª nota");
            System.out.println("4 - Calcular média");
            System.out.println("5 - Listar no display");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < 50; i++) {
                        System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                        nomes[i] = sc.nextLine().toUpperCase();

                        while (nomes[i].length() > 30) {
                            System.out.print("Nome muito longo. Digite até 30 letras: ");
                            nomes[i] = sc.nextLine().toUpperCase();
                        }
                        while (nomes[i].length() < 30) {
                            nomes[i] += " ";
                        }
                    }
                    flagNomes = 1;
                    break;

                case 2:
                    if (flagNomes == 0) {
                        System.out.println("NÃO TEM NOME CADASTRADO.");
                    } else {
                        for (int i = 0; i < 50; i++) {
                            System.out.print("Digite a 1ª nota do aluno " + (i + 1) + ": ");
                            nota1[i] = sc.nextDouble();
                        }
                        flagNota1 = 1;
                    }
                    break;

                case 3:
                    if (flagNomes == 0) {
                        System.out.println("NÃO TEM NOME CADASTRADO.");
                    } else {
                        for (int i = 0; i < 50; i++) {
                            System.out.print("Digite a 2ª nota do aluno " + (i + 1) + ": ");
                            nota2[i] = sc.nextDouble();
                        }
                        flagNota2 = 1;
                    }
                    break;

                case 4:
                    if (flagNomes == 0 || flagNota1 == 0 || flagNota2 == 0) {
                        System.out.println("NEM TODOS OS DADOS ESTÃO CADASTRADOS.");
                    } else {
                        for (int i = 0; i < 50; i++) {
                            media[i] = (3 * nota1[i] + 7 * nota2[i]) / 10;
                        }
                        System.out.println("Médias calculadas com sucesso.");
                    }
                    break;

                case 5:
                    if (flagNomes == 0 || flagNota1 == 0 || flagNota2 == 0) {
                        System.out.println("NEM TODOS OS DADOS ESTÃO CADASTRADOS.");
                    } else {
                        System.out.println("\nNOME\t\t\t\tNOTA1\tNOTA2\tMÉDIA");
                        for (int i = 0; i < 50; i++) {
                            System.out.printf("%s\t%.1f\t%.1f\t%.1f\n",
                                    nomes[i], nota1[i], nota2[i], media[i]);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("OPÇÃO NÃO DISPONÍVEL.");
                    break;
            }

        } while (opcao != 6);

    }
}

