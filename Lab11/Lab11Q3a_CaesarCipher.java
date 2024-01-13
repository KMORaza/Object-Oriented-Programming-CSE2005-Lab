package Lab11;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// December 2021
public class Lab11Q3a_CaesarCipher {
    public static String mEncryption(String message, int key) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                char encryptedChar = (char) ((Character.toLowerCase(ch) - 'a' + key) % 26 + 'a');
                encryptedMessage.append(Character.isUpperCase(ch) ? Character.toUpperCase(encryptedChar) : encryptedChar);
            } else {
                encryptedMessage.append(ch);
            }
        }
        return encryptedMessage.toString();
    }
    public static String mDecryption(String message, int key) {
        return mEncryption(message, 26 - key);
    }
}