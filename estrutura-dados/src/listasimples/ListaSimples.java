package listasimples;

public class ListaSimples {

    private No primeiro;
    private No ultimo;
    private int numeroNos;

    public ListaSimples() {
        this.primeiro = null;
        this.ultimo = null;
        this.numeroNos = 0;
    }

    public void insereNoInicio(No novoNo) {
        if (this.primeiro == null) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
            novoNo.proximo = null;
        } else {
            novoNo.proximo = primeiro;
            this.primeiro = novoNo;
        }
    }

    public void insereNoFim(No novoNo) {
        if (this.primeiro == null) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
            novoNo.proximo = null;
        } else if (this.ultimo != null) {
            novoNo.proximo = null;
            this.ultimo.proximo = novoNo;
            this.ultimo = novoNo;
        }
    }

    public void insereNoPosicao(No novoNo, int posicao) {
        No noAuxiliar = primeiro;
        int numeroNos = this.contarNos();
        int posAux;
        if (posicao == 0) {
            novoNo.proximo = primeiro;
            primeiro = novoNo;
            if (primeiro == ultimo) {
                ultimo = null;
            }
        } else if (posicao <= numeroNos) {
            posAux = 1;
            while (noAuxiliar != null && posicao > posAux) {
                noAuxiliar = noAuxiliar.proximo;
                posAux++;
            }
            novoNo.proximo = noAuxiliar.proximo;
            noAuxiliar.proximo = novoNo;
        } else if (posicao > numeroNos) {
            ultimo.proximo = novoNo;
            ultimo = novoNo;
        }

    }

    public String buscaNo(int valor) {
        No noAuxiliar = primeiro;
        int posicao = 0;
        while (noAuxiliar != null) {
            if (noAuxiliar.valor == valor) {
                return "Nó " + noAuxiliar.valor + " na posição " + posicao;
            }
            noAuxiliar = noAuxiliar.proximo;
            posicao++;
        }
        return null;
    }

    public void excluiNo(int valor) {
        No noAuxiliar = primeiro;
        No noAuxiliarAnterior;
        while (noAuxiliar != null) {
            noAuxiliarAnterior = noAuxiliar;
            noAuxiliar = noAuxiliar.proximo;
            if (noAuxiliar.valor == valor) {
                noAuxiliarAnterior.proximo = noAuxiliar.proximo;
                return;
            }
        }
    }

    public int contarNos() {
        int tamanho = 0;
        No noAuxiliar = primeiro;
        while (noAuxiliar != null) {
            tamanho++;
            noAuxiliar = noAuxiliar.proximo;
        }
        return tamanho;
    }

    public void exibeLista(){
        No noAuxiliar = primeiro;
        int i = 0;
        while(noAuxiliar != null) {
            System.out.println("Valor " + noAuxiliar.valor + " posição " + i);
            noAuxiliar = noAuxiliar.proximo;
            i++;
        }
    }

}

