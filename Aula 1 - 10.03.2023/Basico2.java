/**
 * variaveis e tipos de dados.
 * 
 * @author (Giraffa) 
 * @version (10/03/23)
 */
public class Basico2{
    public static void main(String args[]){
        int valor1 = 10;
        int valor2 = 20;

        System.out.println("\n Conteudo de valor1: " + valor1);
        System.out.println("\n Conteudo de valor2: " + valor2);
        System.out.println("Resultado: " + (valor1+valor2));
        valor1=valor2 + 50;
        System.out.println("\n Conteudo de valor1: " + valor1);
        System.out.println("\nResultado: " + (valor1+valor2));
    }
}
