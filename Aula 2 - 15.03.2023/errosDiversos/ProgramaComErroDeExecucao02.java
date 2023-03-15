
/**
 * verificando erros de exceucao e/ou compilacao
 * 
 * @author (Giraffa adpatado de Profa. Silvia Moraes) 
 * @version (teste )
 */
import java.util.Scanner;
public class ProgramaComErroDeExecucao02
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor inteiro: ");
        int valor1 = entrada.nextInt();
        int valor2 = 0;
        System.out.println("\fResultado 1: " + (valor2/valor1));
        System.out.println("Resultado 2: " + (valor1/valor2));
        System.out.println("Legal, mais um programa que executa corretamente !");
    }
}
