package BibliotecaM.Exercícios.Lista_3;
import java.util.Scanner;
import BibliotecaM.P1.NumPar;

public class Exercicio15{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num, total = 0, pares = 0, impares = 0, negativos = 0;
            
            do {
                System.out.print("Digite um valor: ");
                num = sc.nextInt();
                
                if(num >= 0) {
                    total++;
                    if(NumPar.Par(num)) {
                        pares++;
                    } else {
                        impares++;
                    }
                } else {
                    negativos++;
                }
            } while(num >= 0);
            
            System.out.println("Valores lidos: " + total);
            System.out.println("Valores pares: " + pares);
            System.out.println("Valores ímpares: " + impares);
            System.out.println("Valores negativos: " + negativos);
        }
    }
}
