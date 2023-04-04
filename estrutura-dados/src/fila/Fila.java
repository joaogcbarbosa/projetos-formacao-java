package fila;

class Fila {

    private No proximoEntrada;

    Fila() {
        this.proximoEntrada = null;
    }

    void enqueue(No novoNo) {
        novoNo.proximo = this.proximoEntrada;
        this.proximoEntrada = novoNo;
    }

    void dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = this.proximoEntrada;
            No noAuxiliar = this.proximoEntrada;
            while (primeiroNo.proximo != null) {
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.proximo;
            }
            noAuxiliar.proximo = primeiroNo.proximo;
        }
    }

    No first() {
        if (!this.isEmpty()) {
            No primeiroNo = this.proximoEntrada;
            while (primeiroNo.proximo != null) {
                primeiroNo = primeiroNo.proximo;
            }
            return primeiroNo;
        }   
        return null; 
    }

    boolean isEmpty() {
        return this.proximoEntrada == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = this.proximoEntrada;

        if (this.proximoEntrada != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.valor + "}] --->";
                if (noAuxiliar.proximo != null) {
                    noAuxiliar = noAuxiliar.proximo;
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
    
}
