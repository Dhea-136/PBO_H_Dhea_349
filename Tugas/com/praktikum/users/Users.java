package com.praktikum.users;

public abstract class Users {
    private String nama;
    private String nim;

    public Users(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public abstract boolean login(String input1, String input2);

    public abstract void displayAppMenu();

    public void displayInfo(){
        System.out.println("Informasi User:");
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
    }
}

