public class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim){
        super(nama, nim);
    }

    public Mahasiswa(){
        super("Dhea Rengganis", "202410370110349");
    }

    @Override
    public boolean login(String inputNama, String inputNim){
        return inputNama.equals(getNama()) && inputNim.equals(getNim());
    }

    @Override
    public void displayInfo(){
        System.out.println("Login Mahasiswa berhasil!");
        super.displayInfo();
    }
}
