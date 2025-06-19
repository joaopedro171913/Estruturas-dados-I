public class No {
    Documento documento;
    No anterior;
    No proximo;

    public No(Documento documento) {
        this.documento = documento;
        this.anterior = null;
        this.proximo = null;
    }
}
