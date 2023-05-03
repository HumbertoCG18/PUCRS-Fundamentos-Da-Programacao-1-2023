package BibliotecaM.Exercícios.Lista_3;
import java.util.Scanner;
import BibliotecaM.P1.NumPar;

public class Exercicio4{

    public static String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};

    public static String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

    public static String numeroPorExtenso(int numero) {
        if (numero < 20) {
            return unidades[numero];
        } else if (numero < 100) {
            String extenso = dezenas[numero / 10];
            if (numero % 10 != 0) {
                extenso += " e " + unidades[numero % 10];
            }
            return extenso;
        } else {
            return "Número inválido";
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int soma = 0;
            int pares = 0;
            int impares = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o " + i + "º número: ");
                int numero = sc.nextInt();
                if (numero < 0 || numero > 100) {
                    System.out.println("Número inválido.");
                    continue;
                }
                String extenso = numeroPorExtenso(numero);
                System.out.println(extenso);
                if (NumPar.Par(numero)) {
                    pares++;
                } else {
                    impares++;
                }
                soma += numero;
                if (soma > numero * 500) {
                    break;
                }
            }
            System.out.println("Foram lidos " + (pares + impares) + " números.");
            System.out.println(pares + " são pares e " + impares + " são ímpares.");
        }
    }
}
