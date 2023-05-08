package BibliotecaM.Exercícios.Exercicios_OO;

//Aula de maio 08.05.2023

public class Triangulo{
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public String verificarTipo(){
        if (lado1 == lado2 && lado1 == lado3){
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            return "Isósceles";
        } else{
            return "Escaleno";
        }
    }
    
    public double calcularArea(){
        double p = calcularPerimetro() / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }
    
    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
    
    public static void main(String[] args){
        Triangulo t1 = new Triangulo(3, 4, 5);
        Triangulo t2 = new Triangulo(5, 5, 7);
        
        System.out.println("Triângulo 1:");
        System.out.println("Tipo: " + t1.verificarTipo());
        System.out.println("Área: " + t1.calcularArea());
        System.out.println("Perímetro: " + t1.calcularPerimetro());
        
        System.out.println("\nTriângulo 2:");
        System.out.println("Tipo: " + t2.verificarTipo());
        System.out.println("Área: " + t2.calcularArea());
        System.out.println("Perímetro: " + t2.calcularPerimetro());
    }
}
