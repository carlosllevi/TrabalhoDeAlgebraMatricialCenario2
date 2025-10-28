package cenario.dois;

import cenario.um.LinearAlgebra;
import cenario.um.Matrix;
import cenario.um.Vector;

public class TransformacoesLineares {

    // Rotação (finalizado e correto)
    public static Vector rotation2D(Vector v, double angle) {
        Vector v_hom = new Vector(3, new double[]{v.getDouble(0), v.getDouble(1), 1.0});
        Matrix m = new Matrix(3,3, new double[]{
                Math.cos(angle), -1*(Math.sin(angle)), 0,
                Math.sin(angle), Math.cos(angle),      0,
                0,               0,                    1});
        Vector resultado = LinearAlgebra.dotMV(m,v_hom);
        return new Vector(2, new double[] {Math.round(resultado.getDouble(0)), Math.round(resultado.getDouble(1))});
    }

    public static Vector rotation3DX(Vector v, double angle) {
        Vector v_hom = new Vector(4, new double[]{v.getDouble(0), v.getDouble(1), v.getDouble(2), 1.0});
        Matrix m = new Matrix(4,4, new double[]{
                1,0,0,0,
                0,Math.cos(angle), -1*(Math.sin(angle)), 0,
                0, Math.sin(angle), (Math.cos(angle)),0,
                0,0,0,1});
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

    // Translação
    public static Vector translate2D(Vector v, double dx, double dy) {

        Vector v_hom = new Vector(3, new double[]{v.getDouble(0), v.getDouble(1), 1.0});

        Matrix m = new Matrix(3, 3, new double[]{
                1, 0, dx,
                0, 1, dy,
                0, 0, 1
        });

        Vector resultado = LinearAlgebra.dotMV(m, v_hom);


        return new Vector(2, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1))
        });
    }

    public static Vector translate3D(Vector v, double dx, double dy, double dz) {

        Vector v_hom = new Vector(4, new double[]{v.getDouble(0), v.getDouble(1), v.getDouble(2), 1.0});

        Matrix m = new Matrix(4, 4, new double[]{
                1, 0, 0, dx,
                0, 1, 0, dy,
                0, 0, 1, dz,
                0, 0, 0, 1
        });

        Vector resultado = LinearAlgebra.dotMV(m, v_hom);

        return new Vector(3, new double[] {Math.round(resultado.getDouble(0)), Math.round(resultado.getDouble(1)), Math.round(resultado.getDouble(2))});
        }

    // Reflexão
    public static Vector reflection2DX(Vector v) {
        Vector v_hom = new Vector(3, new double[]{v.getDouble(0), v.getDouble(1), 1.0});
        Matrix m = new Matrix(3, 3, new double[]{
                1,  0, 0,
                0, -1, 0,
                0,  0, 1
        });

        Vector resultado = LinearAlgebra.dotMV(m, v_hom);

        return new Vector(2, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1))
        });
    }

    public static Vector reflection2DY(Vector v) {
        Vector v_hom = new Vector(3, new double[]{v.getDouble(0), v.getDouble(1), 1.0});
        Matrix m = new Matrix(3, 3, new double[]{
                -1, 0, 0,
                0, 1, 0,
                0, 0, 1
        });

        Vector resultado = LinearAlgebra.dotMV(m, v_hom);

        return new Vector(2, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1))
        });
    }

    public static Vector reflection3DX(Vector v) {
        Vector v_hom = new Vector(4, new double[]{
                v.getDouble(0), v.getDouble(1), v.getDouble(2), 1.0
        });

        Matrix m = new Matrix(4, 4, new double[]{
                -1, 0, 0, 0,
                0, 1, 0, 0,
                0, 0, 1, 0,
                0, 0, 0, 1
        });

        Vector resultado = LinearAlgebra.dotMV(m, v_hom);

        return new Vector(3, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1)),
                Math.round(resultado.getDouble(2))
        });
    }

    public static Vector reflection3DY(Vector v) {
        Vector v_hom = new Vector(4, new double[]{
                v.getDouble(0), v.getDouble(1), v.getDouble(2), 1.0
        });

        Matrix m = new Matrix(4, 4, new double[]{
                1,  0, 0, 0,
                0, -1, 0, 0,
                0,  0, 1, 0,
                0,  0, 0, 1
        });

        Vector resultado = LinearAlgebra.dotMV(m, v_hom);

        return new Vector(3, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1)),
                Math.round(resultado.getDouble(2))
        });
    }

    public static Vector reflection3DZ(Vector v) {
        Vector v_hom = new Vector(4, new double[]{
                v.getDouble(0), v.getDouble(1), v.getDouble(2), 1.0
        });

        Matrix m = new Matrix(4, 4, new double[]{
                1, 0,  0, 0,
                0, 1,  0, 0,
                0, 0, -1, 0,
                0, 0,  0, 1
        });

        Vector resultado = LinearAlgebra.dotMV(m, v_hom);

        return new Vector(3, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1)),
                Math.round(resultado.getDouble(2))
                });
    }

    // PROJEÇÃO 2D
    public static Vector projection2DX(Vector v) {
        Vector v_hom = new Vector(3, new double[]{v.getDouble(0), v.getDouble(1), 1.0});
        Matrix m = new Matrix(3, 3, new double[]{
                1, 0, 0,
                0, 0, 0,
                0, 0, 1
        });
        Vector resultado = LinearAlgebra.dotMV(m, v_hom);
        return new Vector(2, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1))
        });
    }

    public static Vector projection2DY(Vector v) {
        Vector v_hom = new Vector(3, new double[]{v.getDouble(0), v.getDouble(1), 1.0});
        Matrix m = new Matrix(3, 3, new double[]{
                0, 0, 0,
                0, 1, 0,
                0, 0, 1
        });
        Vector resultado = LinearAlgebra.dotMV(m, v_hom);
        return new Vector(2, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1))
        });
    }

    // PROJEÇÃO 3D
    public static Vector projection3DX(Vector v) {
        Vector v_hom = new Vector(4, new double[]{v.getDouble(0), v.getDouble(1), v.getDouble(2), 1.0});
        Matrix m = new Matrix(4, 4, new double[]{
                1, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 1
        });
        Vector resultado = LinearAlgebra.dotMV(m, v_hom);
        return new Vector(3, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1)),
                Math.round(resultado.getDouble(2))
        });
    }

    public static Vector projection3DY(Vector v) {
        Vector v_hom = new Vector(4, new double[]{v.getDouble(0), v.getDouble(1), v.getDouble(2), 1.0});
        Matrix m = new Matrix(4, 4, new double[]{
                0, 0, 0, 0,
                0, 1, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 1
        });
        Vector resultado = LinearAlgebra.dotMV(m, v_hom);
        return new Vector(3, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1)),
                Math.round(resultado.getDouble(2))
        });
    }

    public static Vector projection3DZ(Vector v) {
        Vector v_hom = new Vector(4, new double[]{v.getDouble(0), v.getDouble(1), v.getDouble(2), 1.0});
        Matrix m = new Matrix(4, 4, new double[]{
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 1, 0,
                0, 0, 0, 1
        });
        Vector resultado = LinearAlgebra.dotMV(m, v_hom);
        return new Vector(3, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1)),
                Math.round(resultado.getDouble(2))
                });
    }

    // Cisalhamento
    public static Vector shearing(Vector v, double kx, double ky) {

        // Vetor em coordenadas homogêneas
        Vector v_hom = new Vector(3, new double[]{
                v.getDouble(0), v.getDouble(1), 1.0
        });

        // Matriz de cisalhamento
        Matrix m = new Matrix(3, 3, new double[]{
                1, kx, 0,
                ky, 1, 0,
                0, 0, 1
        });

        // Multiplicação matricial
        Vector resultado = LinearAlgebra.dotMV(m, v_hom);

        // Retorno em coordenadas cartesianas
        return new Vector(2, new double[]{
                Math.round(resultado.getDouble(0)),
                Math.round(resultado.getDouble(1))
                });
    }
}
