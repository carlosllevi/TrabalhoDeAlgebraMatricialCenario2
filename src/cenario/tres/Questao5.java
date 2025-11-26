package cenario.tres;

import cenario.um.LinearAlgebra;
import cenario.um.Matrix;
import cenario.um.Vector;

public class Questao5 {
    public static void main(String[] args) {
        Matrix A = new Matrix(4, 4, new double[]
                {
                        0, 0, 1, 0,
                        1, 0, 0, 0,
                        1, 1, 0, 0,
                        0, 1, 0, 0});
        //Descobrindo o vetor das somas das entradas de colunas de A
        double[] elementosSoma = new double[A.colunas];
        for (int i = 0; i < A.linhas; i++) {
            for (int j = 0; j < A.colunas; j++) {
                elementosSoma[j] += A.get(i, j);
            }
        }
        Vector vetorSoma = new Vector(A.colunas, elementosSoma);
        //Norma inicial
        double somaQuadradosInicial = 0;
        double normaInicial = 0;
        for (int i = 0; i< vetorSoma.dim; i++) {
            somaQuadradosInicial = vetorSoma.get(i);
            somaQuadradosInicial = Math.pow(somaQuadradosInicial,2);
            normaInicial = normaInicial + somaQuadradosInicial;
        }
        normaInicial = Math.sqrt(normaInicial);
        //Formula * Vetor Soma
        Vector a0 = LinearAlgebra.times(1/normaInicial, vetorSoma);

        //Transposta de A
        Matrix At = LinearAlgebra.transpose(A);

        //Transposta * A
        Matrix AtA= LinearAlgebra.dot(At,A);

        //Iterações
        Vector vetorAtual = a0;
        int iteracoes = 10;

        for (int k = 0; k<iteracoes;k++) {
            Vector vetorNaoNormalizado = LinearAlgebra.dotMV(AtA, vetorAtual);

            double norma = 0;
            for (int i = 0; i < vetorNaoNormalizado.dim; i++) {
                norma += Math.pow(vetorNaoNormalizado.get(i), 2);
            }
            norma = Math.sqrt(norma);

            double[] dadosNormalizados = new double[vetorNaoNormalizado.dim];
            for (int i = 0; i < vetorNaoNormalizado.dim; i++) {
                dadosNormalizados[i] = vetorNaoNormalizado.get(i) / norma;
            }

            vetorAtual = new Vector(vetorNaoNormalizado.dim, dadosNormalizados);

            System.out.println("Iteração " + (k+1) + ": " );
            vetorAtual.print();
            System.out.println();

        }
    }
}
