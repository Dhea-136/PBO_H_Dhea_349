import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scann = new Scanner(System.in);

        daftarBarang.add(new Barang("Tas", 50));
        daftarBarang.add(new Barang("pensil", 30));
        daftarBarang.add(new Barang("Penggaris", 75));

        boolean running = true;
        while (running){
            System.out.println("\n====== Menu Manajemen Stok ======");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Daftar Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("4. Keluar");
            System.out.print("Silahkan pilih opsi: ");

            try{
                int opsi = scann.nextInt();
                scann.nextLine();

                switch (opsi){
                    case 1:
                        tambahBarang(daftarBarang, scann);
                        break;
                    case 2:
                        tampilkanBarang(daftarBarang);
                        break;
                    case 3:
                        kurangiStok(daftarBarang, scann);
                        break;
                    case 4:
                        running = false;
                        System.out.println("Terimakasih, sudah menggunakan program ini! Program selesai!");
                        break;
                    default:
                        System.out.println("Opsi tidak valid. silahkan pilih opsi yang valid, yaitu 1-4");
                }
            } catch (InputMismatchException e){
                System.out.println("Input harus berupa angka!");
                scann.nextLine();
            }
        }
        scann.close();
    }

    private static void tambahBarang(ArrayList<Barang> daftarBarang, Scanner scann){
        System.out.print("Masukkan nama barang: ");
        String nama = scann.nextLine();

        try{
            System.out.print("Masukkan stok barang: ");
            int stok = scann.nextInt();
            scann.nextLine();

            if (stok < 0){
                System.out.print("Stok tidak boleh negatif!");
                return;
            }

            Barang barangBaru = new Barang(nama, stok);
            daftarBarang.add(barangBaru);
            System.out.println("Barang \"" + nama + "\" berhasil ditambahkan.");

        } catch (InputMismatchException e){
            System.out.println("Input stok harus berupa angka!");
            scann.nextLine();
        }
    }

    private static void tampilkanBarang(ArrayList<Barang> daftarBarang){
        if (daftarBarang.isEmpty()){
            System.out.println("Stok barang kosong!");
            return;
        }

        System.out.println("\n----- Daftar barang -----");
        Iterator<Barang> iteriter = daftarBarang.iterator();
        int index = 1;
        while (iteriter.hasNext()){
            Barang barang = iteriter.next();
            System.out.println(index + ". Nama: " + barang.getNama() + ", Stok: " + barang.getStok());
            index++;
        }
        System.out.println("---------------------------");
    }

    private static void kurangiStok(ArrayList<Barang> daftarBarang, Scanner scann){
        if (daftarBarang.isEmpty()){
            System.out.println("Stok barang kosong!");
            return;
        }

        System.out.println("\n----- Daftar Barang (Pilih barang untuk dikurangi stok) -----");
        for (int i = 0; i < daftarBarang.size(); i++){
            Barang barang = daftarBarang.get(i);
            System.out.println(i + ". Nama: " + barang.getNama() + ", Stok: " + barang.getStok());
        }

        try {
            System.out.print("Masukkan nomor indeks barang: ");
            int indeks = scann.nextInt();
            scann.nextLine();

            int arrayIndex = indeks - 1;

            if (indeks < 0 || indeks >= daftarBarang.size()){
                throw new IndexOutOfBoundsException("Nomor indeks tidak valid!");
            }

            Barang barang = daftarBarang.get(indeks);

            System.out.print("Masukkan jumlah stok yang akan diambil: ");
            int jumlahDiambil = scann.nextInt();
            scann.nextLine();

            if (jumlahDiambil <= 0){
                System.out.println("Jumlah stok tidak boleh kurang dari 1!");
                return;
            }

            if(jumlahDiambil > barang.getStok()){
                throw new StokTidakCukupException("Stok untuk" + barang.getNama() + "hanya tersisa" + barang.getStok());
            }

            barang.setStok(barang.getStok() - jumlahDiambil);
            System.out.println("Stok barang \"" + barang.getNama() + "\" berhasil dikurangi. Sisa stok: " + barang.getStok());
            System.out.println("---------------------------------------------");

        }catch (InputMismatchException e){
            System.out.println("Input harus berupa angka!");
            scann.nextLine();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }catch (StokTidakCukupException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
