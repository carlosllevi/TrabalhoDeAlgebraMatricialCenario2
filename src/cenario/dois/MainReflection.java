package cenario.dois;

import cenario.um.Vector;

public class MainReflection {
    public static void main(String[] args) {
        System.out.println("REFLEXÃO 2D\n");

        Vector v2d = new Vector(2, new double[] {3, 4});
        System.out.println("Ponto Original 2D: (3, 4)");

        Vector refX2D = TransformacoesLineares.reflection2DX(v2d);
        System.out.println("\n--- Reflexão no Eixo X ---");
        System.out.print("Resultado: ");
        refX2D.print();

        Vector refY2D = TransformacoesLineares.reflection2DY(v2d);
        System.out.println("\n--- Reflexão no Eixo Y ---");
        System.out.print("Resultado: ");
        refY2D.print();

        System.out.println("\n\nREFLEXÃO 3D\n");

        Vector v3d = new Vector(3, new double[] {2, 3, 5});
        System.out.println("Ponto Original 3D: (2, 3, 5)");

        Vector refX3D = TransformacoesLineares.reflection3DX(v3d);
        System.out.println("\n--- Reflexão no Eixo X ---");
        System.out.print("Resultado: ");
        refX3D.print();

        Vector refY3D = TransformacoesLineares.reflection3DY(v3d);
        System.out.println("\n--- Reflexão no Eixo Y ---");
        System.out.print("Resultado: ");
        refY3D.print();

        Vector refZ3D = TransformacoesLineares.reflection3DZ(v3d);
        System.out.println("\n--- Reflexão no Eixo Z ---");
        System.out.print("Resultado: ");
        refZ3D.print();
    }
}