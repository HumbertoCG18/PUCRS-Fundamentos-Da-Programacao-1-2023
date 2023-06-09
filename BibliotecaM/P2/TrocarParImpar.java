package BibliotecaM.P2;
import java.util.Arrays;

public class TrocarParImpar{

    public static void trocarPosicaoParImpar(int[] vetor) {
        int tamanho = vetor.length;
        int[] resultado = new int[tamanho];
        int indicePar = 0;
        int indiceImpar = tamanho - 1;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 == 0) {
                resultado[indicePar] = vetor[i];
                indicePar++;
            } else {
                resultado[indiceImpar] = vetor[i];
                indiceImpar--;
            }
        }

        // Copia os elementos restantes (se houver) no final do vetor resultado
        for (int i = indicePar; i <= indiceImpar; i++) {
            resultado[i] = vetor[i];
        }

        // Copia o vetor resultado de volta para o vetor original
        System.arraycopy(resultado, 0, vetor, 0, tamanho);
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Vetor original: " + Arrays.toString(vetor));
        trocarPosicaoParImpar(vetor);
        System.out.println("Vetor modificado: " + Arrays.toString(vetor));
    }
}
