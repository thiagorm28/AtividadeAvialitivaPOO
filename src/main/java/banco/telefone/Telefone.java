package banco.telefone;

import banco.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Telefone extends BaseEntity {
    private String tipoTelefone;
    private String numero;
    private String apelidoTelefone;

    public Telefone() {
        super();
    }

    public Telefone (String numero, String tipoTelefone, String apelidoTelefone) {
        this();
        this.numero = numero;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getApelidoTelefone() {
        return apelidoTelefone;
    }

    public void setApelidoTelefone(String apelidoTelefone) {
        this.apelidoTelefone = apelidoTelefone;
    }
}
