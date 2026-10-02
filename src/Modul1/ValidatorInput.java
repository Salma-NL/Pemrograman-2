package Modul1;

import java.util.Scanner;

public class ValidatorInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int getValidInt(String pesan) {
        int nilai;
        while (true) {
            System.out.print(pesan);
            if (scanner.hasNextInt()) {
                nilai = scanner.nextInt();
                return nilai;
            } else {
                System.out.println("Input tidak valid! Harap masukkan angka bulat.");
                scanner.next();
            }
        }
    }

    public static double getValidDouble(String pesan) {
        double nilai;
        while (true) {
            System.out.print(pesan);
            String teks = scanner.nextLine().replace(',', '.');
            try {
                nilai = Double.parseDouble(teks);
                return nilai;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harap masukkan angka desimal yang benar.");
            }
        }
    }

    public static String getValidString(String pesan) {
        String teks;
        while (true) {
            System.out.print(pesan);
            teks = scanner.nextLine().trim();
            if (!teks.isEmpty()) {
                return teks;
            }
            System.out.println("Input tidak boleh kosong!");
        }
    }
}