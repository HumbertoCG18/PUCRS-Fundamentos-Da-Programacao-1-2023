package BibliotecaM.P1;
public class FigurasGeometricas {
    // Método para cálculo da área do círculo
    public static double calcularAreaCirculo(double raio) {
        double pi = 3.14;
        return pi * raio * raio;
    }

    // Método para cálculo da área do retângulo
    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    // Método para cálculo da área do quadrado
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    // Método para cálculo da área do triângulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Método para cálculo do perímetro do círculo
    public static double calcularPerimetroCirculo(double raio) {
        double pi = 3.14;
        return 2 * pi * raio;
    }

    // Método para cálculo do perímetro do retângulo
    public static double calcularPerimetroRetangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    // Método para cálculo do perímetro do quadrado
    public static double calcularPerimetroQuadrado(double lado) {
        return 4 * lado;
    }

    // Método para cálculo do perímetro do triângulo
    public static double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
}

