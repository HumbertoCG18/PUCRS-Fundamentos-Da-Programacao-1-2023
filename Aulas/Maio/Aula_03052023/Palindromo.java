package Aulas.Maio.Aula_03052023;

///aula de 1/10  *** Fundamentos *** Profa.Giraffa
///aula de 2 e 4 de maio *** Fundamentos *** Profa.Giraffa
import java.util.*;
public class Palindromo
{
    public static void main(){
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Insira uma palavra: ");
            String palavra= teclado.next();
            
            if(palindromo(palavra))
            {
                System.out.println("A palavra e palindromo.");
            }
        }
        
    }
    
    public static boolean palindromo(String palavra)
    {
        int inicio= 0;
        int fim= palavra.length() -1;
        while(inicio != fim && inicio < fim)
        {
            if(palavra.charAt(inicio) == palavra.charAt(fim))
            {
                inicio++;
                fim--;
            }else
            {
                System.out.println("A palavra nao e um palindromo.");
                return false;
            }
        }
        
        return true;
    }
}
