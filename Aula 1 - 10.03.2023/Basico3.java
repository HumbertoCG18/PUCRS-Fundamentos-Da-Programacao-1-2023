/**
 * variaveis e tipos de dados.
 * 
 * @author (Giraffa) 
 * @version (10/03/23)
 *
 */
import java.util.Scanner;//biblioteca para apoiar E/S
public class Basico3{
    public static void main(String args[]){
        try (Scanner dados = new Scanner(System.in)) {
            System.out.println("\f Informe o primeiro valor inteiro: ");
            int valor1 = dados.nextInt();
            System.out.println("Informe o segundo valor inteiro: ");
            int valor2 = dados.nextInt();
            
            System.out.println("Resultado: " + (valor1 + valor2));
        }
    }

}
