package Modul1;

class PRAK103_2510817120013_SalmaNurLathifah {
    public static void main(String[] args) {
        int N = ValidatorInput.getValidInt("");
        int bilangan_awal = ValidatorInput.getValidInt("");
        int i = 0;

        do {
            if (bilangan_awal % 2 != 0) {
                System.out.print(bilangan_awal);
                i++;
                if (i < N) {
                    System.out.print(", ");
                }
            }
            bilangan_awal++;
        } while (i < N);

        System.out.println();
    }
}