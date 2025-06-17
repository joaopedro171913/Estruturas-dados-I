package Questao2;

public class ListaDupla {
    private No cabeca;

    public ListaDupla() {
        cabeca = new No(0); 
        cabeca.proximo = cabeca;
        cabeca.anterior = cabeca;
    }

    public void inserir(int valor) {
        No novo = new No(valor);
        No ultimo = cabeca.anterior;

        novo.proximo = cabeca;
        novo.anterior = ultimo;
        ultimo.proximo = novo;
        cabeca.anterior = novo;
    }

    public No buscar(int valor) {
        No atual = cabeca.proximo;
        while (atual != cabeca) {
            if (atual.valor == valor) {
                return atual;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void remover(int valor) {
        No alvo = buscar(valor);
        if (alvo != null) {
            alvo.anterior.proximo = alvo.proximo;
            alvo.proximo.anterior = alvo.anterior;
            System.out.println("Elemento " + valor + " removido");
        } else {
            System.out.println("Elemento " + valor + " nao encontrado");
        }
    }

    public void mostrar() {
        No atual = cabeca.proximo;
        while (atual != cabeca) {
            System.out.print(atual.valor + " <-> ");
            atual = atual.proximo;
        }
        System.out.println("None");
    }
}
