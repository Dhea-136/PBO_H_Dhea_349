public class Admin {
    private String username;
    private String password;
    private final String LAST_THREE_NIM = "349";

    public Admin(){
        this.username = "Admin" + LAST_THREE_NIM;
        this.password = "Password" + LAST_THREE_NIM;
    }

    public boolean login(String inputUsername, String inputPassword){
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}