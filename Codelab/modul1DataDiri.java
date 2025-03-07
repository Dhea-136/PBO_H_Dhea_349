import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna
import java.time.LocalDate; // Mengimpor kelas LocalDate untuk mendapat tanggal saat ini

public class modul1DataDiri { // Mengidentifikasi kelas dengan nama modul1DataDiri
    public static void main(String[] args) { // Metode utama yang dijalankan saat program dieksekusi
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        // Meminta pengguna untuk memasukkan nama
        System.out.print("Masukkan nama:");
        String nama = scanner.nextLine(); // Membaca input nama dari pengguna

        // Meminta pengguna untuk memasukkan jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L) :");
        String input = scanner.nextLine(); // Membaca input jenis kelamin dari pengguna
        String jenisKelamin; // Mendeklarasikan variable untuk menyimpan jenis kelamin

        // Memeriksa input jenis kelamin dan menetapkan nilai yang sesuai
        if(input.equalsIgnoreCase ("P")) { // Jika input adalah "P" (Perempuan)
            jenisKelamin = "Perempuan"; // Menetapkan jenis kelamin sebagai "Perempuan"
        } else if (input.equalsIgnoreCase ("L")) { // Jika input adalah "L" (Laki-laki)
            jenisKelamin = "Laki-laki"; // Menetapkan jenis kelamin sebagai "Laki-laki"
        } else { // Jika input tidak valid
            jenisKelamin = "Tidak valid"; // Menetapkan jenis kelamin sebagai "Tidak valid"
            System.out.println("Jenis kelamin tidak valid."); // Menampilkan pesan kesalahan
        }

        // Meminta pengguna untuk memasukkan tahun lahir
        System.out.print("Masukkan tahun lahir:");
        int tahunLahir = scanner.nextInt(); // Membaca input tahun lahir dari pengguna

        // Mendapatkan tahun saat ini
        int tahunSekarang = LocalDate.now().getYear(); // Mengambil tahun saat ini menggunakan LocalDate

        // Menghitung umur berdasarkan tahun lahir
        int umur = tahunSekarang - tahunLahir; // Menghitung umur

        // Menapilkan data diri pengguna
        System.out.println("\nData Diri:"); // Menapilkan judul
        System.out.println("Nama: " + nama); // Menapilkan nama
        System.out.println("Jenis Kelamin: " + jenisKelamin); // Menapilkan jenis kelamin
        System.out.println("Umur: " + umur); // Menapilkan umur

        scanner.close(); // Menutup objek Scanner untuk mencegah kebocoron memori

    }
}