   
public class Paciente
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome, cpf, telefone;
    private int diagnostico;
    private Medicamento medicamento;

    //Construtor para objetos da classe Paciente
    public Paciente(String nome, String cpf, String telefone, int diagnostico, Medicamento medicamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.diagnostico = diagnostico;
        this.medicamento = medicamento;
    }
    
    public String toString() {
        String retorno = "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nDiagnóstico: " + getDiagnosticoString();
        
        retorno += "\nMedicamento: " + (medicamento != null ? medicamento.getNome() : "Indisponível");
        retorno += "\nQuantidade de caixas indicada pelo médico: " + medicamento.getQuantCaixas();
        
        return retorno;
    }
    
    public String getDiagnosticoString() {
        switch(diagnostico) {
            case 1:
                return "Covid";
            case 2:
                return "Zika";
            case 3:
                return "Chikungunya";
            case 4:
                return "Dengue";
            default:
                return "Indisponível";
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public int getDiagnostico() {
        return diagnostico;
    }
    
    public Medicamento getMedicamento() {
        return medicamento;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setDiagnostico(int diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}
