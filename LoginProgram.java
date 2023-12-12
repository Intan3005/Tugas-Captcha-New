import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Login
            System.out.println(" Selamat Datang Di Salma Mart");
            System.out.println("=== LOGIN ===");
            System.out.print("Username: ");
            String usernameInput = scanner.nextLine();
            System.out.print("Password: ");
            String passwordInput = scanner.nextLine();

            // Check login credentials
            if (checkLogin(usernameInput, passwordInput)) {
                System.out.println("Login berhasil!");

                // Captcha
                String correctCaptcha = generateCaptcha();
                System.out.println("Captcha: " + correctCaptcha);

                System.out.print("Masukkan Captcha: ");
                String userCaptchaInput = scanner.nextLine();

                // Check captcha
                if (checkCaptcha(userCaptchaInput, correctCaptcha)) {
                    System.out.println("Captcha benar. Akses diberikan.");
                    // Tambahkan bagian program utama setelah log in dan captcha berhasil
                } else {
                    System.out.println("Captcha salah. Akses ditolak.");
                }
            } else {
                System.out.println("Login gagal. Username atau password salah.");
            }
        }
    }

    private static boolean checkLogin(String username, String password) {
        // Gantilah dengan informasi log in yang benar
        System.out.println(" Selamat Datang Di Salma Mart");
        String correctUsername = "intan";
        String correctPassword = "intan1004";

        // Gunakan equals() untuk membandingkan string secara case-sensitive
        boolean isUsernameCorrect = correctUsername.equals(username);
        // Gunakan equalsIgnoreCase() untuk membandingkan string tanpa memperhatikan case
        boolean isPasswordCorrect = correctPassword.equals(password);

        // Kembalikan true jika username dan password benar
        return isUsernameCorrect && isPasswordCorrect;
    }

    public static String generateCaptcha() {
        // Gantilah dengan logika penghasilan captcha yang sesuai
        return "PBO1234";
    }

    public static boolean checkCaptcha(String userInput, String correctCaptcha) {
        // Gunakan equalsIgnoreCase() untuk membandingkan captcha tanpa memperhatikan case
        return correctCaptcha.equalsIgnoreCase(userInput);
    }
}