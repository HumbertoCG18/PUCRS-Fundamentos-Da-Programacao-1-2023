//Usar métodos primos
package Exercícios.Lista_3;
import BibliotecaM.P1.VerifPrimo;

public class Exercicio9 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 100) {
            if (VerifPrimo.Primo(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
