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
public class ProgramaComErroDeLogica07
{
    public static Scanner entrada;

    public static void main(String args[]){
        entrada = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
       
        double media = (valor1 + valor2) / 2;
        
        System.out.println("\fInforme o primeiro valor inteiro: ");
        valor1 = entrada.nextInt();
       
        System.out.println("Informe o segundo valor inteiro: ");
        valor2 = entrada.nextInt();

        
        System.out.println("Média Aritmética: " + media);
    }

}
