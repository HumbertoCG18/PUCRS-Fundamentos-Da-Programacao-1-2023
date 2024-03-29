package Exercicios.Lista_5;

//Aula de maio 08.05.2023

public class Exercicio1{
    private double base;
    private double altura;
    
    public Exercicio1(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea(){
        return base * altura;
    }
    
    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
    
    public double calcularDiagonal(){
        return Math.round(Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
    }
    
    public static void main(String[] args){
        Exercicio1 r1 = new Exercicio1(5, 10);
        Exercicio1 r2 = new Exercicio1(7, 3);
        
        System.out.println("Retangulo 1:");
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());
        System.out.println("Diagonal: " + r1.calcularDiagonal());
        
        System.out.println("\nRetangulo 2:");
        System.out.println("Área: " + r2.calcularArea());
        System.out.println("Perímetro: " + r2.calcularPerimetro());
        System.out.println("Diagonal: " + r2.calcularDiagonal());
    }
}
