public class Bicho{
    private int idade;
    private double peso;
    private String nome;

    public Bicho(String nome, int idade, double peso){
        this.nome=nome;
        this.idade=idade;
        this.peso=peso;
    }

    public String getNome() {
        return nome;
    };

    public int getIdade(){
        return idade;
    }

    public double getPeso(){
        return peso;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setIdade(int idadeX) {
        idade=idadeX;
    }

    public void setPeso(double pesoX) {
        peso=pesoX;
    }

    public String toString(){
        return "\n Nome do bicho =" + nome+"\n Idade= "+idade+"\n Peso= "+ peso;
    }
}