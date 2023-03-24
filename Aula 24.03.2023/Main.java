import java.util.Scanner;   

public class Main {
    
    public static double areaRet(double comprimento, double largura){
        return comprimento * largura;
    }

    public static double areaCirc(double raio){
        return Math.PI * (raio * raio);
    }

    public static double areaQuad(double lado){
        return lado * lado;
    }

    public static double areaTri(double base, double altura){
        return base * altura;
    }
    
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Qual o comprimento do parque?");        
            double compParque = input.nextDouble();
            
            System.out.println("Qual a largura do parque?");
            double largParque = input.nextDouble();
            
            System.out.println("Qual o compriemnto do predio com teto retangular?");
            double compRet = input.nextDouble();

            System.out.println("Qual a largura do prédio com teto retangular?");
            double largRet = input.nextDouble();

            System.out.println("Qual o raio do prédio com teto circular?");
            double raioCirc = input.nextDouble();

            System.out.println("Qual é o lado da parte quadrada do predio pentagonal?");
            double ladoQuad = input.nextDouble();

            System.out.println("Qual é a altura da parte triangular do predio pentagonal?");
            double alturaTri = input.nextDouble();

            double areaParque = areaRet(compParque, largParque);
            double areaPRet = areaRet(compRet, largRet);
            double areaPCirc = areaCirc(raioCirc);
            double areaPenta = areaQuad(ladoQuad) + areaTri(ladoQuad, alturaTri);
            
            
            double gramado = areaParque - (areaPRet + areaPCirc + areaPenta);
            System.out.printf("A Area ser gramada no parque vale a %.2f", gramado);
     
            int leivas = (int) Math.ceil((gramado / 0.64) * 1.1);

            System.out.printf(" A Quantidade de leivas a ser comprada deve ser: " + leivas + " leivas. \n");

            System.out.println("Vamos agora calcular quantas latas de tintas serão necessárias para pintar os prédios do parque: \n");
            
            System.out.println("Qual a altura do prédio retangular?");
            double alturaPRet = input.nextDouble();

            System.out.println("Qual a altura do prédio cilindrico?");
            double alturaCirc = input.nextDouble();

            System.out.println("Qual a altura do prédio pentagonal?");
            double alturaPenta = input.nextDouble();

            double perimRet = (2 * compRet) + (2 * largRet);
            double perimCirc = (2 * Math.PI) * raioCirc;
            double perimPenta = (3* ladoQuad) + (2 * Math.hypot(ladoQuad / 2, alturaTri));

            double latRet = perimRet * alturaPRet;
            double latCir = perimCirc * alturaCirc;
            double latPenta = perimPenta * alturaPenta;

            double latas = (int) Math.ceil((latRet + latCir + latPenta) /5);
            System.out.println("Você tem que comprar: " + latas + " Latas.");
        }
    }
}
