public class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password){
        super(nama, nim);
        this.username = username;
        this.password = password;
    }
    public Admin(){
        super("Admin", "202410370110349");
        String lastThreeNim = "349";
        this.username = "Admin" + lastThreeNim;
        this.password = "Password" + lastThreeNim;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword){
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        System.out.println("Informasi Admin:");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
        System.out.println("Username: " + username);
    }
}