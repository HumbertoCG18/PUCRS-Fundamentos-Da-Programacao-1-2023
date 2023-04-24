//Fazer este método

package BubliotecaM;
public class NumCapicuos {
    public static boolean Capicua(int num) {
        int original = num;
        int reverse = 0;
        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        
        return original == reverse;
    } 
}
