package BubliotecaM;
import java.util.Scanner;

public class Primos {
    public static int somaDivP (int valor){ 
      int soma=0;
      int ante=1;

      while (ante< valor){
        if (valor% ante ==0) soma=soma+ante;
        ante++;
     }
      return soma;
    }

    public static boolean primo (int valor){
        if (somaDivP (valor) == valor){
            return true;
        }

        else{
            return false; 
        }
    }

    public static void main(String args[]){    
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite um numero natural:");
            int num = teclado.nextInt();
            

            while(num<=0){
                System.out.println("Número Invalido!");
                num = teclado.nextInt();
                
            }
        }
    }
}
