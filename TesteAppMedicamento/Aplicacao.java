package TesteAppMedicamento;
import java.util.Scanner;

public class Aplicacao{
    private static CadastroPacientes cadastroPacientes;
    private static Medicamento[] medicamentos;

    public static void main(String[] args) {
        cadastroPacientes = new CadastroPacientes();
        medicamentos = new Medicamento[]{
                new Medicamento("CovixUltra", 10),
                new Medicamento("Zicox", 15),
                new Medicamento("ChikTop", 8),
                new Medicamento("Denguenit", 5)
        };

        exibirMenu();
    }

    private static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Remover Paciente");
            System.out.println("3. Exibir Todos os Pacientes");
            System.out.println("4. Exibir Pacientes Ocupados");
            System.out.println("5. Exibir Nomes em Ordem Alfabética");
            System.out.println("6. Exibir Percentagem de Diagnósticos");
            System.out.println("7. Exibir Relatório de Medicamentos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            switch (opcao) {
                case 1:
                    adicionarPaciente(scanner);
                    break;
                case 2:
                    removerPaciente(scanner);
                    break;
                case 3:
                    cadastroPacientes.escreverTodoVetor();
                    break;
                case 4:
                    cadastroPacientes.escreverPosicoesOcupadas();
                    break;
                case 5:
                    cadastroPacientes.escreverNomesEmOrdemAlfabetica();
                    break;
                case 6:
                    cadastroPacientes.percentagemDiagnosticos();
                    break;
                case 7:
                    exibirRelatorioMedicamentos();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarPaciente(Scanner scanner) {
        if (cadastroPacientes == null) {
            System.out.println("Cadastro de pacientes não inicializado!");
            return;
        }

        if (cadastroPacientes.getCount() >= 10) {
            System.out.println("Cadastro de pacientes está cheio!");
            return;
        }

        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.print("CPF do paciente: ");
        String cpf = scanner.nextLine();

        System.out.print("Telefone do paciente: ");
        String telefone = scanner.nextLine();

        System.out.println("Diagnósticos:");
        System.out.println("1. Covid");
        System.out.println("2. Zica");
        System.out.println("3. Chikungunya");
        System.out.println("4. Dengue");
        System.out.print("Diagnóstico do paciente (código numérico): ");
        int diagnostico = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número

        System.out.println("Medicamentos:");
        for (int i = 0; i < medicamentos.length; i++) {
            System.out.println((i + 1) + ". " + medicamentos[i]);
        }
        System.out.print("Escolha o medicamento indicado (código numérico): ");
        int medicamentoIndicado = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número

        System.out.print("Quantidade de caixas indicadas pelo médico: ");
        int quantidadeCaixas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número

        Medicamento medicamento = medicamentos[medicamentoIndicado - 1];
        Paciente paciente = new Paciente(nome, cpf, telefone, diagnostico, medicamento, quantidadeCaixas);
        cadastroPacientes.adicionarPaciente(paciente);
    }

    private static void removerPaciente(Scanner scanner) {
        if (cadastroPacientes == null) {
            System.out.println("Cadastro de pacientes não inicializado!");
            return;
        }

        System.out.print("Índice do paciente a ser removido: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número

        cadastroPacientes.removerPaciente(index - 1);
    }

    private static void exibirRelatorioMedicamentos() {
        if (medicamentos == null || medicamentos.length == 0) {
            System.out.println("Não há medicamentos cadastrados!");
            return;
        }

        System.out.println("----- Relatório de Medicamentos -----");
        for (Medicamento medicamento : medicamentos) {
            System.out.println(medicamento);
        }
    }
}