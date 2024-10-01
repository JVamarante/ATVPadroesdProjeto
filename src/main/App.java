package src.main;


import src.pessoas.Cliente;
import src.pessoas.Funcionario;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionário");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    cadastrarCliente();
                    break;
                case "2":
                    cadastrarFuncionario();
                    break;
                case "3":
                    System.out.println("Saindo...");
                    running = false;
                    saiuMesmo();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    public static void cadastrarCliente() {
        System.out.println("Cadastro de Cliente:");
        Cliente cliente = new Cliente();
        cliente.cadastrar();
        System.out.println(cliente);
    }

    public static void cadastrarFuncionario() {
        System.out.println("Cadastro de Funcionário:");
        Funcionario funcionario = new Funcionario();
        funcionario.cadastrar();
        System.out.println(funcionario);
    }

    public static void saiuMesmo() {
        System.out.println("Saiu !");
    }

}

