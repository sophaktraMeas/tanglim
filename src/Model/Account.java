package Model;

public interface Account {
    void withDraw ( Double amountOfCash);
    void deposit ( Double amountOfCash);
    void showBalance();
}
