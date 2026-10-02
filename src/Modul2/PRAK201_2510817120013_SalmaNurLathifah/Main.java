package Modul2.PRAK201_2510817120013_SalmaNurLathifah;

public class Main {
    public static void main(){
        Buah apel = new Buah(
                "Apel",
                0.4,
                7000,
                40
        );

        Buah mangga = new Buah(
                "Mangga",
                0.2,
                3500,
                15
        );

        Buah alpukat = new Buah(
                "Alpukat",
                0.25,
                10000,
                12
        );

        apel.info();
        mangga.info();
        alpukat.info();
    }
}