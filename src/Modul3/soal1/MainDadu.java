package Modul3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class MainDadu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        int jumlahDadu = input.nextInt();
        int totalNilai = 0;

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daftarDadu.add(dadu);
        }

        for (int i = 0; i < daftarDadu.size(); i++) {
            int nilai = daftarDadu.get(i).getNilai();

            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilai);

            totalNilai += nilai;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);

        input.close();
    }
}