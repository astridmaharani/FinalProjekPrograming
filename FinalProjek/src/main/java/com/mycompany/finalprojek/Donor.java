/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojek;

/**
 *
 * @author astri
 */

// Kelas Donor untuk merepresentasikan data donor darah
public class Donor {
    private String nama;
    private String golonganDarah;
    private int umur;

    public Donor(String nama, String golonganDarah, int umur) {
        this.nama = nama;
        this.golonganDarah = golonganDarah;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public int getUmur() {
        return umur;
    }

    // Validasi inisial nama harus huruf kapital
    private boolean isNamaValid() {
        return nama.matches("[A-Z\\s]+");
    }

    // Validasi golongan darah harus huruf kapital dan termasuk A, B, AB, atau O
    private boolean isGolonganDarahValid() {
        return golonganDarah.matches("[ABO]");
    }

    // Validasi umur minimal 17 tahun
    private boolean isUmurValid() {
        return umur >= 17;
    }

    public boolean isValid() {
        return isNamaValid() && isGolonganDarahValid() && isUmurValid();
    }
}


