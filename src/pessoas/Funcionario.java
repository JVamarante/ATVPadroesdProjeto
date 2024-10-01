package src.pessoas;

import src.composicao.Cargo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private int matricula;
    private Cargo cargo;
    private double salario;
    private LocalDate dataAdmissao;
    private Scanner leitor = new Scanner(System.in);

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    // Método para cadastrar funcionário
    public void cadastrar() {
        super.cadastrar(); // Chama o método de cadastro da classe Pessoa
        System.out.println("Informe a matrícula do funcionário: ");
        this.matricula = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe o cargo do funcionário: ");
        String nomeCargo = leitor.nextLine();
        this.cargo = new Cargo(nomeCargo);

        System.out.println("Informe o salário do funcionário: ");
        this.salario = Double.parseDouble(leitor.nextLine());

        System.out.println("Informe a data de admissão do funcionário (dd/MM/yyyy): ");
        String dataAdmissaoStr = leitor.nextLine();
        this.dataAdmissao = LocalDate.parse(dataAdmissaoStr, formatter); // Usando o formatter para o formato dd/MM/yyyy
    }

    // Método para reajustar o salário
    public void reajustarSalario() {
        System.out.println("Informe o percentual de reajuste do salário: ");
        double percentual = Double.parseDouble(leitor.nextLine());
        this.salario += this.salario * (percentual / 100);
        System.out.println("Salário reajustado para: " + this.salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", dataNascimento=" + getDataNascimento() +
                ", cargo=" + cargo.getNomeCargo() +
                ", salario=" + salario +
                ", dataAdmissao=" + dataAdmissao.format(formatter) + // Exibe a data no formato dd/MM/yyyy
                "} ";
    }
}
