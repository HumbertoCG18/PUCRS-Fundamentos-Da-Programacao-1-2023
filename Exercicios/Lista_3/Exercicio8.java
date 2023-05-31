package Exercicios.Lista_3;
import BibliotecaM.P1.VerifPrimo;

/**
 * {@summary Verificar a quantidade de números primos entre 1 - 1000}
 * @author (Humberto Corrêa Gomes)
 * @date (05.04.2023)
 * @version (1.0)
 */

public class Exercicio8 {
    public static void main(String[] args) {
        int quantidadePrimos = 0;
        
        for (int i = 1; i <= 1000; i++) {
            if (VerifPrimo.Primo(i)) {
                quantidadePrimos++;
            }
        }
        
        System.out.println("Quantidade de números primos: " + quantidadePrimos);
    }
}