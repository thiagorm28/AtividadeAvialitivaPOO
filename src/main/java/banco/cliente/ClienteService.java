package banco.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public void criarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public int getQuantidadeDeTelefonesPeloCliente(Cliente cliente) {
        Optional<Cliente> clienteEncontrado = clienteRepository.findById(cliente.getId());
        return clienteEncontrado.get().getTelefones().size();
    }
}
