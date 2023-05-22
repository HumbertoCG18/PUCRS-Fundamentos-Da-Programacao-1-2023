package Aulas.Maio.Aula_22052023;

//aula basica de vetores objetos da classe Array
//22 e 24  maio de 2023

import java.util.*;

public class VetoresAula1 {
    public static void imprime(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("\n Na posicao " + (i + 1) + " esta o conteudo " + vetor[i]);
        }
    }

    public static void imprime2(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quant;
        int[] vetor1;// declara uma posicao de memoria do tipo Array variavel de objeto
        System.out.println("\f");

        do {// garante que o tamanho e um valor inteiro e positivo
            System.out.println("\n Digite a quantidade de valores a serem inseridos  nos  vetores ");
            quant = teclado.nextInt();
        } while (quant <= 0);
        vetor1 = new int[quant]; // cria objeto tipo Array do tamanho especificado e com conteudo int
        int[] vetor2 = new int[quant];// cria objeto tipo Array do tamanho especificado e com conteudo int
        System.out.println("\n Digite os elementos do 1o vetor ");

        for (int i = 0; i < quant; i++) { // maneira padrao de colocar dados no vetor
            System.out.println("\n Digite o valor inteiro a ser colocado na posicao: " + (i + 1));// porque o 1o indice
                                                                                                  // e zero
            int valor = teclado.nextInt();
            vetor1[i] = valor;
            // vetor[i]=teclado.nextInt();
        }

        System.out.println("\n Digite os elementos do 2o vetor ");
        for (int i = 0; i < quant; i++) {
            System.out.println("\n Digite o valor inteiro a ser colocado na posicao: " + (i + 1));
            int valor = teclado.nextInt();
            vetor2[i] = valor;
        }

        System.out.println("\f");
        System.out.println("\n vetor 1 ");
        imprime2(vetor1);
        System.out.println("\n vetor 2 ");
        imprime(vetor2);
        System.out.println("\n vetor soma ");

    }

    /*
     * EXERCICIOS
     * crie um metodo que devolve a soma de dois vetores
     * crie um metodo que devolve o porduto escalar de dois vetores
     * crie um metodo que devolve o maior valor de um vetor
     * crie um metodo que devolve o menor valor de um vetor
     * crie um metodo subtrai que cria um 3o vetor cujos elementos resulatm da
     * subtracao dos outros dois vetro1+vetor2 -> vetor 3
     * crie um metodo que troque os elementos das posicoes pares pelos elementos das
     * posicoes impares (detalhe o vetor original deve ser mantido)
     * crie um metodo que substitua os elementos das posicoes pares por -2 e os
     * elementos das posicoes impares por -1 (detalhe o vetor original deve ser
     * mantido)
     * crie um menu que permita ao usuario escolher as posicoes ofertadas por seu
     * programa
     */

}
