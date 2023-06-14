package BibliotecaM.P2;

public class MenorNumVetor{
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 7, 3};
        int menorValor = encontrarMenorValor(vetor);
        System.out.println("Menor valor: " + menorValor);
    }

    public static int encontrarMenorValor(int[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("O vetor não pode ser vazio.");
        }

        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }
}
