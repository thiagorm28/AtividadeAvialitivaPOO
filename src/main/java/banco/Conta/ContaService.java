package banco.Conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ContaService {
    @Autowired
    ContaRepository contaRepository;

    public void criarConta(Conta conta) {
        contaRepository.save(conta);
    }

}
