//Usar métodos primos

package Exercicios.Lista_3;
import java.util.Scanner;
import BibliotecaM.P1.VerifPrimo;

/**
 * {@summary Determinar quantos numeros primos existem em um conjunto de 10 números digitados pelo usuário.}
 * @author (Humberto Corrêa Gomes)
 * @date (05.04.2023)
 * @version (1.0)
 */

public class Exercicio6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int contador = 0;
            
            System.out.println("Digite 10 números naturais:");
            for (int i = 0; i < 10; i++) {
                int numero = sc.nextInt();
                if (VerifPrimo.Primo(numero)) {
                    contador++;
                }
            }
            
            System.out.println("Existem " + contador + " números primos no conjunto.");
        }
    }
}
