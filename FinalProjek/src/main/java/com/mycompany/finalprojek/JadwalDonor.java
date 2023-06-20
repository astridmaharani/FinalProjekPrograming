/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojek;

/**
 *
 * @author astri
 */
    // Kelas JadwalDonor untuk mengatur jadwal donor
class JadwalDonor {
    private String tanggal;

    public JadwalDonor(String tanggal) {
        this.tanggal = tanggal;
    }

    public void tampilkanJadwal() {
        System.out.println("Jadwal Pemeriksaan/Donor Darah:");
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Waktu: 10:00 - 15:00");
        System.out.println("Tempat: Rumah Sakit Bekti Waras");
    }
}

