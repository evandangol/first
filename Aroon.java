public class Aroon {

    static int oneTimePad(int message, int key) {

        int t = message ^ key;

        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        

        System.out.println("Encrypted");
        int otp = oneTimePad(15, 19);

        System.out.println("Decrypted");
        oneTimePad(otp, 19);
    }
}