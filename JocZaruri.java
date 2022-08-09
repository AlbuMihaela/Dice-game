package udemy_151ex.joc;

import java.util.Random;
import java.util.Scanner;

public class JocZaruri {
    public static void main(String[] args) {
        int zar1;
        int zar2;

        int zar1Adeversar;
        int zar2Adeversar;

        int victoriileMele = 0;
        int victoriileAdversarului = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Esti pregatit de joc?");
            String raspuns = scanner.nextLine();

            if (raspuns.equals("da")) {
                zar1 = random.nextInt(6) + 1;
                zar2 = random.nextInt(6) + 1;
                zar1Adeversar = random.nextInt(6) + 1;
                zar2Adeversar = random.nextInt(6) + 1;

                System.out.println("Ai dat " + +zar1 + " " + zar2);
                System.out.println("Oponentul a dat:  " + zar1Adeversar + " " + zar2Adeversar);

                int scorulMeu = zar1 + zar2;
                int scorAdversar = zar1Adeversar + zar2Adeversar;

                if (scorulMeu > scorAdversar) {
                    victoriileMele++;
                    System.out.println("Ai castigat");
                } else if (scorAdversar > scorulMeu) {
                    victoriileAdversarului++;
                    System.out.println("Ai pierdut");
                } else {
                    System.out.println("Este remiza");
                }
            } else if (raspuns.equals("nu")) {
                System.out.println("Va mai asteptam pe la noi");
                break;
            } else {
                System.out.println("Nu ai intrdus un raspuns valabil.Introdu da sau nu.");
            }
        }
    }


}
