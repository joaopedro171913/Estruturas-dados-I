package Questao4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testando Lista Circular Duplamente Encadeada");
        
        ListaCircularDupla listaA = new ListaCircularDupla();
        listaA.inserirFinal(10);
        listaA.inserirFinal(20);
        listaA.inserirFinal(30);
        System.out.print("Lista A: ");
        listaA.mostrar();
        System.out.println("Total de elementos em A: " + listaA.contar());

        System.out.println("\n-Teste de Cópia-");
        ListaCircularDupla copiaA = listaA.copiar();
        System.out.print("Copia de A: ");
        copiaA.mostrar();

        System.out.println("\n-Teste de Concatenação-");
        ListaCircularDupla listaB = new ListaCircularDupla();
        listaB.inserirFinal(40);
        listaB.inserirFinal(50);
        System.out.print("Lista B: ");
        listaB.mostrar();
        
        copiaA.concatenar(listaB);
        System.out.print("A concatenada com B: ");
        copiaA.mostrar();
        System.out.println("Total de elementos na lista concatenada: " + copiaA.contar());

        System.out.println("\n-Teste de Intercalação de Listas Ordenadas-");
        ListaCircularDupla l1 = new ListaCircularDupla();
        l1.inserirFinal(1);
        l1.inserirFinal(3);
        l1.inserirFinal(5);
        System.out.print("Lista Ordenada 1: ");
        l1.mostrar();

        ListaCircularDupla l2 = new ListaCircularDupla();
        l2.inserirFinal(2);
        l2.inserirFinal(4);
        l2.inserirFinal(6);
        System.out.print("Lista Ordenada 2: ");
        l2.mostrar();
        
        ListaCircularDupla intercalada = ListaCircularDupla.intercalar(l1, l2);
        System.out.print("Lista Intercalada: ");
        intercalada.mostrar();
    }
}