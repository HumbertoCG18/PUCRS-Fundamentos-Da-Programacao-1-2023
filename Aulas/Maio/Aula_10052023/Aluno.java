package Aulas.Maio.Aula_10052023;
/**
 * exemplo Classe Aluno
 *
 * @author (Giraffa)
 * @version (aula 9 de maio)
 */
public class Aluno{
    //atributos heterogeneos de tipos diferentes
    private int idade;
    private double nota1,nota2,nota3;
    private String nome, disc;

    /**
     * Constructor class Aluno *****define uma especie de regra para se criar o instanciar objetos desta classe **** new
     */
    
    public Aluno(String nome, int idade, String disc, double nota1,double nota2,double nota3){
        this.nome=nome;
        this.disc=disc;
        this.idade=idade;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        
        //public Aluno(String nomeX, int idadeX, String discX, double nota1X,double nota2X,double nota3X)
    //{  sem uso do this
    //    nome=nomeX;
     //   disc=discX;
     //   idade=idadeX;
     //   nota1=nota1X;
     //   nota2=nota2X;
     //   nota3=nota3X;
        
    //}
    }
    
    //public Aluno(String nome, int idade, String disc, double nota,double nota2,double nota3)
    //{
    //    setNome(nome);
    //    setDisc(disc);
    //    setIdade(idade);
    //    setNota1(nota1);
    //    setNota2(nota2);
    //    setNota3(nota3);
        
    //}
    
    /**
     * metodos de acesso getters =====fun��es==== eles retornam o conteudo armazenado no objeto criado
     */
     public String getNome()  {return nome;}
     public String getDisc()  {return disc;}
     public int getIdade()    {return idade;}
     public double getNota1() {return nota1;}
     public double getNota2() {return nota2;}
     public double getNota3() {return nota3;}
   
    /**
     * metodos de modifica��o setters ==procedimentos ====trocam conteudos de objetos criados
     */
     public void setNome(String nome) {this.nome=nome;}// public void setNome(String nomeX){ nome=nomeX;}
     public void setDisc(String disc) { this.disc=disc;}
     public void setIdade(int idadeX) { this.idade=idadeX;}
     public void setNota1(double nota) { this.nota1=nota;}
     public void setNota2(double nota2) { this.nota2=nota2;}
     public void setNota3(double nota3) { this.nota3=nota3;}
    /**
     * metodos de exibicao conteudos dos atributos do objeto
     */
    public String toString (){
    return "\n Nome do aluno= "+ nome+"\n Disciplina= "+disc+"\n Idade= "+idade+ "\n Nota1= "+nota1+ "\n Nota2= "+nota2+"\n Nota3= "+nota3;
    
   }
}
