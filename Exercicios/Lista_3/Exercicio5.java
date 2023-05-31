package Exercicios.Lista_3;
import java.util.Scanner;

/**
 * {@summary Verificação de aniversário}
 * @author (Humberto Corrêa Gomes)
 * @date (05.04.2023)
 * @version (1.0)
 */

public class Exercicio5{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int hojeDia, hojeMes;
            System.out.print("Digite o dia e o mês atual (no formato dd mm): ");
            hojeDia = input.nextInt();
            hojeMes = input.nextInt();

            int aniversariantesHoje = 0;
            for (int i = 1; i <= 12; i++) {
                int diaNascimento, mesNascimento;
                System.out.print("Digite o dia e o mês de nascimento da pessoa " + i + " (no formato dd mm): ");
                diaNascimento = input.nextInt();
                mesNascimento = input.nextInt();

                int diferencaMeses = hojeMes - mesNascimento;
                int diferencaDias = hojeDia - diaNascimento;
                if (diferencaMeses > 0 || (diferencaMeses == 0 && diferencaDias >= 0)) {
                    System.out.println("A pessoa " + i + " já fez aniversário este ano.");
                } else if (diferencaMeses == 0 && diferencaDias == -1) {
                    System.out.println("A pessoa " + i + " está fazendo aniversário hoje.");
                    aniversariantesHoje++;
                } else {
                    System.out.println("A pessoa " + i + " ainda vai fazer aniversário este ano.");
                }
            }

            System.out.println("Hoje é aniversário de " + aniversariantesHoje + " pessoas.");
        }
    }
}
