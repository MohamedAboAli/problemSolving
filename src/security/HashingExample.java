package security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingExample {
    public static void main(String[] args) {
        String message = "Hello, world!";

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(message.getBytes());

            // Convert the byte array to a hex string for easy display
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
            	// we convert byte to hexadecimal
                sb.append(String.format("%02x", b));
            }
            String hashString = sb.toString();
            String result="";
            
            // is used to create a BigInteger object from a byte array,
            BigInteger bigInt = new BigInteger(1, hashBytes);
            //radix is set to 16, which means that the string representation of the BigInteger object bigInt will be in hexadecimal format.
			result = bigInt.toString(16);
			while (result.length() < 32) {
				result = "0" + result;
			}
            System.out.println("Original message: " + message);
            System.out.println("Hashed message: " + hashString);
            System.out.println("Result message: " + result);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
