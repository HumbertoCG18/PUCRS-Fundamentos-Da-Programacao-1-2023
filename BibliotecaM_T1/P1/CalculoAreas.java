package BibliotecaM_T1.P1;

//Explicação
//O método areaCirculo recebe o raio como parâmetro e utiliza a fórmula da área do círculo (π * r^2) para calcular a área e retorná-la.
//O método areaRetangulo recebe a base e a altura como parâmetros e utiliza a fórmula da área do retângulo (base * altura) para calcular a área e retorná-la.
//O método areaQuadrado recebe o lado como parâmetro e utiliza a fórmula da área do quadrado (lado^2) para calcular a área e retorná-la.
//O método areaTriangulo recebe a base e a altura como parâmetros e utiliza a fórmula da área do triângulo ((base * altura) / 2) para calcular a área e retorná-la.
//Para utilizar esses métodos, basta chamá-los passando os valores necessários como parâmetros. Por Exemplo:

public class CalculoAreas {
    //Este código irá chamar os métodos areaCirculo, areaRetangulo, areaQuadrado e areaTriangulo, passando os valores dos parâmetros correspondentes. Em seguida, armazena os resultados em variáveis e imprime-os na tela.
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

