package BibliotecaM_T1.Exercícios;
import java.util.Scanner;

public class Exercicio14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número natural: ");
        int primeiroValor = sc.nextInt();
        int soma = 0;
        int contador = 0;
        
        while(soma <= primeiroValor * 500) {
            System.out.print("Digite outro número natural: ");
            int valorLido = sc.nextInt();
            soma += valorLido;
            contador++;
        }
        
        System.out.println("Soma dos valores lidos: " + soma);
        System.out.println("Quantidade de valores lidos: " + contador);
        
        sc.close();
    }
}
