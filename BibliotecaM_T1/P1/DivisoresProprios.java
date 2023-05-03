package BibliotecaM_T1.P1;

public class DivisoresProprios {
    public static int qtdDivisoresProprios(int n) {
        int qtd = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    qtd += 1;
                } else {
                    qtd += 2;
                }
            }
        }
        return qtd;
    }
}
