public class Pratos{
    String tipo;


    String nome;
    double valor;
    double txEntrega;

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTxEntrega() {
        return this.txEntrega;
    }

    public void setTxEntrega(double txEntrega) {
        this.txEntrega = txEntrega;
    }

    @Override
    public String toString() {
        return "\n\n"+nome+"\nValor: R$"+valor+"\nTaxa de entrega: R$"+txEntrega;
    }

}
