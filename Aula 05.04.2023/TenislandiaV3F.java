import java.util.Scanner;

public class TenislandiaV3F {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Entrada dos dados
            System.out.print("Digite a hora de início e a duração da partida (no formato hh:mm): ");
            String[] dados = input.next().split(":");
            int horaInicio = Integer.parseInt(dados[0]);
            int minutoInicio = Integer.parseInt(dados[1]);
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
