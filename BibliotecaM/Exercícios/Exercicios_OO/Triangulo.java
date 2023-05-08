package BibliotecaM.Exercícios.Exercicios_OO;

//Aula de maio 08.05.2023

public class Triangulo{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(double a, double b, double c){
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
        Triangulo t1 = new Triangulo(3, 4, 5);
        System.out.println("Tipo do triângulo: " + t1.tipoTriangulo());
        System.out.println("Área do triângulo: " + t1.calcularArea());
        System.out.println("Perímetro do triângulo: " + t1.calcularPerimetro());
        
        Triangulo t2 = new Triangulo(2, 2, 3);
        System.out.println("Tipo do triângulo: " + t2.tipoTriangulo());
        System.out.println("Área do triângulo: " + t2.calcularArea());
        System.out.println("Perímetro do triângulo: " + t2.calcularPerimetro());
    }
}

