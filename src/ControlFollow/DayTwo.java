package ControlFollow;

import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args){
        System.out.println("========Login======");
        System.out.print("[+] Insert username:");
        String name = new Scanner(System.in).nextLine();
        System.out.print("[+] Insert password: ");
        String pass = new Scanner(System.in).nextLine();

        if(name.equals("KoKo")) {
            System.out.println("Login success");
        }else {
            System.out.println("Login Failed");
        }
    }
}
