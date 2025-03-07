import java.util.Scanner;

public class sistemLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String LAST_THREE_NIM = "349";
        final String VALID_ADMIN_USERNAME = "Admin" + LAST_THREE_NIM;
        final String VALID_ADMIN_PASSWORD = "Password" + LAST_THREE_NIM;
        final String VALID_STUDENT_NAME = "Dhea Rengganis";
        final String VALID_STUDENT_NIM = "202410370110349";

        System.out.println("Pilih Login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if(choice == 1){
            // Login sebagai Admin
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();
            if(username.equals(VALID_ADMIN_USERNAME) && password.equals(VALID_ADMIN_PASSWORD)){
                System.out.println("Login Admin berhasil");
            } else {
                System.out.println("Login gagal! Username atau password salah");
            }
        } else if(choice == 2){
            // Login sebagai mahasiswa
            System.out.print("Masukkan Nama: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Nim: ");
            String nim = scanner.nextLine();

            if(username.equals(VALID_STUDENT_NAME) && nim.equals(VALID_STUDENT_NIM)){
                System.out.println("Login mahasiswa berhasil");
                System.out.println("Nma: " + username);
                System.out.println("Nim: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau Nim salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }
        scanner.close();
    }
}
