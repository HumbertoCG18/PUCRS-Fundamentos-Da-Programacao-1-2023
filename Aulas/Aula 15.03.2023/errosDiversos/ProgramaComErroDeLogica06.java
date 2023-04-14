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
public class ProgramaComErroDeLogica06
{
    public static Scanner entrada;

    public static void main(String args[]){
        entrada = new Scanner(System.in);

        System.out.println("\fInforme o primeiro valor inteiro: ");
        int valor1 = entrada.nextInt();
        valor1 = entrada.nextInt();

        System.out.println("Informe o segundo valor inteiro: ");
        int valor2 = entrada.nextInt();
        valor2 = entrada.nextInt();

        double media = (valor1 + valor2) / 2;
        System.out.println("Média Aritmética: " + media);
    }

}
