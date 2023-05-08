package Aulas.Maio.Aula_08052023;
/**
 * usando a clase Aluno2 na aplica��o
 *
 * @author (Giraffa)
 * @version (aula de 11 e 13 maio)
 */

public class Monitor{
    //possui dois atributos
    private Aluno a;//variavel de objeto
    //quando se cria uma Classe ela e entendida como um novo tipo de dado
    //lembrar Scanner ..<<<<< String
     //esta declaracao e que "cria" a flechinha a composicao
    private int horas;
    
    public Monitor(Aluno x, int hora){
        a=x;
        horas=hora;
    }
    
    public Aluno getA() { return a;}//get no objeto
    public void setA( Aluno y){ a=y;}
    
    public int getHoras() {return horas;}
    public void setHoras(int hora2) {horas=hora2;}
    
    public String toString(){ 
     return "Dados do monitor/a"+ a+"\n Horas trabalhadas: "+ horas;//a.toString()
    } 
}
    

