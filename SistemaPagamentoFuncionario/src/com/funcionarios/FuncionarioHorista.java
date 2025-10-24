
public class FuncionarioHorista extends Funcionario {

    public FuncionarioHorista(String cidade, int cpf, String email, String formacao, String nacionalidade,
            String nomeCompleto, String sexo) {
        super(cidade, cpf, email, formacao, nacionalidade, nomeCompleto, sexo);

    }

    public void calculandoHora(double horasTrabalhadas) {
        double valorHoras = 25.00;
        System.out.println("Voce recebera  " + (valorHoras * horasTrabalhadas) + "Reais");
    }

    @Override
    public void calculandoHora() {

    }

    @Override
    public void calcularSalario() {
    }

    @Override
    public void calculandoComissao() {
    }
}
