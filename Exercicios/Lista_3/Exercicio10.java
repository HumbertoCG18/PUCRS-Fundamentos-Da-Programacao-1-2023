//Usar método números perfeitos
package Exercicios.Lista_3;
import BibliotecaM.P1.NumPerfeito;

/**
 * {@summary Determinar a quantidade de números perfeitos de 1 - 1000}
 * @author (Humberto Corrêa Gomes)
 * @date (05.04.2023)
 * @version (1.0)
 */

public class Exercicio10{
    public static void main(String[] args) {
        int cont = 0;
        for (int i = 1; i <= 1000; i++) {
            if (NumPerfeito.NPerfeito(i)) {
                cont++;
            }
        }
        System.out.println("Quantidade de números perfeitos: " + cont);
    }
}
