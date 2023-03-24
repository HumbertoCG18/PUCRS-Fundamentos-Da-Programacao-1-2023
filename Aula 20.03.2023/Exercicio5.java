// 1.Leia o tempo do evento em segundos.
// 2.Divida o tempo total em horas, minutos e segundos, utilizando operações de divisão inteira e resto da divisão.
// 3.Escreva o resultado na tela.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tempo do evento em segundos: ");
        int tempoEmSegundos = sc.nextInt();

        int horas = tempoEmSegundos / 3600;
        int minutos = (tempoEmSegundos % 3600) / 60;
        int segundos = tempoEmSegundos % 60;

        System.out.printf("O evento durou %02d:%02d:%02d", horas, minutos, segundos);
        sc.close();
    }
}

//int valor = teclado.nextInt()
//int horas = valorIn/3600;
//int minutos = (valorIn%3600)/60;
//int segundos = (valorIn%3600)%60;