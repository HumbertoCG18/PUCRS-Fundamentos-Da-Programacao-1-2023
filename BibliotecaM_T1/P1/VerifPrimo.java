package BibliotecaM_T1.P1;

public class VerifPrimo {
    public static boolean Primo(int n) {
        if (n <= 1) {
            return false;
        }
    
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
    
        return true;
    }    
}
