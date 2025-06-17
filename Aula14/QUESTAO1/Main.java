package QUESTAO1;
public class Main {
    public static void main(String[] args) {
        ListaDuplEncD lista1 = new ListaDuplEncD();
        ListaDuplEncD lista2 = new ListaDuplEncD();

        lista1.adicionar(1);
        lista1.adicionar(3);
        lista1.adicionar(5);

        lista2.adicionar(2);
        lista2.adicionar(4);
        lista2.adicionar(6);

        System.out.println("Concatenar:");
        lista1.concatenar(lista2);
        lista1.mostrar();

        System.out.println("Separar:");
        ListaDuplEncD[] separadas = lista1.separar();
        separadas[0].mostrar();
        separadas[1].mostrar();

        System.out.println("Intercalar:");
        ListaDuplEncD intercalada = separadas[0].intercalar(separadas[1]);
        intercalada.mostrar();
    }
}