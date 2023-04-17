package BubliotecaM;

public class ContarDivisores{
    public static int ContadorD(int numero) {
        int contador = 0;
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        
        return contador;
    }
    

}
