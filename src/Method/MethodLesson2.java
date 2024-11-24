package Method;

import java.util.Scanner;

public class MethodLesson2 {
    static String[] searchMethod(String [] names, String name){
        String [] results = new String[names.length];
        for (int i=0; i<names.length;i++) {
            if(names[i].toLowerCase().contains(name.toLowerCase()) ||
                names[i].equalsIgnoreCase(name)){
            results[i] = names[i];
            }
        }
        return results;
    }
    static void ui(){
        System.out.println("=".repeat(20));
        System.out.println("Welcome to facebook search");
        System.out.println("=".repeat(20));
    }
    static void option(){
        ui();
        System.out.print("[+] Insert name to search: ");
        String name = new Scanner(System.in).nextLine();
        String [] names = {"Kimhout",
                "Tongei", "Somnang","Meas Serei Sophaktra",
                "Neang Tanglim","Te Senglong","TIEM SOROTT","Sam Ousa"};

        String results[] = searchMethod(names, name);
        System.out.println("[+] All people you may search for: ");
        for(String n: results){
            System.out.print(n + " | ");
        }

    }
    public static void main(String[] args) {
        option();
    }
}
