package week4;
import java.util.Random;

public class PasswordRandomizer {
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        int count = 0;
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();
        String password = "";
        // Write the code here which returns the new password
        while (count < this.length) {
            char c = chars.charAt(rnd.nextInt(chars.length()));
            password += c;
            count++;
        }
        return password;
    }
}
