package cenario.tres;

import cenario.um.Vector;

public class Metodos {
    // Método auxiliar para calcular norma (evita repetição de código)
    public double calcularNorma(Vector v) {
        double somaQuadrados = 0;
        for (int i = 0; i < v.dim; i++) {
            somaQuadrados += Math.pow(v.getDouble(i), 2);
        }
        return Math.sqrt(somaQuadrados);
    }
}
