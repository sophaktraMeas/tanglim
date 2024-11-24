package ControlFollow;

import java.util.Scanner;

public class DayTwo4 {
    public static void main(String[] args) {
        System.out.println("""
                1. Start
                2. Stop
                3. Exit""");
        System.out.println("-".repeat(20));
        System.out.print("[+] Insert option:");
        int opt = new Scanner(System.in).nextInt();
        if(opt<0) {
            System.out.println("[!] Invalid option ");
            /***
             * <p>Funny</p>
             * <a href="https://google.com">Hello</a>
             * <img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DGxjsWlUTz7U&psig=AOvVaw18TOPPbdrQeGKuT3OrCIor&ust=1728895955360000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCJiY-7z9iokDFQAAAAAdAAAAABAE
             * */
             }else{
            switch (opt){
                case 1-> System.out.println("This is option");
                case 2-> System.out.println("This is option 2");
                case 3-> System.out.println("This is option 3");
                default -> System.out.println("No option :(");

            }
        }
    }
}
