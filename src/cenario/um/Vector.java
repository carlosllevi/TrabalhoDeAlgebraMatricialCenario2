package cenario.um;

public class Vector {
    public int dim;
    Matrix coluna; // Vetor agora é uma matriz coluna (n x 1)

    // Constructor Vector
    public Vector(int dim, int[] elementos) {
        this.dim = dim;
        double[] elementosDouble = new double[dim];
        for (int i = 0; i < dim; i++) {
            elementosDouble[i] = elementos[i];
        }
        // Cria uma matriz de dimensão (dim x 1)
        this.coluna = new Matrix(dim, 1, elementosDouble);
    }

    // Constructor alternativo com doubles
    public Vector(int dim, double[] elementos) {
        this.dim = dim;
        this.coluna = new Matrix(dim, 1, elementos);
    }

    // Getter - retorna o elemento na posição i
    public int get(int i) {
        return (int) coluna.get(i, 0);
    }

    // Getter que retorna double (útil para operações)
    public double getDouble(int i) {
        return coluna.get(i, 0);
    }

    // Setter
    public void set(int i, int valor) {
        coluna.set(i, 0, valor);
    }

    // Setter com double
    public void setDouble(int i, double valor) {
        coluna.set(i, 0, valor);
    }

    // Print Vector
    public void print() {
        for (int i = 0; i < dim; i++) {
            System.out.println(getDouble(i));
        }
    }

    // Método para obter a matriz interna (útil para operações)
    public Matrix getMatrix() {
        return coluna;
    }
}