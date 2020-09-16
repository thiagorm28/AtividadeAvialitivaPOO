package banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void sacar(double valor) {
        valor += 0.20;
        super.sacar(valor);
    }

    @Override
    public String toString() {
        return "Conta Corrente, Número: " + getNumero();
    }
}
