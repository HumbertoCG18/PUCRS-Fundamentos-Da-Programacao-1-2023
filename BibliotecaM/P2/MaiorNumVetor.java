package BibliotecaM.P2;

public class MaiorNumVetor{
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 7, 3};
        int maiorValor = encontrarMaiorValor(vetor);
        System.out.println("Maior valor: " + maiorValor);
    }

    public static int encontrarMaiorValor(int[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("O vetor não pode ser vazio.");
        }

        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }
}

