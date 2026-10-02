package Modul1;

import java.util.Scanner;

class PRAK104_2510817120013_SalmaNurLathifah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] abu = new char[3];
        char[] bagas = new char[3];

        System.out.print("Tangan Abu: ");
        for (int i = 0; i < 3; i++) {
            abu[i] = scanner.next().charAt(0);
        }

        System.out.print("Tangan Bagas: ");
        for (int i = 0; i < 3; i++) {
            bagas[i] = scanner.next().charAt(0);
        }

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            if (abu[i] == bagas[i]) {
            } else if ((abu[i] == 'B' && bagas[i] == 'G') ||
                    (abu[i] == 'G' && bagas[i] == 'K') ||
                    (abu[i] == 'K' && bagas[i] == 'B')) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}