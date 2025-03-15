// Kelas untuk menyimpan informasi dan metode terkait rekening bank
class RekeningBank {
    // Deklarasi atribut
    private String nomorRekening; // Nomor rekening bank
    private String namaPemilik; // Nama pemilik rekening
    private double saldo; // Saldo rekening

    // Constructor dengan parameter untuk menginisialisasi objek RekeningBank
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening; // Mengatur nomor rekening
        this.namaPemilik = namaPemilik; // Mengatur nama rekening
        this.saldo = saldo; // // Mengatur saldo awal
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening); // Menampilkan nomor rekening
        System.out.println("Nama Pemilik: " + namaPemilik); // Menampilkan nama pemilik rekening
        System.out.println("Saldo: Rp" + saldo); // Menampilkan saldo rekening
        System.out.println(); // Menampilkan baris kosong untuk pemisah
    }

    // Metode untuk menyetor uang
    public void setorUang(double jumlah) {
        if (jumlah > 0) { // Memeriksa apakah jumlah setoran positif
            double saldoLama = saldo; // Menyimpan saldo lama
            saldo += jumlah; // Menambahkan jumlah setoran uang ke saldo
            // Menampilkan informasi setoran
            System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
        } else {
            // Menampilkan pesan kesalahan jika jumlah setoran tidak positif
            System.out.println("Jumlah setoran harus positif");
        }
    }

    // Metode untuk menarik uang
    public void tarikUang(double jumlah) {
        if (jumlah <= saldo) { // Memeriksa apakah saldo mencukupi untuk penarikan
            saldo -= jumlah; // Mengurangi jumlah penarikan dari saldo
            // Menampilkan informasi penarikan
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else {
            // Menampilkan pesan kesalahan jika saldo tidak mencukupi
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }

    // Getter untuk mendapatkan nomor rekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    // Setter untuk mengatur nomor rekening
    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    // Getter untuk mendapatkan nama pemilik
    public String getNamaPemilik() {
        return namaPemilik;
    }

    // Setter untuk mengatur nama pemilik
    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    // Getter untuk mendapatkan saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter untuk mengatur saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}