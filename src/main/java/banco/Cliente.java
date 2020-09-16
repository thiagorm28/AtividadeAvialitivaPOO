package banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cpf;
    private String nome;
    private List<Telefone> telefones = new ArrayList<Telefone>();

    public Cliente() {
        //Construtor padrão explícito
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }

    @Override
    public String toString() {
        String stringTelefones = "";
        for (Telefone t: this.telefones) {
            stringTelefones += "Apelido: " + t.getApelidoTelefone() + ", Número: " + t.getNumero() + ", ";
        }
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", telefones=" + stringTelefones + ']' +
                '}';
    }
}
