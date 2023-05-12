package Exercicios.Lista_4;
import java.util.Scanner;

//Aula de maio 03.05.2023

public class Exercicio4{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um texto em letras maiusculas: ");
            String textoMaiusculo = scanner.nextLine();
            String textoMinusculo = textoMaiusculo.toLowerCase();
            System.out.println("Texto em letras minusculas: " + textoMinusculo);

            System.out.print("Digite um texto em letras minusculas: ");
            String textoMinusculo2 = scanner.nextLine();
            String textoMaiusculo2 = textoMinusculo2.toUpperCase();
            System.out.println("Texto em letras maiusculas: " + textoMaiusculo2);
        }
    }
}
