package cenario.um;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TESTE 1: Criar e Imprimir Vector ===");
        Vector v1 = new Vector(5, new int[]{1, 2, 3, 4, 5});
        System.out.println("Vector v1:");
        v1.print();

        System.out.println("\n=== TESTE 2: Getter e Setter ===");
        System.out.println("v1.get(0) = " + v1.get(0));
        System.out.println("v1.get(2) = " + v1.get(2));

        v1.set(2, 10);
        System.out.println("Após v1.set(2, 10):");
        v1.print();

        System.out.println("\n=== TESTE 3: Transpose Vector ===");
        Vector v2 = new Vector(3, new int[]{7, 8, 9});
        System.out.println("Vector v2 (coluna):");
        v2.print();

        Matrix v2T = LinearAlgebra.transposeV(v2);
        System.out.println("\nv2 transposto (linha):");
        v2T.print();

        System.out.println("\n=== TESTE 4: Soma de Vetores ===");
        Vector v3 = new Vector(3, new int[]{1, 2, 3});
        Vector v4 = new Vector(3, new int[]{4, 5, 6});

        System.out.println("Vector v3:");
        v3.print();
        System.out.println("\nVector v4:");
        v4.print();

        Vector v5 = LinearAlgebra.sum(v3, v4);
        System.out.println("\nv3 + v4 =");
        v5.print();

        System.out.println("\n=== TESTE 5: Multiplicação por Escalar ===");
        Vector v6 = new Vector(3, new int[]{2, 4, 6});
        System.out.println("Vector v6:");
        v6.print();

        Vector v7 = LinearAlgebra.times(3, v6);
        System.out.println("\n3 * v6 =");
        v7.print();

        System.out.println("\n=== TESTE 6: Produto Escalar (dot VV) ===");
        Vector v8 = new Vector(3, new int[]{1, 2, 3});
        Vector v9 = new Vector(3, new int[]{4, 5, 6});

        System.out.println("Vector v8:");
        v8.print();
        System.out.println("\nVector v9:");
        v9.print();

        double resultado = LinearAlgebra.dotVV(v8, v9);
        System.out.println("\nv8 · v9 = " + resultado);
        System.out.println("(Cálculo: 1*4 + 2*5 + 3*6 = 4 + 10 + 18 = 32)");

        System.out.println("\n=== TESTE 7: Multiplicação Matrix-Vector ===");
        Matrix m1 = new Matrix(2, 3, new double[]{
                1, 2, 3,
                4, 5, 6
        });
        Vector v10 = new Vector(3, new int[]{2, 1, 3});

        System.out.println("Matriz m1:");
        m1.print();
        System.out.println("\nVector v10:");
        v10.print();

        Vector v11 = LinearAlgebra.dotMV(m1, v10);
        System.out.println("\nm1 * v10 =");
        v11.print();
        System.out.println("(Linha 1: 1*2 + 2*1 + 3*3 = 13)");
        System.out.println("(Linha 2: 4*2 + 5*1 + 6*3 = 31)");

        System.out.println("\n=== TESTE 8: Print em Linha vs Coluna ===");
        Vector v12 = new Vector(4, new int[]{10, 20, 30, 40});
        System.out.println("Print em coluna:");
        v12.print();
        System.out.println("\nPrint em linha:");
        v12.print();

        System.out.println("\n=== TESTE 9: Obter Matriz Interna ===");
        Vector v13 = new Vector(3, new int[]{5, 10, 15});
        Matrix matrizInterna = v13.getMatrix();
        System.out.println("Matriz interna do vector v13:");
        matrizInterna.print();
    }
}