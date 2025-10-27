package cenario.dois;

import cenario.um.Vector;
public class MainTranslate {
    public static void main(String[] args) {


        System.out.println(" ----------TESTE DE TRANSLAÇÃO 2D----------  ");

        Vector ponto2D_Original = new Vector(2, new double[] {10.0, 20.0});
        //defina o quanto queresmo mover
        double dx2D = 5.0;
        double dy2D = -10.0;

        System.out.print("Ponto Original 2D:  ");
        ponto2D_Original.print();
        System.out.println("Deslocamento (dx, dy): (" + dx2D + ", " + dy2D + ")");

        Vector ponto2D_Traduzido = TransformacoesLineares.translate2D(ponto2D_Original, dx2D, dy2D);

        System.out.print("Ponto Traduzido 2D:  ");
        ponto2D_Traduzido.print(); // Resultado esperado: [15.0, 10.0]
        System.out.println("\n");


        // o teste do 3d
        System.out.println("    ------ TESTE DE TRANSLAÇÃO 3D -----      ");

        Vector ponto3D_Original = new Vector(3, new double[] {1.0, 2.0, 3.0});

        //defina quanto queresmo mover
        double dx3D = 10.0;
        double dy3D = 20.0;
        double dz3D = 30.0;

        System.out.print("Ponto Original 3D: ");
        ponto3D_Original.print();
        System.out.println("Deslocamento (dx, dy, dz): (" + dx3D + ", " + dy3D + ", " + dz3D + ")");

        Vector ponto3D_Traduzido = TransformacoesLineares.translate3D(ponto3D_Original, dx3D, dy3D, dz3D);

        System.out.print("Ponto Traduzido 3D: ");
        ponto3D_Traduzido.print(); // Resultado esperado: [11.0, 22.0, 33.0]
        System.out.println();
}
}