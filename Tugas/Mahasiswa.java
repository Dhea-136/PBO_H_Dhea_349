public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(){
        this.nama = "Dhea Rengganis";
        this.nim = "202410370110349";
    }

    public boolean login(String inputNama, String inputNim){
        return inputNama.equals(nama) && inputNim.equals(nim);
    }

    public void displayInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
    }
}
