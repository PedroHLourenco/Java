package programapernas;

import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Quantas pernas?");

        int perna = tec.nextInt();

        String tipo;

        System.out.print("Isso é um(a) ");
        tipo = switch (perna) {
            case 1 -> "Saci";
            case 2 -> "Bípede";
            case 3 -> "Tripé";
            case 4 -> "Quadrúpede";
            case 6 -> "Inseto";
            case 8 -> "Aracnídeo";
            case 100 -> "Centopéia";
            default -> "ET";
        };
        System.out.println(tipo);
    }

}
