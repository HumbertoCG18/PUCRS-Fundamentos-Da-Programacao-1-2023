/**
 * verificando erros de exceucao e/ou compilacao
 * 
 * @author (Giraffa adpatado de Profa. Silvia Moraes) 
 * @version (1.0)
 */
/**
 * Write a description of class ProgramaComErroCompilacao01 here.
 * 
 * @author (Humberto Corrêa Gomes, Correção do arquivo da Professora Giraffa) 
 * @version (1.1)
 */
import java.util.Scanner;
public class ProgramaComErroDeExecucao02
{
    public static Scanner entrada;

    public static void main(String args[]){
        entrada = new Scanner(System.in);
        System.out.println("Informe um valor inteiro: ");
        int valor1 = entrada.nextInt();
        int valor2 = 0;
        System.out.println("\fResultado 1: " + (valor2/valor1));
        System.out.println("Resultado 2: " + (valor1/valor2));
        System.out.println("Legal, mais um programa que executa corretamente !");
    }
}
