package cenario.dois;

import cenario.um.LinearAlgebra;
import cenario.um.Matrix;
import cenario.um.Vector;

public class TransformacoesLineares {

    // Rotação
    public static Vector rotation2D(Vector v, double angle) {
        Matrix m = new Matrix(2,2, new double[]{Math.cos(angle), -1*(Math.sin(angle)), Math.sin(angle), -1*(Math.cos(angle))});
        return LinearAlgebra.dotMV(m,v);
    }

    public static Vector rotation3DX(Vector v, double angle) {
        Matrix m = new Matrix(3,3, new double[]{1,0,0,0,Math.cos(angle), -1*(Math.sin(angle)), 0, Math.sin(angle), (Math.cos(angle))});
        return LinearAlgebra.dotMV(m,v);
    }

    public static Vector rotation3DY(Vector v, double angle) {
        Matrix m = new Matrix(3,3, new double[]{Math.cos(angle),0,Math.sin(angle),0,1,0,(-1* Math.sin(angle)), 0, (Math.cos(angle))});
        return LinearAlgebra.dotMV(m,v);
    }

    public static Vector rotation3DZ(Vector v, double angle) {
        Matrix m = new Matrix(3,3, new double[]{Math.cos(angle),(-1* Math.sin(angle)), 0, Math.sin(angle),Math.cos(angle),0,0,0, 1});
        return LinearAlgebra.dotMV(m,v);
    }

}
