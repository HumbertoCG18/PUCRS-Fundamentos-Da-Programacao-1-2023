//Usar métodos primos

package Exercicios.Lista_3;
import java.util.Scanner;
import BibliotecaM.P1.VerifPrimo;

/**
 * {@summary Determinar se o maior número dentro de uma sequencia de números reais digitados pelo usuário, e informar quantos números promos foram encontrados.}
 * @author (Humberto Corrêa Gomes)
 * @date (05.04.2023)
 * @version (1.0)
 */

public class Exercicio7{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int maior = 0, num, contPrimos = 0;
            
            System.out.println("Digite uma sequência de números naturais, um por vez (digite 0 para parar): ");
            do {
                num = input.nextInt();
                if (num > maior) {
                    maior = num;
                }
                if (VerifPrimo.Primo(num)) {
                    contPrimos++;
                }
            } while (num != 0);
            
            if (VerifPrimo.Primo(maior)) {
                System.out.println("O maior número digitado é " + maior + " e é primo.");
            } else {
                System.out.println("O maior número digitado é " + maior + " e não é primo.");
            }
            System.out.println("Foram encontrados " + contPrimos + " números primos.");
        }
    }
}

