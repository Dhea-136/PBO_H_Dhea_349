// Superclass KarakterGame
class KarakterGame {
    private String nama; // Nama karakter
    private int kesehatan; // Kesehatan karakter
    
    // Konstruktor untuk inisialisasi nama dan kesehatan
    protected KarakterGame(String nama, int kesehatan) {
        this.nama = nama; // Mengatur nama karakter
        this.kesehatan = kesehatan; // Mengatur kesehatan karakter
    }
    
    // Getter untuk mendapatkan nama karakter
    public String getNama() {
        return nama; // Mengembalikan nama karakter
    }
    
    // Getter untuk mendapatkan kesehatan karakter
    public int getKesehatan() {
        return kesehatan; // Mengembalikan kesehatan karakter
    }
    
    // Setter untuk mengatur kesehatan karakter
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan; // Mengatur kesehatan karakter
    }
    
    // Metode serang yang akan dioverride oleh subclass
    public void serang(KarakterGame target) {
        // Implementasi serangan akan ditentukan di subclass
    }
}

// Subclass Pahlawan
class Pahlawan extends KarakterGame {
    // Konstruktor untuk inisialisasi nama dan kesehatan pahlawan
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan); // Memanggil konstruktor superclass
    }
    
    // Override metode serang untuk pahlawan
    @Override
    public void serang(KarakterGame target) {
        // Menampilkan pesan serangan
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
        // Mengurangi kesehatan target sebesar 20
        target.setKesehatan(target.getKesehatan() - 20);
        // Menampilkan kesehatan target setelah diserang
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

// Subclass Musuh
class Musuh extends KarakterGame {
    // Konstruktor untuk inisialisasi nama dan kesehatan musuh
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan); // Memanggil konstruktor superclass
    }
    
    // Override metode serang untuk musuh
    @Override
    public void serang(KarakterGame target) {
        // Menampilkan pesan serangan
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        // Mengurangi kesehatan target sebesar 15
        target.setKesehatan(target.getKesehatan() - 15);
        // Menampilkan kesehatan target setelah diserang
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

// Kelas Utama
public class Main {
    public static void main(String[] args) {
        // Membuat objek karakter umum, pahlawan, dan musuh
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);
        
        // Menampilkan status awal kesehatan karakter
        System.out.println("Status awal:");
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan());
        
        // Simulasi pertarungan
        System.out.println("\nPertarungan dimulai!");
        brimstone.serang(viper); // Brimstone menyerang Viper
        viper.serang(brimstone); // Viper menyerang Brimstone
    }
}