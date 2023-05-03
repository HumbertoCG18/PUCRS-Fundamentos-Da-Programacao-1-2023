package BibliotecaM.Exercícios.Lista_3;
import BibliotecaM.P1.NumCapicuos;

public class Exercicio16{
    public static void main(String[] args) {
        int quantidade = 0;
        
        for(int i = 1; i <= 2000; i++) {
            if(NumCapicuos.Capicua(i)) {
                quantidade++;
            }
        }
        
        System.out.println("Quantidade de números capicuas: " + quantidade);
    }
}
