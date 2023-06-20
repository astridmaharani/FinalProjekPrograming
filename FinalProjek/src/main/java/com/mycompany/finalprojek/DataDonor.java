/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author astri
 */
public class DataDonor {
    private List<Donor> daftarDonor;

    public DataDonor() {
        daftarDonor = new ArrayList<>();
    }

    public void tambahDonor(Donor donor) {
        if (donor.isValid()) {
            daftarDonor.add(donor);
        } else {
            System.out.println("Pendaftaran gagal! Pastikan inisial nama dan golongan darah menggunakan huruf kapital.");
        }
    }

    public void hapusDonor(Donor donor) {
        daftarDonor.remove(donor);
    }


    public List<Donor> cariDonorByGolonganDarah(String golonganDarah) {
        List<Donor> hasilPencarian = new ArrayList<>();
        for (Donor donor : daftarDonor) {
            if (donor.getGolonganDarah().equalsIgnoreCase(golonganDarah)) {
                hasilPencarian.add(donor);
            }
        }
        return hasilPencarian;
    }

    public List<Donor> getDaftarDonor() {
        return daftarDonor;
    }

    public void urutkanDonorBerdasarkanNama() {
        Collections.sort(daftarDonor, Comparator.comparing(Donor::getNama));
    }
}



