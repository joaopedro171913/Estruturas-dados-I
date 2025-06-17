package QUESTAO1;

public class ListaDuplEncD {
    No cabeca;
    No cauda;

    public ListaDuplEncD() {
        this.cabeca = null;
        this.cauda = null;
    }

    public void adicionar(int valor) {
        No novo = new No(valor);
        if (cabeca == null) {
            cabeca = novo;
            cauda = novo;
        } else {
            cauda.proximo = novo;
            novo.anterior = cauda;
            cauda = novo;
        }
    }

    public void mostrar() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void concatenar(ListaDuplEncD outra) {
        if (outra.cabeca == null) {
            return;
        }
        if (this.cabeca == null) {
            this.cabeca = outra.cabeca;
            this.cauda = outra.cauda;
        } else {
            this.cauda.proximo = outra.cabeca;
            outra.cabeca.anterior = this.cauda;
            this.cauda = outra.cauda;
        }
    }

    public ListaDuplEncD[] separar() {
        ListaDuplEncD l1 = new ListaDuplEncD();
        ListaDuplEncD l2 = new ListaDuplEncD();

        if (cabeca == null) {
            return new ListaDuplEncD[] { l1, l2 };
        }

        No lento = cabeca;
        No rapido = cabeca;

        while (rapido != null && rapido.proximo != null) {
            lento = lento.proximo;
            rapido = rapido.proximo.proximo;
        }

        No atual = cabeca;
        while (atual != lento) {
            l1.adicionar(atual.valor);
            atual = atual.proximo;
        }
        while (atual != null) {
            l2.adicionar(atual.valor);
            atual = atual.proximo;
        }

        return new ListaDuplEncD[] { l1, l2 };
    }

    public ListaDuplEncD intercalar(ListaDuplEncD outra) {
        ListaDuplEncD nova = new ListaDuplEncD();
        No a = this.cabeca;
        No b = outra.cabeca;

        while (a != null && b != null) {
            if (a.valor <= b.valor) {
                nova.adicionar(a.valor);
                a = a.proximo;
            } else {
                nova.adicionar(b.valor);
                b = b.proximo;
            }
        }
        while (a != null) {
            nova.adicionar(a.valor);
            a = a.proximo;
        }
        while (b != null) {
            nova.adicionar(b.valor);
            b = b.proximo;
        }
        return nova;
    }

    static class No {
        int valor;
        No anterior, proximo;

        No(int valor) {
            this.valor = valor;
            this.anterior = null;
            this.proximo = null;
        }
    }
}