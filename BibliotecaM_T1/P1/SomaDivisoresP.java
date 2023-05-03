package BibliotecaM_T1.P1;

public class SomaDivisoresP {
    public static int somaDivisoresProprios(int n) {
        int soma = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
