package BibliotecaM.Exercícios.Lista_3;
import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
            String[] signos = {"Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"};
            int[] diasLimites = {20, 19, 20, 20, 20, 20, 22, 22, 22, 22, 21, 21};
            int[] contadores = new int[12];

            for (int i = 1; i <= 5; i++) {
                System.out.println("Informe a data de nascimento da pessoa " + i);
                System.out.print("Dia: ");
                int dia = scanner.nextInt();
                System.out.print("Mês (em número): ");
                int mes = scanner.nextInt();

                int signoIndex = mes - 1;
                if (dia > diasLimites[signoIndex]) {
                    signoIndex++;
                    if (signoIndex == 12) {
                        signoIndex = 0;
                    }
                }

                System.out.println("A pessoa " + i + " nasceu em " + dia + " de " + meses[mes - 1] + " e é do signo de " + signos[signoIndex]);
                contadores[signoIndex]++;
            }

            int signosAparecidos = 0;
            int signoMaisFrequente = 0;
            for (int i = 0; i < 12; i++) {
                if (contadores[i] > 0) {
                    signosAparecidos++;
                }
                if (contadores[i] > contadores[signoMaisFrequente]) {
                    signoMaisFrequente = i;
                }
            }

            System.out.println("Foram lidos " + signosAparecidos + " signos diferentes");
            System.out.println("O signo mais frequente foi " + signos[signoMaisFrequente]);
        }
    }
}
