package Modul2.PRAK203_2510817120013_SalmaNurLathifah;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Tidak ada titik koma
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //Tidak menambahkan assign umur
        p1.umur = 17;

//      String salah, seharusnya nama saja
//        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
//      Tidak ada string tahun
//        System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " Tahun");
    }
}