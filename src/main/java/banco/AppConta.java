package banco;

public class AppConta {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(25, 4897);
        ContaCorrente conta2 = new ContaCorrente(24, 7589);

        Telefone telefone1 = new Telefone("34112869");
        telefone1.setApelidoTelefone("Casa");
        telefone1.setTipoTelefone("Fixo");

        Telefone telefone2 = new Telefone("999785412");
        telefone2.setApelidoTelefone("Celular");
        telefone2.setTipoTelefone("Móvel");

        Cliente cliente1 = new Cliente();
        cliente1.setCpf("22222222222");
        cliente1.setNome("João Silva");
        cliente1.addTelefone(telefone1);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("33333333333");
        cliente2.setNome("Maria Fernandes");
        cliente2.addTelefone(telefone2);

        System.out.println(cliente1);
        System.out.println(cliente2);

        conta1.depositar(2000);
        try {
           conta1.sacar(5000);
        } catch (Exception exception){
            System.out.println("Exceção " + exception.getMessage());
        }

        conta1.tranferir(1000, conta2);

        System.out.println("Saldo conta1: " + conta1.getSaldo() + ", Saldo conta2: " + conta2.getSaldo());

    }
}
