package Modul4.soal2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan = pilihHewan();
        String nama = inputValid("Nama hewan peliharaan");
        String ras = inputValid("Ras");
        String bulu = inputValid("Warna Bulu");

        if (pilihan == 1) {
            Kucing kucing = new Kucing(nama, ras, bulu);
            kucing.displayDetailKucing();
        } else {
            String dataKemampuan = inputValid("Kemampuan");
            String[] kemampuan = dataKemampuan.split(",");

            for (int i = 0; i < kemampuan.length; i++) {
                kemampuan[i] = kemampuan[i].trim();
            }

            Anjing anjing = new Anjing(nama, ras, bulu, kemampuan);
            anjing.displayDetailAnjing();
        }
    }

    private static int pilihHewan() {
        while (true) {
            System.out.println("Pilih jenis hewan yang ingin diinputkan:");
            System.out.println("1 = Kucing");
            System.out.println("2 = Anjing");
            System.out.print("Masukkan pilihan: ");

            String input = scanner.nextLine().trim();

            if (input.equals("1") || input.equals("2")) {
                return Integer.parseInt(input);
            }

            System.out.println("Pilihan hanya boleh 1 atau 2");
        }
    }

    private static String inputValid(String pesan) {
        while (true) {
            System.out.print(pesan + ": ");
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println(pesan + " tidak boleh kosong");
        }
    }
}