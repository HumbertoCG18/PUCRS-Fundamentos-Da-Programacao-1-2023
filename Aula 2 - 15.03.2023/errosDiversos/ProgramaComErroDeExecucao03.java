/**
 * verificando erros de exceucao e/ou compilacao
 * 
 * @author (Giraffa adpatado de Profa. Silvia Moraes) 
 * @version (teste )
 */
import java.util.Scanner;
public class ProgramaComErroDeExecucao03
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\fInforme o primeiro valor inteiro: ");
        int valor1 = entrada.nextInt();
        System.out.println("Informe o segundo valor inteiro: ");
        int valor2 = entrada.nextInt();

        System.out.println("Média Harmônica: " + (2 / (1/valor1 + 1/valor2)));
        System.out.println("Show!!! Agora, esse programa funciona!!");
    }
}