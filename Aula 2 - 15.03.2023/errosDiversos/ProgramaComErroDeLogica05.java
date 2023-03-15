/**
 * verificando erros de exceucao e/ou compilacao
 * 
 * @author (Giraffa adpatado de Profa. Silvia Moraes) 
 * @version (teste )
 */
import java.util.Scanner;
public class ProgramaComErroDeLogica05
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        int valor1 = entrada.nextInt();
        System.out.println("\fInforme o primeiro valor inteiro: ");

        int valor2 = entrada.nextInt();
        System.out.println("Informe o segundo valor inteiro: ");
 

        double media = (valor1 + valor2) / 2;
        System.out.println("Média Aritmética: " + media);
    }

}
