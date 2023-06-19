package security;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class RSAKeyExample {
    public static void main(String[] args) throws Exception {
        // Generate RSA key pair
        KeyPair keyPair = generateKeyPair();

        // Get public and private keys
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Convert keys to Base64-encoded strings
        String publicKeyStr = encodeKeyToBase64(publicKey);
        String privateKeyStr = encodeKeyToBase64(privateKey);

        System.out.println("Public Key: " + publicKeyStr);
        System.out.println("Private Key: " + privateKeyStr);

        // Use the keys for encryption and decryption
        String message = "Hello, RSA!";
        String encryptedMessage = encrypt(message, publicKey);
        String decryptedMessage = decrypt(encryptedMessage, privateKey);

        System.out.println("Encrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }

    // Method to generate RSA key pair
    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        return keyPairGenerator.generateKeyPair();
    }

    // Method to encode a key to Base64 string
    public static String encodeKeyToBase64(java.security.Key key) {
        byte[] keyBytes = key.getEncoded();
        return Base64.getEncoder().encodeToString(keyBytes);
    }

    // Method to encrypt a message using RSA public key
    public static String encrypt(String message, PublicKey publicKey) throws Exception {
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA");
        cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Method to decrypt a message using RSA private key
    public static String decrypt(String encryptedMessage, PrivateKey privateKey) throws Exception {
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA");
        cipher.init(javax.crypto.Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedMessage));
        return new String(decryptedBytes);
    }
}
