package banco.Conta;

import banco.Conta.Conta;
import banco.cliente.Cliente;

import javax.persistence.Entity;

@Entity
public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Cliente titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }


}
