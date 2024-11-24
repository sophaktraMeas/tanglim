import java.util.Scanner;

public class ExcerciseClass {
    public static void main(String []abs){
        System.out.print("[+] Enter your name:");
        String name = new Scanner(System.in).nextLine();

        System.out.print("[+] Insert your day:");
        String day = new Scanner(System.in).nextLine();

        System.out.print("[+] Insert your month:");
        int month = new Scanner(System.in).nextInt();

        System.out.print("[+] Insert your year:");
        int year = new Scanner(System.in).nextInt();

        System.out.println("=".repeat(100));
        System.out.printf("'Name: %s, Day: %d, Month: %d, Year: %d", name, day, month, year);
    }
}
