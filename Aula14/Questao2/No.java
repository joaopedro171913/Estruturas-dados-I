package Questao2;

public class No{
    int valor;
    No proximo;
    No anterior;

    public No (int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}