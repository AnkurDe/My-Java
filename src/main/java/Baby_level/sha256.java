package Baby_level;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class sha256 {
    static String SHA256(String message) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(message.getBytes(StandardCharsets.UTF_8));
        return new String(hashBytes, StandardCharsets.UTF_8);
    }

    static void main() throws NoSuchAlgorithmException {
        String str = "Ankur De";
        String hashed = SHA256(str);
        System.out.println("The hashed output is: " + hashed);
    }
}
