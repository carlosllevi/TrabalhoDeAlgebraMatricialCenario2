package cenario.dois;

import cenario.um.LinearAlgebra;
import cenario.um.Matrix;
import cenario.um.Vector;

public class TransformacoesLineares {

    // Rotação (finalizado e correto)
    public static Vector rotation2D(Vector v, double angle) {
        Vector v_hom = new Vector(3, new double[]{v.getDouble(0), v.getDouble(1), 1.0});
        Matrix m = new Matrix(3,3, new double[]{Math.cos(angle), -1*(Math.sin(angle)), 0,  Math.sin(angle), Math.cos(angle), 0, 0, 0, 1});
        Vector resultado = LinearAlgebra.dotMV(m,v_hom);
        return new Vector(2, new double[] {Math.round(resultado.getDouble(0)), Math.round(resultado.getDouble(1))});
    }

    public static Vector rotation3DX(Vector v, double angle) {
        Vector v_hom = new Vector(4, new double[]{v.getDouble(0), v.getDouble(1), v.getDouble(2), 1.0});
        Matrix m = new Matrix(4,4, new double[]{1,0,0,0,0,Math.cos(angle), -1*(Math.sin(angle)), 0,0, Math.sin(angle), (Math.cos(angle)),0,0,0,0,1});
        Vector resultado = LinearAlgebra.dotMV(m,v_hom);
        return new Vector(3, new double[] {Math.round(resultado.getDouble(0)), Math.round(resultado.getDouble(1)), Math.round(resultado.getDouble(2))});
    }

    public static Vector rotation3DY(Vector v, double angle) {
        Vector v_hom = new Vector(4, new double[]{v.getDouble(0), v.getDouble(1), v.getDouble(2), 1.0});
        Matrix m = new Matrix(4,4, new double[]{Math.cos(angle),0,Math.sin(angle),0,0,1,0,0,(-1* Math.sin(angle)), 0, (Math.cos(angle)),0,0,0,0,1});
        Vector resultado = LinearAlgebra.dotMV(m,v_hom);
        return new Vector(3, new double[] {Math.round(resultado.getDouble(0)), Math.round(resultado.getDouble(1)), Math.round(resultado.getDouble(2))});
    }

    public static Vector rotation3DZ(Vector v, double angle) {
        Vector v_hom = new Vector(4, new double[]{v.getDouble(0), v.getDouble(1), v.getDouble(2), 1.0});
        Matrix m = new Matrix(4,4, new double[]{Math.cos(angle),(-1* Math.sin(angle)), 0,0, Math.sin(angle),Math.cos(angle),0,0,0,0, 1,0,0,0,0,1});
        Vector resultado = LinearAlgebra.dotMV(m,v_hom);
        return new Vector(3, new double[] {Math.round(resultado.getDouble(0)), Math.round(resultado.getDouble(1)), Math.round(resultado.getDouble(2))});
    }

}
