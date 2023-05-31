package TesteAppMedicamento;
import java.util.Arrays;

class Medicamento {
    private String nome;
    private int quantidade;

    public Medicamento(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome + ": " + quantidade + " caixas";
    }
}

class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private int diagnostico;
    private Medicamento medicamentoIndicado;
    private int quantidadeCaixas;

    public Paciente(String nome, String cpf, String telefone, int diagnostico, Medicamento medicamentoIndicado, int quantidadeCaixas) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.diagnostico = diagnostico;
        this.medicamentoIndicado = medicamentoIndicado;
        this.quantidadeCaixas = quantidadeCaixas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(int diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Medicamento getMedicamentoIndicado() {
        return medicamentoIndicado;
    }

    public void setMedicamentoIndicado(Medicamento medicamentoIndicado) {
        this.medicamentoIndicado = medicamentoIndicado;
    }

    public int getQuantidadeCaixas() {
        return quantidadeCaixas;
    }

    public void setQuantidadeCaixas(int quantidadeCaixas) {
        this.quantidadeCaixas = quantidadeCaixas;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone: " + telefone + "\n" +
                "Diagnóstico: " + getDiagnosticoNome() + "\n" +
                "Medicamento Indicado: " + medicamentoIndicado.getNome() + "\n" +
                "Quantidade de Caixas: " + quantidadeCaixas;
    }

    private String getDiagnosticoNome() {
        switch (diagnostico) {
            case 1:
                return "Covid";
            case 2:
                return "Zica";
            case 3:
                return "Chikungunya";
            case 4:
                return "Dengue";
            default:
                return "Desconhecido";
        }
    }
}

class CadastroPacientes {
    private Paciente[] pacientes;
    private int count;

    public CadastroPacientes() {
        pacientes = new Paciente[10];
        count = 0;
    }

    public void adicionarPaciente(Paciente paciente) {
        if (count < pacientes.length) {
            pacientes[count] = paciente;
            count++;
            System.out.println("Paciente adicionado com sucesso!");
        } else {
            System.out.println("Cadastro de pacientes está cheio!");
        }
    }

    public void removerPaciente(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                pacientes[i] = pacientes[i + 1];
            }
            pacientes[count - 1] = null;
            count--;
            System.out.println("Paciente removido com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void escreverTodoVetor() {
        System.out.println("---- Lista de Pacientes ----");
        for (int i = 0; i < count; i++) {
            System.out.println("Paciente " + (i + 1));
            System.out.println(pacientes[i]);
            System.out.println();
        }
    }

    public void escreverPosicoesOcupadas() {
        System.out.println("---- Posições Ocupadas ----");
        for (int i = 0; i < count; i++) {
            System.out.println("Paciente " + (i + 1));
            System.out.println(pacientes[i]);
            System.out.println();
        }
    }

    public void escreverNomesEmOrdemAlfabetica() {
        if (count > 0) {
            Paciente[] pacientesOrdenados = Arrays.copyOf(pacientes, count);
            Arrays.sort(pacientesOrdenados, (p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));

            System.out.println("---- Nomes em Ordem Crescente ----");
            for (int i = 0; i < count; i++) {
                System.out.println(pacientesOrdenados[i].getNome());
            }
        } else {
            System.out.println("Cadastro de pacientes está vazio!");
        }
    }

    public void percentagemDiagnosticos() {
        if (count > 0) {
            int[] contadorDiagnosticos = new int[4];
            String[] nomesDiagnosticos = {"Covid", "Zica", "Chikungunya", "Dengue"};

            for (int i = 0; i < count; i++) {
                int diagnostico = pacientes[i].getDiagnostico();
                contadorDiagnosticos[diagnostico - 1]++;
            }

            System.out.println("---- Percentagem de Pacientes por Diagnóstico ----");
            for (int i = 0; i < contadorDiagnosticos.length; i++) {
                double percentagem = (double) contadorDiagnosticos[i] / count * 100;
                System.out.println(nomesDiagnosticos[i] + ": " + String.format("%.2f", percentagem) + "%");
            }
        } else {
            System.out.println("Cadastro de pacientes está vazio!");
        }
    }

    public int getCount() {
        return 0;
    }
}
