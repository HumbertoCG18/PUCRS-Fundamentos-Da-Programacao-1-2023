package BibliotecaM.P2;

public class SomaVetores{
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {5, 4, 3, 2, 1};

        int[] resultado = somarVetores(vetor1, vetor2);
        
        System.out.print("Resultado da soma: ");
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static int[] somarVetores(int[] vetor1, int[] vetor2) {
        int tamanho = vetor1.length;
        int[] resultado = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            resultado[i] = vetor1[i] + vetor2[i];
        }

        return resultado;
    }
}

