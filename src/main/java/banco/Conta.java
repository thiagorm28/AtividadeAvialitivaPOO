package banco;

public abstract class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    //Construtor alternativo
    public Conta(int agencia, int numero) {
        total++;
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

    public static int getTotal() {
        return total;
    }
}
