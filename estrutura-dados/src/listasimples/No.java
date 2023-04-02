package listasimples;

public class No {

    public int valor;
    public No proximo;
    // imaginar a instância de um nó como um container:
    // 1) Contendo um valor inteiro definido pelo usuário;
    // 2) E um valor padrão de referência a um próximo nó apontando para nulo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

}

