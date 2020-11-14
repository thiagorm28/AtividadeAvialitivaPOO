package banco.cliente;

import banco.BaseEntity;
import banco.Conta.Conta;
import banco.telefone.Telefone;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Cliente extends BaseEntity {
    private String cpf;
    private String nome;
    //Associação many to many unidirecional
    @ManyToMany
    private List<Telefone> telefones = new ArrayList<Telefone>();
    //Associação one to one bidirecional
    @OneToOne
    private Cliente conjugue;

    public Cliente() {
        super();
    }

    public Cliente(String cpf, String nome) {
        this();
        this.cpf = cpf;
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return Collections.unmodifiableList(telefones);
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
