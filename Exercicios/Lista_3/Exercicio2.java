package Exercicios.Lista_3;
import java.util.Scanner;


/**
 * {@summary Determinar o tipo de um triangulo com base em 3 números.}
 * @author (Humberto Corrêa Gomes)
 * @date (05.04.2023)
 * @version (1.0)
 */

public class Exercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contEquilateros = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite os valores do " + (i + 1) + "º triângulo:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((Math.abs(b - c) < a && a < b + c) && 
                (Math.abs(a - c) < b && b < a + c) &&
                (Math.abs(a - b) < c && c < a + b)) {
                System.out.print("Os valores " + a + ", " + b + ", " + c + " formam um triângulo ");

                if (a == b && b == c) {
                    System.out.println("equilátero.");
                    contEquilateros++;
                } else if (a == b || b == c || a == c) {
                    System.out.println("isósceles.");
                } else {
                    System.out.println("escaleno.");
                }
            } else {
                System.out.println("Os valores " + a + ", " + b + ", " + c + " não formam um triângulo.");
            }
        }

        System.out.println("Total de triângulos equiláteros: " + contEquilateros);
        sc.close();
    }
}
