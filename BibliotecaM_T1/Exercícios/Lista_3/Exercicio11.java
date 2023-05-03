//Usar método número amigos
package BibliotecaM_T1.Exercícios.Lista_3;
import BibliotecaM_T1.P1.NumPerfeito;

public class Exercicio11{

    public static void main(String[] args) {
        int count = 0; // contador de números perfeitos
        int num = 1; // número a ser testado

        while(count < 10) { // repete até encontrar 10 números perfeitos
            
            if(NumPerfeito.NPerfeito(num)) { // verifica se o número é perfeito
                System.out.println(num);
                count++; // incrementa o contador de números perfeitos
            }
            
            num++; // incrementa o número a ser testado
            
        }
    }

}

