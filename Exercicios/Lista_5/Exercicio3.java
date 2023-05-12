package Exercicios.Lista_5;

//Aula de maio 08.05.2023

public class Exercicio3{
    private int dia;
    private int mes;
    private int ano;
    
    public Exercicio3(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String mesPorExtenso(){
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[mes - 1];
    }
    
    public boolean ehBissexto(){
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            return true;
        } 
        
        else{
            return false;
        }
    }
    
    public boolean ehDataValida(){
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes < 1 || mes > 12){
            return false;
        }

        if (dia < 1 || dia > diasPorMes[mes - 1]){
            if (mes == 2 && dia == 29 && ehBissexto()){
                return true;
            }
            return false;
        }
        return true;
    }
    
    public String feriadoFinados(){
        if (mes == 11 && dia == 2){
            return "02 de Novembro de " + ano;
        } 
        
        else{
            return "Não é feriado de Dia dos Finados.";
        }
    }
    
    public static void main(String[] args){
        Exercicio3 d = new Exercicio3(2, 11, 2023);
        
        System.out.println("Mês por extenso: " + d.mesPorExtenso());
        
        if (d.ehBissexto()){
            System.out.println("O ano " + d.ano + " é bissexto.");
        } 
        
        else{
            System.out.println("O ano " + d.ano + " não é bissexto.");
        }
        
        if (d.ehDataValida()){
            System.out.println("A data " + d.dia + "/" + d.mes + "/" + d.ano + " é válida.");
        } 
        
        else{
            System.out.println("A data " + d.dia + "/" + d.mes + "/" + d.ano + " é inválida.");
        }
        
        System.out.println("Feriado de Dia dos Finados: " + d.feriadoFinados());
    }
}
