package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends Users implements MahasiswaActions {
    public Mahasiswa(String nama, String nim){
        super(nama, nim);
    }

    public Mahasiswa(){
        super("Dhea Rengganis", "202410370110349");
    }

    @Override
    public boolean login(String inputNama, String inputNim){
        return inputNama.equals(getNama()) && inputNim.equals(getNim());
    }

    @Override
    public void displayInfo(){
        System.out.println("Login Mahasiswa berhasil!");
        super.displayInfo();
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean logout = false;

        while (!logout) {
            System.out.println("\n=== Menu Mahasiswa ===");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    logout = true;
                    System.out.println("Logout berhasil!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }

    @Override
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Laporkan Barang ===");
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Deskripsi Barang: ");
        String deskripsiBarang = scanner.nextLine();

        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println("\nLaporan berhasil disimpan!");
        System.out.println("Detail Laporan:");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Deskripsi: " + deskripsiBarang);
        System.out.println("Lokasi: " + lokasi);


    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

}

