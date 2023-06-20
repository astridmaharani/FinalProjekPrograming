/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojek;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author astri
 */
    // Kelas utama sebagai entry point program

public class SistemDonorDarah {
    private static DataDonor dataDonor;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dataDonor = new DataDonor();

        // Menampilkan menu
        System.out.println("Selamat datang di Sistem Donor Darah");
        System.out.println("==============================================");

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Pendaftaran Donor");
            System.out.println("2. Tampilkan Daftar Donor");
            System.out.println("3. Cari Donor berdasarkan Golongan Darah");
            System.out.println("4. Keluar");
            System.out.print("Masukan Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Pendonor [A-Z]: ");
                    String namaDonor = scanner.nextLine();
                    System.out.print("Masukkan Golongan Darah [ABO]: ");
                    String golonganDarah = scanner.nextLine();
                    System.out.print("Masukkan Umur (minimal 17 tahun): ");
                    int umur = scanner.nextInt();
                    System.out.println("==============================================");

                    Donor donor = new Donor(namaDonor, golonganDarah, umur);

                    if (donor.isValid()) {
                        dataDonor.tambahDonor(donor);
                        System.out.println("PENDAFTARAN BERHASIL! Harap melakukan pemeriksaan lanjutan di rumah sakit.");
                        System.out.println("==============================================");
                        JadwalDonor jadwalDonor = new JadwalDonor("26 Juni 2023");
                        jadwalDonor.tampilkanJadwal();
                        System.out.println("==============================================");
                        System.out.println("Jangan lupa datang sesuai jadwal! Terima kasih, " + donor.getNama() + ".");
                    } else {
                        System.out.println("PENDAFTARAN GAGAL!");
                        System.out.println("Pastikan nama, golongan darah [ABO] menggunakan huruf kapital, dan memenuhi syarat batas umur (minimal 17 tahun).");
                    }

                    break;
                case 2:
                    System.out.println("==============================================");
                    dataDonor.urutkanDonorBerdasarkanNama();
                    tampilkanDaftarDonor();
                    break;
                case 3:
                    scanner.nextLine(); // Membersihkan \n setelah input sebelumnya
                    System.out.print("Masukkan Golongan Darah [ABO]: ");
                    String golDarah = scanner.nextLine();
                    System.out.println("==============================================");
                    cariDonorByGolonganDarah(golDarah);
                    break;
                case 4:
                    System.out.println("==============================================");
                    System.out.println("Terima kasih telah menggunakan Sistem Donor Darah.");
                    break;
                default:
                    System.out.println("==============================================");
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        } while (pilihan != 4);

        scanner.close();
    }

    private static void tampilkanDaftarDonor() {
        List<Donor> daftarDonor = dataDonor.getDaftarDonor();
        if (daftarDonor.isEmpty()) {
            System.out.println("Belum ada donor terdaftar.");
        } else {
            System.out.println("Daftar Donor (A-Z):");
            for (Donor donor :             daftarDonor) {
                System.out.println("Nama: " + donor.getNama() + ", Golongan Darah: " + donor.getGolonganDarah() + ", Umur: " + donor.getUmur());
            }
        }
    }

    
    private static void cariDonorByGolonganDarah(String golonganDarah) {
        List<Donor> hasilPencarian = dataDonor.cariDonorByGolonganDarah(golonganDarah);
        if (hasilPencarian.isEmpty()) {
            System.out.println("Tidak ditemukan pendonor dengan golongan darah " + golonganDarah + ".");
        } else {
            System.out.println("Pendonor dengan golongan darah " + golonganDarah + ":");
            for (Donor donor : hasilPencarian) {
                System.out.println("Nama: " + donor.getNama() + ", Golongan Darah: " + donor.getGolonganDarah() + ", Umur: " + donor.getUmur());
            }
        }
    }
}



