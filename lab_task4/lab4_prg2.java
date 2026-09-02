public class lab4_prg2 {
    static class BankAccount {
        private int accountNumber;
        private String accountHolderName;
        private double balance;

        public BankAccount(int accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public void Deposit(double amount) {
            balance += amount;
            System.out.println("Deposit: " + amount);
            System.out.println("Current Balance: " + balance);
        }

        public void Withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Withdraw: " + amount);
                System.out.println("Insufficient Balance");
            } else {
                balance -= amount;
                System.out.println("Withdraw: " + amount);
                System.out.println("Current Balance: " + balance + ", (" + (balance + amount) + "-" + amount + ")");
            }
        }

        public void ShowBalance() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder Name: " + accountHolderName);
            System.out.println("Current Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Asha", 15000);
        BankAccount acc2 = new BankAccount(1002, "Rafi", 22000);
        BankAccount acc3 = new BankAccount(1003, "Bapan", 18000);
        BankAccount acc4 = new BankAccount(1004, "Mita", 25000);

        System.out.println("Account 1");
        acc1.ShowBalance();
        acc1.Deposit(5000);
        acc1.Withdraw(12000);
        acc1.Withdraw(30000);
        System.out.println();

        System.out.println("Account 2");
        acc2.ShowBalance();
        acc2.Deposit(8000);
        acc2.Withdraw(5000);
        System.out.println();

        System.out.println("Account 3");
        acc3.ShowBalance();
        acc3.Deposit(7000);
        acc3.Withdraw(10000);
        acc3.Withdraw(30000);
        System.out.println();

        System.out.println("Account 4");
        acc4.ShowBalance();
        acc4.Deposit(6000);
        acc4.Withdraw(20000);
        acc4.Withdraw(5000);
    }
}
