public class BankAccount { //defines the Bankaccount
    private BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance; // 
        }
        
        public void deposit(double amount) { //should calculate the deposit which is either add or the same if 0
            balance += amount;
        }

        public void withdraw(double amount) { //if the balance is less than whats in the itll print insufficient or itll allow it
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

        // Creating an instance of BankAccount with initial balance of 500
        BankAccount account = new BankAccount("9090509050", 500);

        //Display Welcome message
        System.out.println("Welcome to ABC bank: ");
        System.out.println("=========================");
        
        // Depositing 200 into the account
        account.deposit(200);
        
        // Withdrawing 900 from the account
        account.withdraw(900);
        
        // Printing the final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}