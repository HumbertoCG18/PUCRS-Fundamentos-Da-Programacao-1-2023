import java.util.Scanner;

public class TenislandiaV3F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Entrada do horário de início e duração da partida
        System.out.print("Digite o horário de início da partida (hh:mm) e a duração em minutos (separados por espaço): ");
        String[] entrada = input.nextLine().split(" ");
        int horaInicio = Integer.parseInt(entrada[0].split(":")[0]);
        int minutoInicio = Integer.parseInt(entrada[0].split(":")[1]);
        int duracaoMinutos = Integer.parseInt(entrada[1]);
        
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
        System.out.println("A partida terminou às " + horaTermino + " hora(s) e " + minutoTermino + " minuto(s).");
        System.out.printf("O valor total a ser pago é R$ %.2f.", valorTotal);
    }
}
