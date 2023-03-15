/**
 * verificando erros de exceucao e/ou compilacao
 * 
 * @author (Giraffa adpatado de Profa. Silvia Moraes) 
 * @version (teste )
 */

import java.util.Scanner;
public class ProgramaComErroDeExecucao04
{
    public static void main(String args[]){
        Scanner entrada = null;
        System.out.println("\fInforme o primeiro valor inteiro: ");
        int valor1 = entrada.nextInt();
        System.out.println("Informe o segundo valor inteiro: ");
        int valor2 = entrada.nextInt();

        System.out.println("Resultado 1: " + (valor1/valor2));
        System.out.println("Resultado 2: " + ((double)valor1/valor2));
        System.out.println("Legal, mas um programa sem erros!!!");
    }
}