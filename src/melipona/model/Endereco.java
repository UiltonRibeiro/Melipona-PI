package melipona.model;

/**
 *
 * @author uilto
 */
public class Endereco {
    
    private int id;
    private String  CEP;
    private String cidade;
    private String Estado;
    private String bairro;
    private String nomeRua;
    private int numbResisdencia;
    private String complemento;
    private int idCliente;

    public Endereco(int id, String CEP, String cidade, String Estado, String bairro, String nomeRua, int numbResisdencia, String complemento, int idCliente) {
        this.id = id;
        this.CEP = CEP;
        this.cidade = cidade;
        this.Estado = Estado;
        this.bairro = bairro;
        this.nomeRua = nomeRua;
        this.numbResisdencia = numbResisdencia;
        this.complemento = complemento;
        this.idCliente = idCliente;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getNumbResisdencia() {
        return numbResisdencia;
    }

    public void setNumbResisdencia(int numbResisdencia) {
        this.numbResisdencia = numbResisdencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
