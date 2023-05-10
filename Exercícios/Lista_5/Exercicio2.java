package Exercícios.Lista_5;

//Aula de maio 08.05.2023

public class Exercicio2{
    private double base;
    private double altura;
    
    public Exercicio2(double base, double altura){
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
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    public static void main(String[] args){
        Exercicio2 r1 = new Exercicio2(5, 10);
        Exercicio2 r2 = new Exercicio2(7, 3);
        
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
