package BibliotecaM.P2;

public class SomaDivisores {
    public static int somaDivisores(int numero) {
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
