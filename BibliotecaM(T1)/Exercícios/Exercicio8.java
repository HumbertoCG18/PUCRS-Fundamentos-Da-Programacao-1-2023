package BubliotecaM.Exercícios;
import BubliotecaM.VerifPrimo;

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