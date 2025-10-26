package cenario.dois;
import cenario.um.Vector;

public class MainTranslate {
    public static void main(String[] args) {

        System.out.println("---------Translação em 2D--------");
        double dx2D = 5;
        double dy2D = 10;
        Vector v = new Vector(2, new double[] {1,2});
        System.out.println("Ponto Original: [1.0, 2.0]");
        System.out.println("Deslocamento: (" + dx2D + ", " + dy2D + ")");

        Vector vT_2D = TransformacoesLineares.translate2D(v, dx2D, dy2D);
        vT_2D.print();
        System.out.println();


        System.out.println("---------Translação em 3D--------");
        double dx3D = 3;
        double dy3D = -2;
        double dz3D = 1;
        Vector v2 = new Vector(3, new double[] {1,0,0});
        System.out.println("Ponto Original: [1.0, 0.0, 0.0]");
        System.out.println("Deslocamento: (" + dx3D + ", " + dy3D + ", " + dz3D + ")");

        Vector vT_3D = TransformacoesLineares.translate3D(v2, dx3D, dy3D, dz3D);
        vT_3D.print();
        System.out.println();
    }
}
