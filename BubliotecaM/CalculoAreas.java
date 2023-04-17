package BubliotecaM;

public class CalculoAreas {
    static double raio = 5.0;
    static double base = 10.0;
    static double altura = 6.0;
    static double lado = 4.0;

    static double areaCirculo = CalculoAreas.areaCirculo(raio);
    static double areaRetangulo = CalculoAreas.areaRetangulo(base, altura);
    static double areaQuadrado = CalculoAreas.areaQuadrado(lado);
    static double areaTriangulo = CalculoAreas.areaTriangulo(base, altura);

    public static double areaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public static double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static double areaQuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    
    public static void main(String args[]){
    System.out.println("Área do círculo: " + areaCirculo);
    System.out.println("Área do retângulo: " + areaRetangulo);
    System.out.println("Área do quadrado: " + areaQuadrado);
    System.out.println("Área do triângulo: " + areaTriangulo);
}

    
}

