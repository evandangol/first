public class ceaser {
    public static StringBuffer encrypt(String message, int key) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < message.length(); i++) {
            if (Character.isUpperCase(message.charAt(i))) {
                char ch = (char) (((int) message.charAt(i) +
                        key - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) message.charAt(i) +
                        key - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static StringBuffer decrypt(String cipher, int key) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < cipher.length(); i++) {
            if (Character.isUpperCase(cipher.charAt(i))) {
                char ch = (char) (((int) cipher.charAt(i) +
                        key - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) cipher.charAt(i) +
                        key - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "CRYPTOCURRENCY";
        int key = 3;
        System.out.println("Encryption");
        System.out.println("Text  : " + s);
        System.out.println("Key : " + key);
        String cipher = encrypt(s, key).toString();
        System.out.println("Decryption");
        System.out.println("Encrypted Cipher: " + cipher);
        System.out.println("Key : " + key);
        String decryptedPlainText = decrypt(cipher, 26 - key).toString();
        System.out.println("Decrypted Plain Text  : " + decryptedPlainText);
    }
}
