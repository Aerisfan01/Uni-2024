public class BankAccount {
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {

        BankAccount account = new BankAccount("9090509050", 500);

        System.out.println("Welcome to ABC bank: ");
        System.out.println("=========================");
        
        account.deposit(200);
        
        account.withdraw(900);
        
        System.out.println("Final Balance: " + account.getBalance());
    

    }
}
