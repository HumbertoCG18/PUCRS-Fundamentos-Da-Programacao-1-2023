/**
 * Programa para calcular o valor total do alugel da quadra
 * @author (Humberto Corrêa Gomes, 05.04.2023) 
 * @version (3.0)
 */


package Tenislandia;
import java.util.Scanner;

public class TenislandiaV2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Entrada dos horários
            System.out.print("Digite a hora de início da partida: ");
            int horaInicio = input.nextInt();
            System.out.print("Digite o minuto de início da partida: ");
            int minutoInicio = input.nextInt();
            System.out.print("Digite a duração da partida em minutos: ");
            int duracaoMinutos = input.nextInt();
            
            // Cálculo da duração da partida
            int duracaoHoras = duracaoMinutos / 60;
            duracaoMinutos = duracaoMinutos % 60;
            
            // Cálculo do horário de término da partida
            int horaTermino = horaInicio + duracaoHoras;
            int minutoTermino = minutoInicio + duracaoMinutos;
            
            if (minutoTermino >= 60) {
                horaTermino++;
                minutoTermino -= 60;
            }
            
            if (horaTermino >= 24) {
                horaTermino -= 24;
            }
            
            // Cálculo do valor a ser pago
            double valorTotal = Math.ceil(duracaoHoras + (double) duracaoMinutos / 60) * 110.0;
            
            // Saída do resultado
            System.out.println("A partida durou " + duracaoHoras + " hora(s) e " + duracaoMinutos + " minuto(s).");
            System.out.printf("O valor total a ser pago é R$ %.2f.", valorTotal);
        }
    }
}
