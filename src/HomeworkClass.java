import java.util.Scanner;

public class HomeworkClass {
    public static void main(String[]abs){
        System.out.print("[+] Insert your product name:");
        String name = new Scanner(System.in).nextLine();

        System.out.print("[+] Insert your product code:");
        int code = new Scanner(System.in).nextInt();

        System.out.print("[+] Insert your product quality:");
        String quality = new Scanner(System.in).nextLine();

        System.out.print("[+] Insert your product price per one:");
        int price_per_one = new Scanner(System.in).nextInt();

        System.out.println("=".repeat(100));
        System.out.printf("name: %s, code: %d, quality: %s, price: %d", name, code, quality, price_per_one);
    }
}
