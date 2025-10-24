
public class FuncionarioComissionado extends Funcionario {

    public FuncionarioComissionado(String cidade, int cpf, String email, String formacao, String nacionalidade,
            String nomeCompleto, String sexo) {
        super(cidade, cpf, email, formacao, nacionalidade, nomeCompleto, sexo);

    }

    
    public void calculandoComissao(double comissao) {
        double porcetVendas = 10.00;
        System.out.println("Sua comissao esse mes foi: " + (porcetVendas * comissao) / 100 + "Reais");
    }

    @Override

    public void calculandoComissao() {
    };

    @Override
    public void calcularSalario() {
    }

    @Override
    public void calculandoHora() {
    }

}
