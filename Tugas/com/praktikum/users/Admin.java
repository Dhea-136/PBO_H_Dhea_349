package com.praktikum.users;

import com.praktikum.actions.AdminAction;
import java.util.Scanner;

public class Admin extends Users implements AdminAction {
    private String username;
    private String password;

public Admin(String nama, String nim, String username, String password){
    super(nama, nim);         // Memanggil constructor parent class
    this.username = username;
    this.password = password;
}

    public Admin(){
        super("Admin", "202410370110349");
        String lastThreeNim = "349";
        this.username = "Admin" + lastThreeNim;
        this.password = "Password" + lastThreeNim;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword){
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        System.out.println("\nInformasi Admin:");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
        System.out.println("Username: " + username);
    }

    @Override
    public void displayAppMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean logout = false;

        while(!logout){
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.println("Masukkan pilihan:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    logout = true;
                    System.out.println("Logout berhasil");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    @Override
    public void manageItems() {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }
}