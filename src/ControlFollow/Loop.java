package ControlFollow;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("""
           1. List all users
           2. Create new user
           3. Update user
           4. Delete user
           5. Exit""");
        System.out.println("=".repeat(20));
        System.out.print("[+] Insert option: ");
        int opt = new Scanner(System.in).nextInt();
        while (true) {
            if (opt < 0) {
                System.out.println("[!] Invalid option 😢😢😢");
                System.out.print("[+] Insert option: ");
                opt = new Scanner(System.in).nextInt();
            } else {
                break;
            }
        }
    }
}
