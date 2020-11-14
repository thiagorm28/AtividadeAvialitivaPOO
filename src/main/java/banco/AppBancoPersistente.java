package banco;

import banco.Conta.ContaCorrente;
import banco.Conta.ContaService;
import banco.cliente.Cliente;
import banco.cliente.ClienteService;
import banco.telefone.Telefone;
import banco.telefone.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppBancoPersistente implements CommandLineRunner {
    @Autowired
    ClienteService clienteService;
    @Autowired
    ContaService contaService;
    @Autowired
    TelefoneService telefoneService;

    public static void main(String[] args) {
        SpringApplication.run(AppBancoPersistente.class, args).close();;
    }

    @Override
    public void run(String... args) throws Exception {
        Cliente cliente1 = new Cliente("22222222222", "João Silva");
        cliente1.setCpf("22222222222");
        cliente1.setNome("João Silva");
        Telefone telefone1 = new Telefone("34112869", "Casa", "Fixo");
        Telefone telefone2 = new Telefone("999785412", "Celular", "Móvel");
        cliente1.addTelefone(telefone1);
        cliente1.addTelefone(telefone2);
        ContaCorrente conta1 = new ContaCorrente(cliente1, 25, 4897);
        telefoneService.criarTelefone(telefone1);
        telefoneService.criarTelefone(telefone2);
        clienteService.criarCliente(cliente1);
        contaService.criarConta(conta1);


        System.out.println("O cliente " + cliente1.getNome() + " possui: "
                + clienteService.getQuantidadeDeTelefonesPeloCliente(cliente1) + " números cadastrados");

    }
}
