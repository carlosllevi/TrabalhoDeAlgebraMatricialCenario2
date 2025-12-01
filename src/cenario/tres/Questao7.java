package cenario.tres;

import cenario.um.LinearAlgebra;
import cenario.um.Matrix;
import cenario.um.Vector;

public class Questao7 {
    public static void main(String[] args) {

        // Matriz de adjacência A do Exercício 7 (5 x 5)
        Matrix A = new Matrix(5, 5, new double[]{
                1, 1, 1, 0, 1,
                0, 0, 0, 0, 1,
                0, 0, 0, 0, 1,
                1, 1, 0, 0, 0,
                1, 1, 0, 0, 0
        });

        // -------- Vetor das somas das entradas das colunas de A --------
        double[] elementosSoma = new double[A.colunas];

        for (int i = 0; i < A.linhas; i++) {
            for (int j = 0; j < A.colunas; j++) {
                elementosSoma[j] += A.get(i, j);
            }
        }

        Vector vetorSoma = new Vector(A.colunas, elementosSoma);

        // -------- Norma inicial do vetor de somas --------
        double normaInicial = 0;
        for (int i = 0; i < vetorSoma.dim; i++) {
            double valor = vetorSoma.get(i);
            normaInicial += Math.pow(valor, 2);
        }
        normaInicial = Math.sqrt(normaInicial);

        // a0 = (1 / ||vetorSoma||) * vetorSoma
        Vector a0 = LinearAlgebra.times(1 / normaInicial, vetorSoma);

        // -------- Matriz AtA = A^T * A --------
        Matrix At = LinearAlgebra.transpose(A);
        Matrix AtA = LinearAlgebra.dot(At, A);

        // -------- Iterações do vetor de autoridade --------
        Vector vetorAtual = a0;
        int iteracoes = 10;

        for (int k = 0; k < iteracoes; k++) {

            // b = AtA * vetorAtual
            Vector vetorNaoNormalizado = LinearAlgebra.dotMV(AtA, vetorAtual);

            // norma de b
            double norma = 0;
            for (int i = 0; i < vetorNaoNormalizado.dim; i++) {
                double valor = vetorNaoNormalizado.get(i);
                norma += Math.pow(valor, 2);
            }
            norma = Math.sqrt(norma);

            // a_{k+1} = b / ||b||
            double[] dadosNormalizados = new double[vetorNaoNormalizado.dim];
            for (int i = 0; i < vetorNaoNormalizado.dim; i++) {
                dadosNormalizados[i] = vetorNaoNormalizado.get(i) / norma;
            }

            vetorAtual = new Vector(vetorNaoNormalizado.dim, dadosNormalizados);

            System.out.println("Iteração " + (k + 1) + ": ");
            vetorAtual.print();
            System.out.println();
        }
    }
}