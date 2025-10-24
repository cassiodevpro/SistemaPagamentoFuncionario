import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        FuncionarioAssalariado salario = new FuncionarioAssalariado("sobradinho",  010 , "cassio@cassio", "Desenvolvedor","Brasileiro", "Cassio Moreira", "m"); 
        FuncionarioComissionado comissao = new FuncionarioComissionado("sobradinho",  222 , "cassio@cassio", "Scrum","Brasileiro", "Maria Moreira", "Fc"); 
        FuncionarioHorista horas = new FuncionarioHorista("sobradinho",  333 , "cassio@cassio", "Analista","Brasileiro", "Helena Moreira", "F"); 


        Scanner teclado = new Scanner(System.in);       
        System.out.println(salario.getNomeCompleto() + " Digite seu salario: ");
        double salarioBase = teclado.nextDouble();
        
        System.out.println(comissao.getNomeCompleto() +" Digite o valor vendido no mes: ");
        double comissa = teclado.nextDouble();

        System.out.println(horas.getNomeCompleto() +" Digite quantas horas foram trabalhadas mes:");
        double hora = teclado.nextDouble();
        
        System.out.println("------------Dados Assalariados -------------");
        System.out.println("ola: " + salario.getNomeCompleto() + " CPF: " + salario.getCpf() + " Cargo: " + salario.getFormacao() );
        salario.calculandoSalario(salarioBase);
         System.out.println("------------Dados Comissionados -------------");
         System.out.println("ola: " + comissao.getNomeCompleto() + " CPF: " + comissao.getCpf() + " Cargo: ");
        comissao.calculandoComissao(comissa);
         System.out.println("------------Dados Horistas -------------");
         System.out.println("ola: " + horas.getNomeCompleto() + " CPF: " + horas.getCpf() + " Cargo: ");
        horas.calculandoHora(hora);

    }
}
