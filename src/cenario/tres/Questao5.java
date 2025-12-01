package cenario.tres;

import cenario.um.LinearAlgebra;
import cenario.um.Matrix;
import cenario.um.Vector;


public class Questao5 {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        // Matriz da Questão 5
        Matrix A = new Matrix(4, 4, new double[]{
                0, 0, 1, 0,
                1, 0, 0, 0,
                1, 1, 0, 0,
                0, 1, 0, 0
        });

        //1: Vetor inicial (Soma das colunas)
        double[] elementosSoma = new double[A.colunas];
        for (int i = 0; i < A.linhas; i++) {
            for (int j = 0; j < A.colunas; j++) {
                elementosSoma[j] += A.get(i, j);
            }
        }
        Vector vetorSoma = new Vector(A.colunas, elementosSoma);

        // Calcula norma inicial para normalizar a0
        double normaInicial = metodos.calcularNorma(vetorSoma);

        // a0 =1 / Norma * Vetor Soma
        Vector a0 = LinearAlgebra.times(1 / normaInicial, vetorSoma);

        //2: Preparar Matriz de Iteração (At * A) ---
        Matrix At = LinearAlgebra.transpose(A);
        Matrix AtA = LinearAlgebra.dot(At, A);

        //3: Iterações com Tolerância ---
        Vector vetorAnterior = a0;
        Vector vetorAtual = null;

        double tolerancia = 0.00001; // Criterio de parada
        double erro = 1.0;           // Valor alto para garantir que entre no loop
        int k = 0;

        System.out.println("Vetor Inicial (a0):");
        vetorAnterior.print();
        System.out.println("------------------------------");

        do {
            k++;

            // 1. Multiplica: v = (At * A) * v_anterior
            Vector vetorNaoNormalizado = LinearAlgebra.dotMV(AtA, vetorAnterior);

            // 2. Normaliza o resultado
            double norma = metodos.calcularNorma(vetorNaoNormalizado);

            // Cria vetor normalizado manualmente
            double[] dadosNormalizados = new double[vetorNaoNormalizado.dim];
            for (int i = 0; i < vetorNaoNormalizado.dim; i++) {
                dadosNormalizados[i] = vetorNaoNormalizado.getDouble(i) / norma;
            }
            vetorAtual = new Vector(vetorNaoNormalizado.dim, dadosNormalizados);

            // 3. Calcula o Erro (distancia entre um vetor e outro, queremos que essa distancia seja inferior a tolerancia)
            erro = 0;
            for (int i = 0; i < vetorAtual.dim; i++) {
                double diff = vetorAtual.getDouble(i) - vetorAnterior.getDouble(i);
                erro += Math.pow(diff, 2);
            }
            erro = Math.sqrt(erro); // Raiz da soma dos quadrados das diferenças

            // 4. Exibe e Atualiza para a próxima volta
            System.out.printf("Iteração" + k +" | Erro: " + erro);
            System.out.println();
            vetorAtual.print(); //Vetores parciais

            vetorAnterior = vetorAtual;

        } while (erro > tolerancia);

        System.out.println("------------------------------");
        System.out.println("Convergiu na iteração: " + k);
        System.out.println("Vetor de Autoridade Final:");
        vetorAtual.print();

    }
}