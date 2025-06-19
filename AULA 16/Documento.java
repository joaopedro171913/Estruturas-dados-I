public class Documento {
    int id;
    String tipo;
    int paginas;

    public Documento(int id, String tipo, int paginas) {
        this.id = id;
        this.tipo = tipo;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Tipo: " + tipo + ", Páginas: " + paginas;
    }
}
