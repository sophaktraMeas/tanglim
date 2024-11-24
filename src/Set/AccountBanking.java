package Set;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AccountBanking {
    static private List<String> accountNames = new ArrayList<>();
    static String creditCardNumberGenerator() {
        int bound = 9999;
        int condition = 1000;
        int digit1 = new Random().nextInt(bound);
        int digit2 = new Random().nextInt(bound);
        int digit3 = new Random().nextInt(bound);
        int digit4 = new Random().nextInt(bound);
        while (digit1 < condition || digit2 < condition || digit3 < condition || digit4 < condition) {
            digit1 = new Random().nextInt(bound);
            digit2 = new Random().nextInt(bound);
            digit3 = new Random().nextInt(bound);
            digit4 = new Random().nextInt(bound);
        }
        return digit1 + "-" + digit2 + "-" + digit3 + "-" + digit4;
    }
    static void createBankingAccount(String accountName){
        accountNames.add(accountName);
        System.out.println("=".repeat(40));
        System.out.println("=> Your Account: ");
        System.out.println("=>" + accountName + " <= ");
        System.out.println("[+] Virtual credit card number: " + creditCardNumberGenerator());
    }
    static void updateAccountName(String oldName){
        int index = accountNames.indexOf(oldName);
        if(index>=0){
            System.out.print("[+] Insert new account name: ");
            String newName = new Scanner(System.in).nextLine();
            accountNames.set(index, newName);
            System.out.println("[+] Account name updated successfully");
            System.out.println(accountNames);
        }else{
            System.out.println("[!] No account to update :(");
        }
    }
    public static void main(String[] args) {
        System.out.print("[+] Insert your account name: ");
        String name = new Scanner(System.in).nextLine();
        createBankingAccount(name);


    }
}
