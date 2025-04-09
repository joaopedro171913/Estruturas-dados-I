import java.util.Scanner;
public class Algoritmo348 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[5];
        double[][]nota = new double[5][2];
        double[] media = new double[5];
        for ( int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno "+(i+1)+":");
            nome[i] = sc.nextLine();
            System.out.println("Digite as duas notas");
            nota[i][0] = sc.nextDouble();
            nota[i][1] = sc.nextDouble();
            media[i] = (nota[i][0] + nota[i][1]) / 2;
            sc.nextLine();
        }
        System.out.println("LISTA DE NOME E DADOS DA NOTA DOS ALUNOS");
            for (int i = 0; i < 5; i++) {
                System.out.println("Nome: " + nome[i]);
                System.out.println("Nota 1: " + nota[i][0]);
                System.out.println("Nota 2: " + nota[i][1]);
                System.out.println("Média: " + media[i]);

        }        
        }

    }