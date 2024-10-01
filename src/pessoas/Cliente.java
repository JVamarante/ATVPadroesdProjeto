package src.pessoas;

import src.composicao.Profissao;

import java.util.Scanner;

public class Cliente extends Pessoa {
    private String codigo;
    private Profissao profissao;
    private String tipoProfissaoOutros;
    private Scanner leitor = new Scanner(System.in);

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public void cadastrar() {
        super.cadastrar();
        System.out.println("Informe o código do cliente: ");
        this.codigo = leitor.nextLine();

        System.out.println("Informe a profissão do cliente: ");
        try {
            // Corrigido: agora estamos atribuindo ao atributo da classe, não criando uma nova variável local
            this.profissao = Profissao.valueOf(leitor.nextLine().toUpperCase()); // Converte a entrada para maiúsculas
        } catch (IllegalArgumentException e) {
            System.out.println("Profissão inválida. Certifique-se de que a profissão existe na enumeração.");
        }

        if (this.profissao == Profissao.OUTROS) {
            System.out.println("Informe sua profissão: ");
            this.tipoProfissaoOutros = leitor.nextLine();
        }
    }

    public String toString() {
        return "Cliente{" +
                "codigo='" + codigo + '\'' +
                ", profissao=" + profissao +
                ", tipoProfissaoOutros='" + tipoProfissaoOutros + '\'' +
                "} ";
    }
}
