package collectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {
        ArrayList<String> userNames = new ArrayList<>();
        userNames.add("Nana");
        userNames.add("Tata");
        userNames.add("TiTi");
        for (String n : userNames) {
            System.out.println(n);
        }

        System.out.print("[+] Search user name: ");
        String name = new Scanner(System.in).nextLine();
        for (String n : userNames) {
            if (name.equalsIgnoreCase(n)) {
                System.out.println(n);
            }

        }
        int i = 0;
        for (String n: userNames) {
            System.out.println(i +" . " + n);
            i++;
        }
        System.out.print(">>Press enter to continue");
        new Scanner(System.in).nextLine();

        System.out.print("[+] Insert username index: ");
        int index = new Scanner(System.in).nextInt();
        for(String n: userNames){
            if(index>userNames.size()){
                System.out.println("[+] Index must be less than list size");
            }else{
                System.out.println("[+] Insert new name: ");
                String newName = new Scanner(System.in).nextLine();
                userNames.set(index,newName);
                userNames.remove(2);
                System.out.print("[+] Remove Success");
            }
            break;
        }
        userNames.forEach(e-> System.out.println(e));

    }
}
