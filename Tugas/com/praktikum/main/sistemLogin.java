package com.praktikum.main;

import com.praktikum.users.*;
import java.util.Scanner;

public class sistemLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();
        Users user = null;
        boolean loginSuccess = false;

        System.out.println("=== Sistem Login ===");
        System.out.println("Pilih Login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if(choice == 1){
            // Login sebagai Admin
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            if(admin.login(username, password)){
                user = admin;
                loginSuccess = true;
                admin.displayInfo();
            } else {
                System.out.println("Login gagal! username atau password salah");
            }

        } else if(choice == 2){
            // Login sebagai mahasiswa
            System.out.print("Masukkan Nama: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Nim: ");
            String nim = scanner.nextLine();

            if(mahasiswa.login(username, nim)){
                user = mahasiswa;
                loginSuccess = true;
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! Nama atau Nim salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }

        if (loginSuccess && user != null) {
            user.displayAppMenu();
        }

        System.out.println("Terima kasih telah menggunakan sistem!");
    }
}

