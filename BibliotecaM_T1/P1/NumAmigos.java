package BibliotecaM_T1.P1;
public class NumAmigos {
    public static boolean Amigos(int num1, int num2) {
        int soma1 = 0, soma2 = 0;
        for(int i = 1; i < num1; i++) {
            if(num1 % i == 0) {
                soma1 += i;
            }
        }
        for(int i = 1; i < num2; i++) {
            if(num2 % i == 0) {
                soma2 += i;
            }
        }
        if(soma1 == num2 && soma2 == num1) {
            return true;
        } else {
            return false;
        }
    }
}
