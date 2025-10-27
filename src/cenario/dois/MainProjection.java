package cenario.dois;

import cenario.um.Vector;

public class MainProjection {
    public static void main(String[] args) {

        Vector v2D = new Vector(2, new double[]{3, 5});
        Vector v3D = new Vector(3, new double[]{4, 6, 8});

        Vector v2DX = TransformacoesLineares.projection2DX(v2D);
        Vector v2DY = TransformacoesLineares.projection2DY(v2D);

        Vector v3DX = TransformacoesLineares.projection3DX(v3D);
        Vector v3DY = TransformacoesLineares.projection3DY(v3D);
        Vector v3DZ = TransformacoesLineares.projection3DZ(v3D);

        System.out.println("=== PROJEÇÕES 2D ===");
        System.out.println("Projeção em X: " );
        v2DX.print();
        System.out.println("Projeção em Y: " );
        v2DY.print();

        System.out.println("\n=== PROJEÇÕES 3D ===");
        System.out.println("Projeção em X: " );
        v3DX.print();

        System.out.println("Projeção em Y: " );
        v3DY.print();

        System.out.println("Projeção em Z: " );
        v3DZ.print();

    }
}