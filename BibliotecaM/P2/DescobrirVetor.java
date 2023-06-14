package BibliotecaM.P2;

public class DescobrirVetor{
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numerosPares = descobre(vetor);
        System.out.println("Números pares encontrados:");
        for (int numero : numerosPares) {
            System.out.println(numero);
        }
    }

    public static int[] descobre(int[] vetor) {
        // Conta quantos números pares existem no vetor
        int contador = 0;
        for (int numero : vetor) {
            if (numero % 2 == 0) {
                contador++;
            }
        }

        // Cria um novo vetor com o tamanho equivalente à quantidade de elementos pares
        int[] numerosPares = new int[contador];

        // Preenche o novo vetor com os números pares encontrados
        int indice = 0;
        for (int numero : vetor) {
            if (numero % 2 == 0) {
                numerosPares[indice] = numero;
                indice++;
            }
        }

        return numerosPares;
    }
}

