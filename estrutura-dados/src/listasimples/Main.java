package listasimples;

public class Main {

    public static void main(String[] args) {

        ListaSimples minhaLista = new ListaSimples();

        minhaLista.insereNoFim(new No(1));
        minhaLista.insereNoFim(new No(2));
        minhaLista.insereNoFim(new No(5));
        minhaLista.insereNoPosicao(new No(4), 2);
        minhaLista.insereNoPosicao(new No(0), 0);
        minhaLista.insereNoPosicao(new No(3), 2);

        minhaLista.exibeLista();

        minhaLista.excluiNo(2);
        System.out.println();
        minhaLista.exibeLista();

        minhaLista.excluiNo(5);
        System.out.println();
        minhaLista.exibeLista();

    }

}
