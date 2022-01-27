import java.util.Scanner;

class Password_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sample = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789"
                + "!@#$%^&*_=+-/.?<>)"; // Creating sample space for Password
        int n = sample.length();
        String password = "";
        System.out.println("Enter password length (between 6-14)");
        int len = sc.nextInt();
        sc.close();
        for (int i = 0; i < len; i++) {
            password = password + sample.charAt((int) (Math.random() * n));
        }
        System.out.println("Your new Password is: ");
        System.out.println(password);
    }
}