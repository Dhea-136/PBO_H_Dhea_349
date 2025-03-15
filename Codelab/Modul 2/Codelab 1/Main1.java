public class Main1 { // Mendefinisikan kelas Main1 sebagai kelas utama untuk menjalankan program
    public static void main(String[] args) { // Metode main adalah titik masuk untuk program Java
        // Membuat objek hewan1 dari kelas Hewan dengan parameter nama, jenis, dan suara
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        // Membuat objek hewan2 dari kelas Hewan dengan parameter nama, jenis, dan suara
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-woof!!");

        // Memanggil metode tamilkaninfo() pada objek hewan1 dan hewan2 untuk menampilkan informasi hewan
        hewan1.tamilkaninfo();
        hewan2.tamilkaninfo();
    }
}