package BibliotecaM.P1;

public class CalculoVolume {

    // Método para cálculo do volume de uma esfera
    public static double volumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    // Método para cálculo do volume de um cilindro
    public static double volumeCilindro(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    // Método para cálculo do volume de um cubo
    public static double volumeCubo(double aresta) {
        return Math.pow(aresta, 3);
    }

    // Método para cálculo do volume de um prisma de base triangular
    public static double volumePrismaTriangular(double base, double altura, double comprimento) {
        return (base * altura * comprimento) / 2;
    }

    // Método para cálculo do volume de um prisma de base quadrada
    public static double volumePrismaQuadrada(double ladoBase, double altura) {
        return Math.pow(ladoBase, 2) * altura;
    }

    // Método para cálculo do volume de um prisma de base retangular
    public static double volumePrismaRetangular(double larguraBase, double comprimentoBase, double altura) {
        return larguraBase * comprimentoBase * altura;
    }
}

