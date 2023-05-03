package BibliotecaM.P1;

public class CalculoAreasLaterais{
    // Área da esfera
    public static double areaEsfera(double raio) {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    // Área lateral do cilindro
    public static double areaLateralCilindro(double altura, double raio) {
        return 2 * Math.PI * raio * altura;
    }

    // Área lateral do prisma de base triangular
    public static double areaLateralPrismaTriangular(double base, double altura, double lateral) {
        return (base + lateral + lateral) * altura;
    }

    // Área lateral do prisma de base quadrada
    public static double areaLateralPrismaQuadrada(double ladoBase, double altura) {
        return 4 * ladoBase * altura;
    }

    // Área lateral do prisma de base retangular
    public static double areaLateralPrismaRetangular(double larguraBase, double profundidadeBase, double altura) {
        return 2 * altura * (larguraBase + profundidadeBase);
    }

    // Área lateral da pirâmide de base triangular
    public static double areaLateralPiramideTriangular(double base, double altura) {
        double lado = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        return 3 * lado * altura / 2;
    }

    // Área lateral da pirâmide de base quadrada
    public static double areaLateralPiramideQuadrada(double ladoBase, double altura) {
        double apotema = Math.sqrt(Math.pow(ladoBase / 2, 2) + Math.pow(altura, 2));
        return 4 * apotema * ladoBase / 2;
    }

    // Área lateral da pirâmide de base retangular
    public static double areaLateralPiramideRetangular(double larguraBase, double profundidadeBase, double altura) {
        double lado = Math.sqrt(Math.pow(larguraBase / 2, 2) + Math.pow(altura, 2));
        double lado2 = Math.sqrt(Math.pow(profundidadeBase / 2, 2) + Math.pow(altura, 2));
        return 2 * (lado * larguraBase + lado2 * profundidadeBase);
    }
}
