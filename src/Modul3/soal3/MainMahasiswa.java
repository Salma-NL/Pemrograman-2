package Modul3.soal3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("5. Update Mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            pilihan = Integer.parseInt(input.nextLine());

            switch (pilihan) {
                case 1: {
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();

                    System.out.print(
                            "Masukkan NIM Mahasiswa (harus unik): "
                    );
                    String nim = input.nextLine();

                    boolean nimSudahAda = false;

                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        if (mahasiswa.getNim().equals(nim)) {
                            nimSudahAda = true;
                            break;
                        }
                    }

                    if (nimSudahAda) {
                        System.out.println("NIM sudah digunakan.");
                    } else {
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                        daftarMahasiswa.add(mahasiswa);

                        System.out.println(
                                "Mahasiswa " + nama + " ditambahkan."
                        );
                    }
                    break;
                }

                case 2: {
                    System.out.print(
                            "Masukkan NIM Mahasiswa yang akan dihapus: "
                    );
                    String nimHapus = input.nextLine();

                    boolean berhasilHapus = false;

                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        if (daftarMahasiswa.get(i).getNim()
                                .equals(nimHapus)) {
                            daftarMahasiswa.remove(i);
                            berhasilHapus = true;
                            break;
                        }
                    }

                    if (berhasilHapus) {
                        System.out.println(
                                "Mahasiswa dengan NIM "
                                        + nimHapus + " dihapus."
                        );
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                }

                case 3: {
                    System.out.print(
                            "Masukkan NIM Mahasiswa yang dicari: "
                    );
                    String nimCari = input.nextLine();

                    HashMap<String, Mahasiswa> dataCari = new HashMap<>();

                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        dataCari.put(mahasiswa.getNim(), mahasiswa);
                    }

                    Mahasiswa mahasiswa = dataCari.get(nimCari);

                    if (mahasiswa != null) {
                        System.out.println(
                                "NIM: " + mahasiswa.getNim()
                                        + ", Nama: " + mahasiswa.getNama()
                        );
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                }

                case 4: {
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println(
                                "Daftar mahasiswa masih kosong."
                        );
                    } else {
                        System.out.println("Daftar Mahasiswa:");

                        for (Mahasiswa mahasiswa : daftarMahasiswa) {
                            System.out.println(
                                    "NIM: " + mahasiswa.getNim()
                                            + ", Nama: " + mahasiswa.getNama()
                            );
                        }
                    }
                    break;
                }

                case 5: {
                    System.out.print(
                            "Masukkan NIM Mahasiswa yang akan diupdate: "
                    );
                    String nimUpdate = input.nextLine();

                    boolean berhasilUpdate = false;

                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        if (daftarMahasiswa.get(i).getNim()
                                .equals(nimUpdate)) {
                            System.out.print("Masukkan Nama Baru: ");
                            String namaBaru = input.nextLine();

                            daftarMahasiswa.set(
                                    i, new Mahasiswa(namaBaru, nimUpdate)
                            );

                            System.out.println(
                                    "Data mahasiswa berhasil diupdate."
                            );

                            berhasilUpdate = true;
                            break;
                        }
                    }

                    if (!berhasilUpdate) {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                }

                case 0:
                    daftarMahasiswa.clear();
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (pilihan != 0) {
                System.out.println();
            }

        } while (pilihan != 0);

        input.close();
    }
}