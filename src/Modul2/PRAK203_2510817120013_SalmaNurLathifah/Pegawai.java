package Modul2.PRAK203_2510817120013_SalmaNurLathifah;

//Nama class berbeda dari nama file
//public class Employee {
public class Pegawai {
    public String nama;
//  Tipe datanya salah, seharusnya String untuk input kalimat
//    public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

//  Tidak ada parameter
//    public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}