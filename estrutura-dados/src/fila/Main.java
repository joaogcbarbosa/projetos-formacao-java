package fila;

class Main {

    public static void main(String[] args) {
        
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
    
        Fila minhaFila = new Fila();

        System.out.println();
        System.out.println(minhaFila.first());
        System.out.println();
        minhaFila.enqueue(no1);
        minhaFila.enqueue(no3);
        System.out.println(minhaFila);
        System.out.println();
        minhaFila.enqueue(no2);
        minhaFila.dequeue();
        System.out.println(minhaFila);

    }

}
