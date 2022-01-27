import java.util.Scanner;
public class OTP_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sample ="0123456789"; // Creating sample space for OTP
        int n = sample.length();
        String OTP = "";
        int len = 6;
        sc.close();
        for (int i = 0; i < len; i++) {
            OTP = OTP + sample.charAt((int) (Math.random() * n));
        }
        System.out.println("Your OTP is: ");
        System.out.println(OTP);
    }
}