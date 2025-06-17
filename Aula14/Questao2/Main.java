package Questao2;

public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);

        System.out.println("Lista atual:");
        lista.mostrar();

        System.out.println("Removendo 20:");
        lista.remover(20);
        lista.mostrar();

        System.out.println("Buscando 10:");
        No encontrado = lista.buscar(10);
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.valor);
        } else {
            System.out.println("Nao encontrado");
        }
    }
}
