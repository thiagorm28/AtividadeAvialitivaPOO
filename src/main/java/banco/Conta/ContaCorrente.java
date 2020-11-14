package banco.Conta;

import banco.Conta.Conta;
import banco.cliente.Cliente;

import javax.persistence.Entity;

@Entity
public class ContaCorrente extends Conta {

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(Cliente titular, int agencia, int numero) {
        super(titular, agencia, numero);
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
