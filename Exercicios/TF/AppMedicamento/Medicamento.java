 
public class Medicamento{
    
    //Atributos da classe Medicamento
    private String nome;
    private int quantCaixas;
    private int[] estoqueTodos = {10, 10, 10 ,10};
    
    //Construtor
    public Medicamento(String nome, int quantCaixas){
        this.nome = nome;
        this.quantCaixas = quantCaixas;
    }
    
    //Getters
    public String getNome(){return nome;}
    public int getQuantCaixas(){return quantCaixas;}
    
    //Setters
    public void setNome(String nome){this.nome = nome;}
    public void setCaixas(int quantCaixas){this.quantCaixas = quantCaixas;}
    
    //toString
    public String toString(){
        return "Nome do medicamento: " + nome + "\nQuantidade de caixas a serem consumidas: " + quantCaixas;
    }
}
