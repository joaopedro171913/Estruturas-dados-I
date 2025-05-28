import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Aviao {
    private String nome;
    private int identificador;

    public Aviao(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "Aviao: " + nome + " (ID: " + identificador + ")";
    }
}

public class ControleDeDecolagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Aviao> filaDecolagem = new LinkedList<>();
        
        filaDecolagem.add(new Aviao("Aviao do IF", 101));
        filaDecolagem.add(new Aviao("Aviao 123", 202));
        filaDecolagem.add(new Aviao("Embraer 343", 303));

        while (true) {
            System.out.println("\nCONTROLE DE DECOLAGEM");
            System.out.println("1-Listar numero de avioes aguardando");
            System.out.println("2-Autorizar decolagem do primeiro aviao");
            System.out.println("3-Adicionar aviao a fila de espera");
            System.out.println("4-Listar todos os avioes na fila");
            System.out.println("5-Listar caracteristicas do primeiro aviao");
            System.out.println("0-Sair");
            System.out.print("Escolha uma opcao: ");
            
            int opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("Numero de avioes aguardando: " + filaDecolagem.size());
                    break;
                    
                case 2:
                    if (filaDecolagem.isEmpty()) {
                        System.out.println("Nao tem avioes na fila de decolagem.");
                    } else {
                        Aviao aviaoDecolando = filaDecolagem.poll();
                        System.out.println("Autorizada decolagem para: " + aviaoDecolando);
                    }
                    break;
                    
                case 3:
                    System.out.print("Digite o nome do aviao: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o numero identificador: ");
                    int id = sc.nextInt();
                    filaDecolagem.add(new Aviao(nome, id));
                    System.out.println("Aviao adicionado a fila de espera");
                    break;
                    
                case 4:
                    if (filaDecolagem.isEmpty()) {
                        System.out.println("Nao ha avioes na fila de decolagem.");
                    } else {
                        System.out.println("Avioes na fila de decolagem:");
                        for (Aviao aviao : filaDecolagem) {
                            System.out.println(aviao);
                        }
                    }
                    break;
                    
                case 5:
                    if (filaDecolagem.isEmpty()) {
                        System.out.println("Nao ha avioes na fila de decolagem.");
                    } else {
                        System.out.println("Primeiro aviao da fila:");
                        System.out.println(filaDecolagem.peek());
                    }
                    break;
                    
                case 0:
                    System.out.println("Encerrando...");
                    sc.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }
}