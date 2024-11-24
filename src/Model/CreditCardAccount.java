package Model;

public class CreditCardAccount implements Account {
    private Double balance = 0.0;

    @Override
    public void withDraw(Double amountOfCash) {
        if( amountOfCash<0){
            System.out.println("[+] Amount of cash is greater than 0");
            return;
        } else if ( amountOfCash>0) {
            System.out.println("[!] Your balance is not enough");
        }
        balance = balance-amountOfCash;
        System.out.println("[+] You have withdraw" + amountOfCash + "$ from your saving account");
    }
    @Override
    public void deposit(Double amountOfCash) {
        if( amountOfCash<0) {
            System.out.println("[+] Amount of cash is greater than 0");
            return;
        }else{
            balance = balance + amountOfCash;
            System.out.println("[+] You have deposited" + amountOfCash + "$ from your saving account");
        }
    }
    @Override
    public void showBalance() {
        System.out.println("[+] Your saving account balance: " + balance + "$");
    }
}