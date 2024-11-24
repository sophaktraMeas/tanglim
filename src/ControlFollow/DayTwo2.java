package ControlFollow;

import java.util.Scanner;

public class DayTwo2 {
    public static void main(String[] args) {
        System.out.println("======== New System ========");
        System.out.print("[+] Insert your gender: ");
        Character gender = new Scanner(System.in).nextLine().charAt(0);

        if (gender.toString().equalsIgnoreCase("M")) {
            System.out.println("You're male");
            System.out.print("[+] Insert your ID Card:");
            String idCard = new Scanner(System.in).nextLine();
            if (idCard.startsWith("001")) {
                System.out.println("Male Login Success");
            }
        } else if (gender.toString().equalsIgnoreCase("F")) {
            System.out.println("You're female ID card:");
            String idCard = new Scanner(System.in).nextLine();
            if (idCard.startsWith("002")) {
                System.out.println("Female login succes");
            }
        }else {
            System.out.println("You're not human");
            }
        }
    }
