package Lab11;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// December 2021
// This is Test class for Q.3
import java.util.Scanner;
public class TestCaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine().trim().toLowerCase();
        System.out.print("Enter a key (0-25): ");
        int key = scanner.nextInt();
        String encryptedMessage = Lab11Q3a_CaesarCipher.mEncryption(message, key);
        String decryptedMessage = Lab11Q3a_CaesarCipher.mDecryption(encryptedMessage, key);
        System.out.println("Original Message: " + message);
        System.out.println("Encrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
        scanner.close();
    }
}