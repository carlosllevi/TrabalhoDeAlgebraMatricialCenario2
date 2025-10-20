package cenario.dois;

import cenario.um.LinearAlgebra;
import cenario.um.Matrix;
import cenario.um.Vector;

public class Main {
    public static void main(String[] args) {
        Vector v = new Vector(2, new double[] {1,0});
        double angle = Math.toRadians(90);
        Vector vR = TransformacoesLineares.rotation2D(v, angle);
        vR.print();
        System.out.println();

        Vector v2 = new Vector(3, new double[] {1,0,0});
        Vector vRx = TransformacoesLineares.rotation3DX(v2, angle);
        Vector vRy = TransformacoesLineares.rotation3DY(v2, angle);
        Vector vRz = TransformacoesLineares.rotation3DZ(v2, angle);
        vRx.print();
        System.out.println();
        vRy.print();
        System.out.println();
        vRz.print();
    }
}
