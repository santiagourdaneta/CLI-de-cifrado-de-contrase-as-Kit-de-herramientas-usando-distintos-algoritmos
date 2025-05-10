import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.spec.KeySpec;
import java.util.Base64;

public class encrypt {
    public static void main(String[] args) throws Exception {
        String password = "123456";
        byte[] salt = new byte[16]; // Debe ser aleatorio en producción
        int iterations = 500000;
        int keyLength = 256;

        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, iterations, keyLength);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

        byte[] hash = factory.generateSecret(spec).getEncoded();
        String encodedHash = Base64.getEncoder().encodeToString(hash);
        System.out.println("Password: "+encodedHash);
        // Ejemplo: XzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXzXz
    }
}