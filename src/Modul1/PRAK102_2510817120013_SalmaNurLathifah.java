package Modul1;

class PRAK102_2510817120013_SalmaNurLathifah {
    public static void main(String[] args) {
        int angkaAwal = ValidatorInput.getValidInt("");
        int i = 0;
        int current = angkaAwal;

        while (i < 10) {
            if (current % 5 == 0) {
                System.out.print((current / 5) - 1);
            } else {
                System.out.print(current);
            }

            if (i < 9) {
                System.out.print(", ");
            }

            current++;
            i++;
        }
        System.out.println();
    }
}