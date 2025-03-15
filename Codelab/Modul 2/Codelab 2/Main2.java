import java.util.Scanner; // Mengimpor kelas Scanner untuk mengambil input dari pengguna

public class Main2 { // Kelas Main2 sebagai kelas utama untuk menjalankan program
    public static void main(String[] args) { // Metode main adalah titik masuk untuk program Java
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk mengambil input dari pengguna

        // Membuat dua objek RekeningBank dengan nomor rekening, nama pemilik, dan saldo awal
        RekeningBank rekening1 = new RekeningBank("202410370110349", "Dhea Rngganis", 500000.0);
        RekeningBank rekening2 = new RekeningBank("202410370110372", "Nawa Istiqomah", 100000.0);

        // Menampilkan informasi awal rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Meminta pengguna untuk memasukkan jumlah setoran untuk rekening pertama
        System.out.print("Masukkan jumlah setoran uang untuk " + rekening1.getNamaPemilik() + ": Rp");
        double setoran1 = input.nextDouble(); // Mengambil input jumlah setoran
        rekening1.setorUang(setoran1); // Melakukan setoran ke rekening pertama
        System.out.println(); // Menampilkan baris kosong untuk pemisah

        // Meminta pengguna untuk memasukkan jumlah setoran untuk rekening kedua
        System.out.print("Masukkan jumlah setoran untuk " + rekening2.getNamaPemilik() + ": Rp");
        double setoran2 = input.nextDouble(); // Mengambil input jumlah setoran
        rekening2.setorUang(setoran2); // Melakukan setoran ke rekening kedua
        System.out.println(); // Menampilkan baris kosong untuk pemisah

        // Meminta pengguna untuk memasukkan jumlah penarikan untuk rekening pertama
        System.out.print("Masukkan jumlah penarikan untuk " + rekening1.getNamaPemilik() + ": Rp");
        double tarikUang1 = input.nextDouble(); // Mengambil input jumlah penarikan
        rekening1.tarikUang(tarikUang1); // Melakukan penarikan dari rekening pertama
        System.out.println(); // Menampilkan baris kosong untuk pemisah

        // Meminta pengguna untuk memasukkan jumlah penarikan untuk rekening kedua
        System.out.print("Masukkan jumlah penarikan untuk " + rekening2.getNamaPemilik() + ": Rp");
        double tarikUang2 = input.nextDouble(); // Mengambil input jumlah penarikan
        rekening2.tarikUang(tarikUang2); // Melakukan penarikan dari rekening kedua
        System.out.println(); // Menampilkan baris kosong untuk pemisah

        // Menampilkan informasi akhir rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        input.close(); // Menutup objek Scanner untuk mencegah kebocoran memori
    }
}