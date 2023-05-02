
/**
 * usando a clase Aluno2 na aplicação
 *
 * @author (Giraffa)
 * @version (aula de 11 e 13 maio)
 */
public class Aluno2
{
    //atributos heterogeneos de tipos diferentes
    private int idade;
    private double nota1,nota2,nota3;
    private String nome;

    /**
     * Constructor class Aluno2 *****define uma especie de regra para se criar o instanciar objetos desta classe **** new
     */
    public Aluno2(String nome, int idade, double nota1,double nota2,double nota3)
    {
        this.nome=nome;
        this.idade=idade;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        
    }
        
    /**
     * metodos de acesso getters =====funções==== eles retornam o conteudo armazenado no objeto criado
     */
     public String getNome()  {return nome;}
     public int getIdade()    {return idade;}
     public double getNota1() {return nota1;}
     public double getNota2() {return nota2;}
     public double getNota3() {return nota3;}
   
    /**
     * metodos de modificação setters ==procedimentos ====trocam conteudos de objetos criados
     */
     public void setNome(String nome) {this.nome=nome;}// public void setNome(String nomeX){ nome=nomeX;}
     public void setIdade(int idadeX) { this.idade=idadeX;}
     public void setNota1(double nota) { this.nota1=nota;}
     public void setNota2(double nota2) { this.nota2=nota2;}
     public void setNota3(double nota3) { this.nota3=nota3;}
    /**
     * metodos de exibicao conteudos dos atributos do objeto
     */
    public String toString () 
    {
    return "\n Nome do aluno= "+ nome+"\n Idade= "+idade+ "\n Nota1= "+nota1+ "\n Nota2= "+nota2+"\n Nota3= "+nota3;
    
   }
}
