package pilha;

class Main {

    public static void main(String[] args) {
        
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(no1);
        minhaPilha.push(no2);
        minhaPilha.push(no3);

        System.out.println(minhaPilha);

        minhaPilha.pop();

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.top().valor);

    }
    
}
