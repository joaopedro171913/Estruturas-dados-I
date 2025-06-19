import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FilaImpressao {
    private No inicio;
    private No fim;
    private Set<Integer> idsGerados;
    private Random random;
    private String[] tiposDocumento = {"PDF", "TXT", "JPG", "PNG", "DOCX", "XLSX"};

    public FilaImpressao() {
        this.inicio = null;
        this.fim = null;
        this.idsGerados = new HashSet<>();
        this.random = new Random();
    }

    private Documento gerarDocumento() {
        int id;
        do {
            id = random.nextInt(1000) + 1;
        } while (idsGerados.contains(id));
        idsGerados.add(id);

        String tipo = tiposDocumento[random.nextInt(tiposDocumento.length)];
        int paginas = random.nextInt(100) + 1;

        return new Documento(id, tipo, paginas);
    }

    public void adicionar_documento_normal() {
        Documento doc = gerarDocumento();
        No novo = new No(doc);
        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.anterior = fim;
            fim.proximo = novo;
            fim = novo;
        }
        System.out.println("Documento adicionado no final: " + doc);
    }

    public void adicionar_documento_urgente() {
        Documento doc = gerarDocumento();
        No novo = new No(doc);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        System.out.println("Documento urgente adicionado no início: " + doc);
    }

    public Documento processar_proximo() {
        if (inicio == null) {
            System.out.println("Fila de impressão vazia!");
            return null;
        }
        Documento doc = inicio.documento;
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null;
        }
        idsGerados.remove(doc.id);
        System.out.println("Processando próximo documento: " + doc);
        return doc;
    }

    public Documento processar_ultimo() {
        if (fim == null) {
            System.out.println("Fila de impressão vazia!");
            return null;
        }
        Documento doc = fim.documento;
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null;
        }
        idsGerados.remove(doc.id);
        System.out.println("Processando último documento: " + doc);
        return doc;
    }

    public void visualizar_fila() {
        if (inicio == null) {
            System.out.println("Fila de impressão vazia!");
            return;
        }
        System.out.println("Documentos na fila:");
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.documento);
            atual = atual.proximo;
        }
    }

    public boolean fila_vazia() {
        return inicio == null;
    }

    public int total_documentos() {
        int count = 0;
        No atual = inicio;
        while (atual != null) {
            count++;
            atual = atual.proximo;
        }
        return count;
    }

    public int total_paginas() {
        int total = 0;
        No atual = inicio;
        while (atual != null) {
            total += atual.documento.paginas;
            atual = atual.proximo;
        }
        return total;
    }
}
