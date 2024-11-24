package Method;

import java.util.Arrays;
import java.util.Scanner;

import static Method.MethodLesson2.option;

public class Homework {
    static String[] names = {" Niana", "Nana", "Panha"};
    static String isNameExisted(String name){
        for(int i=0;i<names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                System.out.print("[+] Insert new name for update: ");
                String newName = new Scanner(System.in).nextLine();
                names[i] = newName;
                return newName;
            }
        }
        return null;
    }

    static void updateName(){
        System.out.print("[+] Search for name in order to update: ");
        String name = new Scanner(System.in).nextLine();
        String newName = isNameExisted(name);
        if(newName==null){
            System.out.println("[!] No user to update by name");
        }
    }
    public static void main(String[] args) {
        Arrays.stream(names).forEach(e -> {
            System.out.println(e);
        });
        updateName();
        Arrays.stream(names).forEach(System.out::println);
    }

}