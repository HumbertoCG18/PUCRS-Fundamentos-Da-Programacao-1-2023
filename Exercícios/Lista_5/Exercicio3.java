package Exercícios.Lista_5;

//Aula de maio 08.05.2023

public class Exercicio3{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Exercicio3(double a, double b, double c){
        this.ladoA = a;
        this.ladoB = b;
        this.ladoC = c;
    }
    
    public String tipoTriangulo(){
        if(ladoA == ladoB && ladoA == ladoC){
            return "Equilátero";
        } 
        
        else if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
            return "Escaleno";
        } 
        
        else{
            return "Isósceles";
        }
    }
    
    public double calcularArea(){
        double p = calcularPerimetro() / 2.0;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }
    
    public double calcularPerimetro(){
        return ladoA + ladoB + ladoC;
    }
    
    public static void main(String[] args){
        Exercicio3 t1 = new Exercicio3(3, 4, 5);
        System.out.println("Tipo do triângulo: " + t1.tipoTriangulo());
        System.out.println("Área do triângulo: " + t1.calcularArea());
        System.out.println("Perímetro do triângulo: " + t1.calcularPerimetro());
        
        Exercicio3 t2 = new Exercicio3(2, 2, 3);
        System.out.println("Tipo do triângulo: " + t2.tipoTriangulo());
        System.out.println("Área do triângulo: " + t2.calcularArea());
        System.out.println("Perímetro do triângulo: " + t2.calcularPerimetro());
    }
}

