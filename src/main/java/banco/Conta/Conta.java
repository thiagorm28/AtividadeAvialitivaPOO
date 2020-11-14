package banco.Conta;

import banco.BaseEntity;
import banco.cliente.Cliente;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Conta extends BaseEntity {
    private double saldo;
    private int agencia;
    private int numero;
    //Agregação unidirecional
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Cliente titular;

    public Conta() {
        super();
    }

    public Conta(Cliente titular, int agencia, int numero) {
        this();
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {

        if (this.saldo < valor) {
            throw new RuntimeException("Saldo Insuficiente, o saldo total é de " + this.getSaldo() +
                    " e o valor da transação é de " + valor);
        } else {
            this.saldo -= valor;
        }
    }

    public void tranferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public double getSaldo() { return this.saldo;}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não é permitido número menor ou iguais a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (numero <= 0) {
            System.out.println("Não é permitido número menor ou iguais a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

}
