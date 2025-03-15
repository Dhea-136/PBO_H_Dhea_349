public class Hewan { // Mendefinisikan kelas Hewan
    // Deklarasi atribut untuk menyimpan informasi tentang hewan
    String nama; //Nama hewan
    String jenis; // Jenis hewan (misalnya: Mamalia, Burung, dll.)
    String suara; // Suara yang dihasilkan oleh hewan

    // Konstruktor untuk menginisialisasi objek Hewan dengan nama, jenis, dan suara
    public Hewan(String nama, String jenis, String suara){
        this.nama = nama; // Mengatur atribut nama dengan parameter nama
        this.jenis = jenis; // Mengatur atribut jenis dengan parameter jenis
        this.suara = suara; // Mengatur atribut suara dengan parameter suara
    }

    // Metode untuk menampilkan informasi tentang hewan
    public void tamilkaninfo(){
        System.out.println("nama: " + nama); // Menampilkan nama hewan
        System.out.println("jenis: " + jenis); // Menampilkan jenis hewan
        System.out.println("suara: " + suara); // Menampilkan suara hewan
        System.out.println(); // Menampilkan baris kosong untuk pemisah
    }
}