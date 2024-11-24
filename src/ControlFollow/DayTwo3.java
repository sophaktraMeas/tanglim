package ControlFollow;

import java.util.Scanner;

public class DayTwo3 {
    public static void main(String[] args) {
        System.out.println("============ News System ===================");
        System.out.print("[+] Insert number:");
        int number = new Scanner(System.in).nextInt();
        if(number%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd number");
        }
    }
}
