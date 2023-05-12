//Usar método números perfeitos
package Exercicios.Lista_3;
import BibliotecaM.P1.NumPerfeito;

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
