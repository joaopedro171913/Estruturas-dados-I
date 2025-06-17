package Questao5;

public class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
    
    public No() {
        this.proximo = this;
    }
}