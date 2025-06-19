public class Main {
    public static void main(String[] args) {
        FilaImpressao fila = new FilaImpressao();

        fila.adicionar_documento_normal();
        fila.adicionar_documento_normal();
        fila.adicionar_documento_urgente();
        fila.adicionar_documento_normal();
        fila.adicionar_documento_urgente();

        System.out.println("\n--- Fila Atual ---");
        fila.visualizar_fila();

        System.out.println("\nTotal de documentos: " + fila.total_documentos());
        System.out.println("Total de páginas: " + fila.total_paginas());

        fila.processar_proximo();
        fila.processar_ultimo();

        System.out.println("\n--- Fila Após Processamento ---");
        fila.visualizar_fila();
        System.out.println("\nTotal de documentos: " + fila.total_documentos());
        System.out.println("Total de páginas: " + fila.total_paginas());
    }
}
