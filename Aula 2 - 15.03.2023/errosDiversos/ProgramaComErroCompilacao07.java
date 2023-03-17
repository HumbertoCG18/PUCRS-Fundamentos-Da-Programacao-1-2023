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
public class ProgramaComErroCompilacao07{
    public static Scanner entrada;

    public static void main(String args[]){
        entrada = new Scanner(System.in);
        System.out.println("\fInforme um valor inteiro: ");
        int valor = entrada.nextInt();
        System.out.println("Você digitou o número inteiro:"  + valor);
    }
 
}
