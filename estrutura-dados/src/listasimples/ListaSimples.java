package listasimples;

class ListaSimples {

    private No primeiro, ultimo;

    ListaSimples() {
        this.primeiro = this.ultimo = null;
    }

    void insereNoInicio(No novoNo) {
        novoNo.proximo = this.primeiro;
        this.primeiro = novoNo;
    }

    void insereNoFim(No novoNo) {
        No noAuxiliar = this.primeiro;
        while (noAuxiliar.proximo != null) {
            noAuxiliar = noAuxiliar.proximo;
        }
        novoNo.proximo = null;
        noAuxiliar.proximo = novoNo;
        this.ultimo = novoNo;
    }

    void insereNoPosicao(int posicao, No novoNo) {
        No noAuxiliar = this.primeiro;
        No noAuxiliarAnterior = this.primeiro;
        int tamanho = 0;
        if (posicao >= 0) {
            if (posicao == 0) {
                this.insereNoInicio(novoNo);
                return;
            } else if (posicao == this.contarNos()) {
                this.insereNoFim(novoNo);
                return;
            }
            while (this.contarNos() > posicao) {
                if (tamanho == posicao) {
                    noAuxiliarAnterior.proximo = novoNo;
                    novoNo.proximo = noAuxiliar;
                    return;
                }
                noAuxiliarAnterior = noAuxiliar;
                noAuxiliar = noAuxiliar.proximo;
                tamanho++;
            }
        }
    }

    No buscaNo(int valor) {
        No noAuxiliar = this.primeiro;
        while (noAuxiliar != null) {
            if (noAuxiliar.valor == valor) {
                return noAuxiliar;
            }
            noAuxiliar = noAuxiliar.proximo;
        }
        return null;
    }

    void excluiNo(int valor) {
        No noAuxiliar = this.primeiro;
        No noAuxiliarAnterior = this.primeiro;
        while (noAuxiliar != null) {
            if (noAuxiliar.valor == valor) {
                noAuxiliarAnterior.proximo = noAuxiliar.proximo;
                return;
            }
            noAuxiliarAnterior = noAuxiliar;
            noAuxiliar = noAuxiliar.proximo;
        }
    }

    int contarNos() {
        No noAuxiliar = this.primeiro;
        int tamanho = 0;
        while (noAuxiliar != null) {
            tamanho++;
            noAuxiliar = noAuxiliar.proximo;
        }
        return tamanho;
    }

    String exibeLista() {
        if (this.contarNos() != 0) {
            String lista = "";
            No noAuxiliar = this.primeiro;
            while (noAuxiliar != null) {
                lista += "Nó " + noAuxiliar.valor + " --> ";
                noAuxiliar = noAuxiliar.proximo;
            }
            return lista;
        }
        return "A lista está vazia.";
    }

}

