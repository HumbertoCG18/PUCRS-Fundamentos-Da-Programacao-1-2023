//usar métodos amigos
package BibliotecaM.Exercícios.Lista_3;
import BibliotecaM.P1.NumAmigos;

public class Exercicio12{
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = i + 1; j <= 1000; j++) {
                if (NumAmigos.Amigos(i, j)) {
                    count++;
                }
            }
        }
        System.out.println("A quantidade de números amigos existentes nos primeiros 1000 números naturais é: " + count);
    }
}

