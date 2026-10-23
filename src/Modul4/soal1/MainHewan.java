package Modul4.soal1;

import java.util.Scanner;

public class MainHewan {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        String nama = inputValid("Nama Hewan Peliharaan");
        String ras = inputValid("Ras");
        HewanPeliharaan hewan = new HewanPeliharaan(nama, ras);
        hewan.display();
    }
    private static String inputValid(String pesan){
        while (true){
            System.out.print(pesan + ": ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()){
                return input;
            }
            System.out.println(pesan + " tidak boleh kosong");
        }
    }
}