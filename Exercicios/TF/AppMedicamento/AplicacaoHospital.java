 
import java.util.*;

public class AplicacaoHospital{
    public static CadastroPacientes cadastro = new CadastroPacientes();
    public static Estoque estoque = new Estoque();
    private static Scanner input;
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\f");
        System.out.println("--- Bem-vindo ao cadastro da Unidade de Pronto Atendimento ---");
        
        while(true){
            int choice = menu();
            if(choice == 0){
                System.out.println("Obrigado por utilizar nossos serviços!");
                break;
            }
            switch(choice){
                case 1:
                    addPaciente(input);
                    break;
                case 2:
                    System.out.println("Digite o índice do paciente a ser removido: ");
                    int i = input.nextInt();
                    input.nextLine(); // Consumir a quebra de linha após o número
                    cadastro.removerNoVetor(cadastro.getPacienteFromIndex(i));
                    //input.nextLine();
                    break;
                case 3:
                    cadastro.listarPacientes();
                    break;
                case 4:
                    cadastro.listarPacientesRegistrados();
                    break;
                case 5:
                    cadastro.listarPacientesAlfabetica();
                    break;
                case 6:
                    cadastro.porcentagemDiagnosticos();
                    break;
                case 7:
                    estoque.listarEstoque();
                    break;
            }
        }
    }
    
    public static void addPaciente(Scanner input) {
        String nome, nomeMedicamento, cpf, telefone;
        int diagnostico, quantCaixas;
        Medicamento medicamento;
        
        System.out.println("Digite o nome do paciente:");
        nome = input.nextLine();
        
        System.out.println("Digite o cpf do paciente:");
        cpf = input.nextLine();
        
        System.out.println("Digite o telefone do paciente:");
        telefone = input.nextLine();
        
        System.out.println("Diagnósticos:");
        System.out.println("1. Covid");
        System.out.println("2. Zica");
        System.out.println("3. Chikungunya");
        System.out.println("4. Dengue");
        System.out.print("Diagnóstico do paciente (código numérico): ");
        diagnostico = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha após o número
        
        switch (diagnostico) {
            case 1:
                nomeMedicamento = "CovixUltra";
                break;
            case 2:
                nomeMedicamento = "Zicox";
                break;
            case 3:
                nomeMedicamento = "ChikTop";
                break;
            case 4:
                nomeMedicamento = "Denguenit";
                break;
            default:
                nomeMedicamento = "Indisponínel";
        }
        
        System.out.println("O medicamento a ser tomado pelo paciente é o " + nomeMedicamento);
        System.out.println("Digite a quantidade de caixas recomendadas pelo médico:");
        quantCaixas = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha após o número
        
        medicamento = new Medicamento(nomeMedicamento, quantCaixas);
        
        estoque.addMedicamento(medicamento);
        
        Paciente paciente = new Paciente(nome, cpf, telefone, diagnostico, medicamento);
        
        cadastro.addNoVetor(paciente);
    }
    
    //Método de menu para seleção de opções do programa
    public static int menu(){
        input = new Scanner(System.in);
        System.out.println("SELECIONE A OPÇÃO DESEJADA");
        System.out.println("---------------------------------------------------------");
        System.out.println("1. Adicionar paciente");
        System.out.println("2. Remover paciente");
        System.out.println("3. Mostrar lista de pacientes");
        System.out.println("4. Listar pacientes registrados");
        System.out.println("5. Listar pacientes registrados em ordem alfabética");
        System.out.println("6. Mostrar porcentagem de pacientes com cada doença");
        System.out.println("7. Demonstrar o estoque disponível de cada medicamento");
        System.out.println("---------------------------------------------------------");
        System.out.println("0. Sair");
        int choice = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha após o número
        return choice;
    }
}
