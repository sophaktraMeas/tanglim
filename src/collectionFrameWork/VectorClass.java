package collectionFrameWork;

import java.util.Scanner;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<String> accounts = new Vector<>();
        System.out.print("[+] Insert number of account: ");
        int n = new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.print("[+] Insert account name at index [" + i +"]: ");
            accounts.add(new Scanner(System.in).nextLine());
        }
        //remove ignoreCase
        System.out.println("All accounts here: " + accounts);
        System.out.print("[+] Insert account name to remove: ");
        String name = new Scanner(System.in).nextLine();
           for(String nn: accounts){
            if(nn.equalsIgnoreCase(name)){
                accounts.remove(nn);
            }
        }
        System.out.println("Account after deleted: " + accounts);
    }
}
