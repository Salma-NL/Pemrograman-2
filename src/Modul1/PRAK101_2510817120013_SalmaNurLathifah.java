package Modul1;

class PRAK101_2510817120013_SalmaNurLathifah  {
    public static void main(String[] args) {
        String name = ValidatorInput.getValidString("Masukkan Nama Lengkap : ");
        String placeOfBirth = ValidatorInput.getValidString("Masukkan Tempat Lahir : ");

        int day = ValidatorInput.getValidInt("Masukkan Tanggal Lahir : ");
        int month = ValidatorInput.getValidInt("Masukkan Bulan Lahir : ");
        int year = ValidatorInput.getValidInt("Masukkan Tahun Lahir : ");

        boolean isKabisat = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int maxDay = 31;

        if (month == 2) {
            maxDay = isKabisat ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        }

        if (month < 1 || month > 12 || day < 1 || day > maxDay) {
            System.out.println("Tanggal atau Bulan tidak valid!");
            System.exit(0);
        }

        int height = ValidatorInput.getValidInt("Masukkan Tinggi Badan : ");
        double weight = ValidatorInput.getValidDouble("Masukkan Berat Badan : ");

        String[] daftarBulan = {
                "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        System.out.println("Nama Lengkap " + name + ", Lahir di " + placeOfBirth + " pada Tanggal " + day + " " + daftarBulan[month] + " " + year);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");
    }
}