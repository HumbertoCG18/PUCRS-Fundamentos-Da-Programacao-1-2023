package Exercicios.Lista_3;
import BibliotecaM.P1.NumCapicuos;

public class Exercicio17{
    public static void main(String[] args) {
        int quantidade = 0;
        int numero = 1;
        
        while(quantidade < 10) {
            if(NumCapicuos.Capicua(numero)) {
                System.out.println(numero);
                quantidade++;
            }
            numero++;
        }
    }
}
