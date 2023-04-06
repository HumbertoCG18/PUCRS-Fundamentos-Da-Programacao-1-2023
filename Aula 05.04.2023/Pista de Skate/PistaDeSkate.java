import java.util.Scanner;

public class PistaDeSkate {
    public static void main(String[] args) {
        double raio1, raio2, areaTotal, qtdLatasTinta;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio da primeira semiesfera:");
        raio1 = entrada.nextDouble();

        System.out.println("Digite o raio da segunda semiesfera:");
        raio2 = entrada.nextDouble();

        // Cálculo da área total da pista de skate
        areaTotal = 2 * (4 * Math.PI * Math.pow(raio1, 2) + 4 * Math.PI * Math.pow(raio2, 2));

        // Cálculo da quantidade de latas de tinta necessárias
        qtdLatasTinta = Math.ceil(areaTotal / 12.0);

        System.out.printf("Serão necessárias %.0f latas de tinta para pintar a pista de skate.\n", qtdLatasTinta);

        entrada.close();
    }
}
