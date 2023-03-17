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
public class ProgramaComErroDeLogica02
{
    public static Scanner entrada;

    public static void main(String args[]){
        entrada = new Scanner(System.in);
        
        System.out.println("\fInforme o ano que você nasceu (usando 4 dígitos.ex: 1990): ");
        int ano = entrada.nextInt();
        System.out.println("Você tem (ou terá nos próximos meses) " + (ano-2015) +  " anos.");
    }
}
