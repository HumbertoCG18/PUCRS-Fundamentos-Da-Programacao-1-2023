//Usar métodos primos

package BubliotecaM.Exercícios;
import java.util.Scanner;
import BubliotecaM.VerifPrimo;

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

