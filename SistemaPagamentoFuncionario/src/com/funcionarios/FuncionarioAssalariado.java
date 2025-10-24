public class FuncionarioAssalariado extends Funcionario {

    public FuncionarioAssalariado (String cidade, int cpf, String email, String formacao, String nacionalidade, String nomeCompleto, String sexo){
        super(cidade, cpf, email, formacao, nacionalidade, nomeCompleto, sexo);
        
    }  

    public void calculandoSalario(double salario ) {
        double bonus = 500;       
        System.out.println("Seu salario + bonus esse mes sera:" +  (bonus+salario) + "Reais");
    }

    @Override
    public void calcularSalario() {

    }

    @Override
    public void calculandoHora() {

    }

    @Override
    public void calculandoComissao() {

    }

}
