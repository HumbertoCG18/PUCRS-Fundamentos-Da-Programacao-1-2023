import java.util.Scanner;

public class TenislandiaV1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Entrada dos horários
            System.out.print("Digite a hora de início da partida: ");
            int horaInicio = input.nextInt();
            System.out.print("Digite o minuto de início da partida: ");
            int minutoInicio = input.nextInt();
            System.out.print("Digite a hora de término da partida: ");
            int horaTermino = input.nextInt();
            System.out.print("Digite o minuto de término da partida: ");
            int minutoTermino = input.nextInt();
            
            // Cálculo da duração da partida
            int duracaoHoras = horaTermino - horaInicio;
            int duracaoMinutos = minutoTermino - minutoInicio;
            if (duracaoMinutos < 0) {
                duracaoHoras--;
                duracaoMinutos += 60;
            }
            if (duracaoHoras < 0) {
                duracaoHoras += 24;
            }
            if (duracaoMinutos > 0) {
                duracaoHoras++;
            }
            
            // Cálculo do valor a ser pago
            double valorTotal = Math.ceil(duracaoHoras) * 110.0;
            
            // Saída do resultado
            System.out.println("A partida durou " + duracaoHoras + " hora(s) e " + duracaoMinutos + " minuto(s).");
            System.out.printf("O valor total a ser pago é R$ %.2f.", valorTotal);
        }
    }
}
