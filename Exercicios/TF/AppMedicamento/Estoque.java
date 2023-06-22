 
public class Estoque {
    private int[] estoques = new int[4];

    public Estoque(){
        estoques[0] = 10; //CovixUltra
        estoques[1] = 10; //Zicox
        estoques[2] = 10; //ChikTop
        estoques[3] = 10; //Denguenit
    }

    public boolean addMedicamento(Medicamento medicamento) {
        int index = getIndexForMedicamento(medicamento.getNome());
        
        if (estoques[index] >= medicamento.getQuantCaixas()) {
            estoques[index] -= medicamento.getQuantCaixas();
            return true;
        }
        
        return false;
    }
    
    public void reestoque(String nome, int quantidade) {
        int index = getIndexForMedicamento(nome);
        
        estoques[index] += quantidade;
    }
    
    public int getIndexForMedicamento(String nome) {
        switch (nome) {
            case "CovixUltra":
                return 0;
            case "Zicox":
                return 1;
            case "ChikTop":
                return 2;
            case "Denguenit":
                return 3;
        }
        
        return -1;
    }
    
    public void listarEstoque() {
        System.out.println("Caixas disponíveis de cada medicamento:");
        System.out.println("CovixUltra: " + estoques[0]);
        System.out.println("Zicox: "      + estoques[1]);
        System.out.println("ChikTop: "    + estoques[2]);
        System.out.println("Denguenit; "  + estoques[3]);
    }
    
    public int getEstoque(String nome) {
        int index = getIndexForMedicamento(nome);
        
        return estoques[index];
    }
}
