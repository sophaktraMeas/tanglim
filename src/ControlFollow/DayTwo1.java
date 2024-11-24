package ControlFollow;

import java.util.Scanner;

public class DayTwo1 {
    public static void main(String[] args){
        System.out.println("======== New System ========");
        System.out.print("[+] Insert your age:");
        int age = new Scanner(System.in).nextInt();
        System.out.print("[+] Insert your gender:");
        Character gender = new Scanner(System.in).nextLine().charAt(0);

        if((age>18 || gender.toString().equalsIgnoreCase("M"))
            || gender.toString().equalsIgnoreCase("F")) {
            System.out.println("You are right");
        }else{
            System.out.println("You are wrong");
        }
    }
}
