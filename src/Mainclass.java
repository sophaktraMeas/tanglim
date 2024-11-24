import java.util.Scanner;

public class Mainclass {
    public static void main(String []abs){
        System.out.print("[+] Enter your name:");
        String name = new Scanner(System.in).nextLine();

        System.out.print("[+] Insert your age: ");
        int age = new Scanner(System.in).nextInt();

        System.out.print("[+] Insert your email: ");
        String email = new Scanner(System.in).nextLine();

        System.out.println(" This is your age: " + age);
        System.out.println("This is your email:" + email);
    }
}
