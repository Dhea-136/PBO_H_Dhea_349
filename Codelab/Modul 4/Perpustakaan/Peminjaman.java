package Perpustakaan;

public interface Peminjaman {
    void pinjamBuku(String judul);
    void pinjamBuku(String judul, int durasiPeminjaman);
    void kembalikanBuku(String judul);
}