//Usar método números perfeitos
package BubliotecaM.Exercícios;
import BubliotecaM.NumPerfeito;

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
