package cenario.dois;

import cenario.um.Vector;

public class MainShearing {
    public static void main(String[] args) {
        // Vetor original
        Vector v2D = new Vector(2, new double[]{15, 8});

        // Aplica diferentes cisalhamentos
        Vector vHorizontal = TransformacoesLineares.shearing(v2D, 1.0, 0.0); // horizontal
        Vector vVertical   = TransformacoesLineares.shearing(v2D, 0.0, 1.0); // vertical
        Vector vAmbos      = TransformacoesLineares.shearing(v2D, 1.0, 1.0); // combinado

        System.out.println("=== CISALHAMENTO 2D ===");
        System.out.println("Original:");
        v2D.print();

        System.out.println("Cisalhamento horizontal (kx=1, ky=0):");
        vHorizontal.print();

        System.out.println("Cisalhamento vertical (kx=0, ky=1):");
        vVertical.print();

        System.out.println("Cisalhamento combinado (kx=1, ky=1):");
        vAmbos.print();
    }
}