package Exercícios.Exercicios_OO;

//Aula de maio 08.05.2023

public class Retangulo{
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura){
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
        Retangulo r1 = new Retangulo(5, 10);
        Retangulo r2 = new Retangulo(7, 3);
        
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
