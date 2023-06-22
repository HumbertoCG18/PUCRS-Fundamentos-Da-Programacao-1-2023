package TesteAppMedicamenoV2;
import java.util.Arrays;

public class CadastroPacientes {
    private Paciente[] cadastro;
    private int numeroDePacientes = 0;
    
    public CadastroPacientes() {
        cadastro = new Paciente[10];
    }
    
    public void addNoVetor(Paciente paciente) {
        if (numeroDePacientes < 10) {
            System.out.println("Paciente adicionado");
            cadastro[numeroDePacientes] = paciente;
            numeroDePacientes += 1;
        } else {
            System.out.println("Número máximo de pacientes atingido");
        }
    }
    
    public void removerNoVetor(Paciente paciente) {
        for (int i = 0; i < cadastro.length; i++) {
            if (cadastro[i] == paciente){
                cadastro[i] = null;
                
                numeroDePacientes -= 1;
            }
        }
    }

    public void listarPacientes () {
        for (int i = 0; i < cadastro.length; i++) {
            System.out.println("Paciente " + (i + 1) + ":");
            
            System.out.println(cadastro[i]);
            
            System.out.println();
        }
    }
    
    public void listarPacientesRegistrados () {
        for (int i = 0; i < cadastro.length; i++) {
            if (cadastro[i] != null) {
                System.out.println("Paciente " + (i + 1) + ":");
                
                System.out.println(cadastro[i]);
                
                System.out.println();
            }
        }
    }
    
    public void listarPacientesAlfabetica() {
        Paciente[] pacientesOrdenados = Arrays.copyOf(cadastro, numeroDePacientes);
        Arrays.sort(pacientesOrdenados, (p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));

        System.out.println("---- Nomes em Ordem Crescente ----");
        for (int i = 0; i < numeroDePacientes; i++) {
            System.out.println(pacientesOrdenados[i].getNome());
            
            System.out.println();
        }
    }
    
    public void porcentagemDiagnosticos() {
        int[] contadorDiagnosticos = new int[4];
        String[] nomesDiagnosticos = {"Covid", "Zica", "Chikungunya", "Dengue"};

        for (int i = 0; i < numeroDePacientes; i++) {
            int diagnostico = cadastro[i].getDiagnostico();
            contadorDiagnosticos[diagnostico - 1]++;
        }

        System.out.println("---- Percentagem de Pacientes por Diagnóstico ----");
        for (int i = 0; i < contadorDiagnosticos.length; i++) {
            double percentagem = (double) contadorDiagnosticos[i] / numeroDePacientes * 100;
            System.out.println(nomesDiagnosticos[i] + ": " + String.format("%.2f", percentagem) + "%");
        }
    }
    
    public Paciente getPacienteFromIndex(int index) {
        return cadastro[index];
    }
}