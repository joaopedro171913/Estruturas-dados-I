public class Pilha {
    private char[] elementos;
    private int topo;

    public Pilha() {
        elementos = new char[100]; // tamanho suficiente para sua expressão
        topo = -1;
    }

    public void push(char c) {
        elementos[++topo] = c;
    }

    public char pop() {
        return elementos[topo--];
    }

    public boolean estaVazia() {
        return topo == -1;
    }
}