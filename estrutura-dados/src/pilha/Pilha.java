package pilha;

class Pilha {

    private No proximoTopo;

    Pilha() {
        this.proximoTopo = null;
    }

    No top() {
        return this.proximoTopo;
    }

    void push(No novoNo) {
        if (this.isEmpty()) {
            this.proximoTopo = novoNo;
        } else {
            novoNo.proximo = this.proximoTopo;
            this.proximoTopo = novoNo;
        }
    }

    void pop() {
        if (!this.isEmpty()) {
            this.proximoTopo = this.top().proximo;
        }
    }

    boolean isEmpty() {
        return this.proximoTopo == null;
    }

    @Override
    public String toString() {
        String stack;
        stack = "------------\n";
        stack += "   Pilha\n";
        stack += "------------\n";
        
        No noAuxiliar = proximoTopo;
        
        while (true) {
            if (noAuxiliar != null) {
                stack += "[No{dado=" + noAuxiliar.valor + "}]\n";
                noAuxiliar = noAuxiliar.proximo;
            } else {
                stack += "============\n";
                return stack;
            }
        }
    }
  
}
