package Modul1;

import java.util.Locale;

class PRAK105_2510817120013_SalmaNurLathifah {
    public static final double PHI = 3.14;

    public static void main(String[] args) {
        double jari_jari = ValidatorInput.getValidDouble("Masukkan jari-jari: ");
        double tinggi_tabung = ValidatorInput.getValidDouble("Masukkan tinggi: ");

        double volume_tabung = PHI * jari_jari * jari_jari * tinggi_tabung;

        System.out.printf(Locale.US, "Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", jari_jari, tinggi_tabung, volume_tabung);
    }
}