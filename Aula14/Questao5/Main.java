package Questao5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testando Lista Circular com No Sentinela");
        
        ListaCircularSentinela listaA = new ListaCircularSentinela();
        listaA.inserirFinal(10);
        listaA.inserirFinal(20);
        listaA.inserirFinal(30);
        System.out.print("Lista A: ");
        listaA.mostrar();
        System.out.println("Total de elementos em A: " + listaA.contar());

        System.out.println("\n-Teste de Cópia-");
        ListaCircularSentinela copiaA = listaA.copiar();
        System.out.print("Copia de A: ");
        copiaA.mostrar();

        System.out.println("\n-Teste de Concatenação-");
        ListaCircularSentinela listaB = new ListaCircularSentinela();
        listaB.inserirFinal(40);
        listaB.inserirFinal(50);
        System.out.print("Lista B: ");
        listaB.mostrar();
        
        copiaA.concatenar(listaB);
        System.out.print("A concatenada com B: ");
        copiaA.mostrar();
        System.out.println("Total de elementos na lista concatenada: " + copiaA.contar());

        System.out.println("\n-Teste de Intercalação de Listas Ordenadas-");
        ListaCircularSentinela l1 = new ListaCircularSentinela();
        l1.inserirFinal(1);
        l1.inserirFinal(3);
        l1.inserirFinal(5);
        System.out.print("Lista Ordenada 1: ");
        l1.mostrar();

        ListaCircularSentinela l2 = new ListaCircularSentinela();
        l2.inserirFinal(2);
        l2.inserirFinal(4);
        l2.inserirFinal(6);
        System.out.print("Lista Ordenada 2: ");
        l2.mostrar();
        
        ListaCircularSentinela intercalada = ListaCircularSentinela.intercalar(l1, l2);
        System.out.print("Lista Intercalada: ");
        intercalada.mostrar();
    }
}