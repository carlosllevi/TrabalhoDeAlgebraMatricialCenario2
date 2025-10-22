package cenario.dois;

import cenario.um.Vector;

public class Main {
    public static void main(String[] args) {
        Vector v = new Vector(2, new double[] {1,2});
        double angle = Math.toRadians(-90);
        Vector vR = TransformacoesLineares.rotation2D(v, angle);
        System.out.println("---------Rotação em 2D--------");
        vR.print();
        System.out.println();

        Vector v2 = new Vector(3, new double[] {1,0,0});
        Vector vRx = TransformacoesLineares.rotation3DX(v2, angle);
        Vector vRy = TransformacoesLineares.rotation3DY(v2, angle);
        Vector vRz = TransformacoesLineares.rotation3DZ(v2, angle);
        System.out.println("-----Rotação em 3D eixo X-----");
        vRx.print();
        System.out.println();
        System.out.println("-----Rotação em 3D eixo Y-----");
        vRy.print();
        System.out.println();
        System.out.println("-----Rotação em 3D eixo Z-----");
        vRz.print();
    }
}
