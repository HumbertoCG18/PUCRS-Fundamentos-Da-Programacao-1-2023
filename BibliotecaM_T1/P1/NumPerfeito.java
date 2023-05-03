package BibliotecaM_T1.P1;;

public class NumPerfeito {
    public static boolean NPerfeito(int num) {
        int somaDivisores = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == num;
    }
    
    
}
