package banco;

public class Telefone {
    private String tipoTelefone;
    private String numero;
    private String apelidoTelefone;

    public Telefone (String numero) {
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
