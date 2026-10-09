package Modul3.soal2;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;

public class MainNegara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> daftarNegara = new LinkedList<>();

        HashMap<Integer, String> daftarBulan = new HashMap<>();
        daftarBulan.put(1, "Januari");
        daftarBulan.put(2, "Februari");
        daftarBulan.put(3, "Maret");
        daftarBulan.put(4, "April");
        daftarBulan.put(5, "Mei");
        daftarBulan.put(6, "Juni");
        daftarBulan.put(7, "Juli");
        daftarBulan.put(8, "Agustus");
        daftarBulan.put(9, "September");
        daftarBulan.put(10, "Oktober");
        daftarBulan.put(11, "November");
        daftarBulan.put(12, "Desember");

        int jumlahNegara = Integer.parseInt(input.nextLine());

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = input.nextLine();
            String jenis = input.nextLine();
            String pemimpin = input.nextLine();

            int tanggal = 0;
            int bulan = 0;
            int tahun = 0;

            if (!jenis.equalsIgnoreCase("monarki")) {
                tanggal = Integer.parseInt(input.nextLine());
                bulan = Integer.parseInt(input.nextLine());
                tahun = Integer.parseInt(input.nextLine());
            }

            Negara negara = new Negara(
                    nama, jenis, pemimpin, tanggal, bulan, tahun
            );

            daftarNegara.add(negara);
        }

        for (Negara negara : daftarNegara) {
            String jenis = negara.getJenisKepemimpinan();
            String jabatan;

            if (jenis.equalsIgnoreCase("monarki")) {
                jabatan = "Raja";
            } else if (jenis.equalsIgnoreCase("presiden")) {
                jabatan = "Presiden";
            } else {
                jabatan = "Perdana Menteri";
            }

            System.out.println(
                    "Negara " + negara.getNama()
                            + " mempunyai " + jabatan
                            + " bernama " + negara.getNamaPemimpin()
            );

            if (!jenis.equalsIgnoreCase("monarki")) {
                String namaBulan = daftarBulan.get(
                        negara.getBulanKemerdekaan()
                );

                System.out.println(
                        "Deklarasi Kemerdekaan pada Tanggal "
                                + negara.getTanggalKemerdekaan() + " "
                                + namaBulan + " "
                                + negara.getTahunKemerdekaan()
                );
            }

            System.out.println();
        }

        input.close();
    }
}