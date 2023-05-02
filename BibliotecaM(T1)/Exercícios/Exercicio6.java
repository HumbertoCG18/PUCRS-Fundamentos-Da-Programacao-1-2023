//Usar métodos primos

package BubliotecaM.Exercícios;
import java.util.Scanner;
import BubliotecaM.VerifPrimo;

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
