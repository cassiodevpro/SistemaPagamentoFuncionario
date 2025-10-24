
public abstract class Funcionario implements FuncionarioInterface {

    private String nomeCompleto;
    private String cidade;
    private String nacionalidade;
    private String sexo;    
    private String email;  
    private String formacao; 
    private int cpf;

    public Funcionario(String cidade, int cpf, String email, String formacao, String nacionalidade, String nomeCompleto, String sexo) {
        this.cidade = cidade;
        this.cpf = cpf;
        this.email = email;
        this.formacao = formacao;
        this.nacionalidade = nacionalidade;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void calculandoComissao(double comissa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculandoComissao'");
    }
    
    
    

}
