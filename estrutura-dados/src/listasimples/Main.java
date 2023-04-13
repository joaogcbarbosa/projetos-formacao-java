package listasimples;

class Main {

    public static void main(String[] args) {

        ListaSimples minhaLista = new ListaSimples();

        minhaLista.insereNoInicio(new No(1));
        System.out.println(minhaLista.exibeLista());

        minhaLista.insereNoInicio(new No(2));
        minhaLista.insereNoInicio(new No(3));
        System.out.println(minhaLista.exibeLista());

        minhaLista.insereNoFim(new No(10));
        System.out.println(minhaLista.exibeLista());
        System.out.println(minhaLista.contarNos());

        minhaLista.excluiNo(2);
        minhaLista.excluiNo(5);
        System.out.println(minhaLista.buscaNo(3));
        System.out.println(minhaLista.exibeLista());
        System.out.println(minhaLista.contarNos());

        minhaLista.insereNoPosicao(2, new No(9));
        System.out.println(minhaLista.exibeLista());
        System.out.println(minhaLista.contarNos());

        minhaLista.insereNoPosicao(6, new No(12));
        System.out.println(minhaLista.exibeLista());

        minhaLista.insereNoPosicao(0, new No(12));
        System.out.println(minhaLista.exibeLista());

        minhaLista.insereNoPosicao(4, new No(15));
        System.out.println(minhaLista.exibeLista());

        minhaLista.insereNoPosicao(6, new No(20));
        System.out.println(minhaLista.exibeLista());

        minhaLista.insereNoPosicao(-12, new No(50));
        System.out.println(minhaLista.exibeLista());

    }

}
