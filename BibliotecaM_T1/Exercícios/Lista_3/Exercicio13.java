//usar métodos amigos
package BibliotecaM_T1.Exercícios.Lista_3;
import BibliotecaM_T1.P1.NumAmigos;

public class Exercicio13{
    public static void main(String[] args) {
        int count = 0;
        for(int i = 100; i < 1000; i++) {
            for(int j = i + 1; j < 1000; j++) {
                if(NumAmigos.Amigos(i, j)) {
                    count++;
                }
            }
        }
        System.out.println("Existem " + count + " números amigos entre 100 e 1000.");
    }
}
