package Questao3;

public class Main {
    public static void main(String[] args) {
        ListaCircular listaA = new ListaCircular();
        listaA.inserirFinal(10);
        listaA.inserirFinal(20);
        listaA.inserirFinal(30);
        listaA.mostrar();
        
        ListaCircular listaB = new ListaCircular();
        listaB.inserirFinal(40);
        listaB.inserirFinal(50);
        
        listaA.concatenar(listaB);
        listaA.mostrar();
    }
}