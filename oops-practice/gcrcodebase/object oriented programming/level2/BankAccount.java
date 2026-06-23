class BankAccount {
    static String bankName = "SBI";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display() {
        System.out.println("Bank: " + bankName);
        System.out.println("Holder: " + accountHolderName);
        System.out.println("Account No: " + accountNumber);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Anil", 1001);

        if (acc instanceof BankAccount) {
            acc.display();
        }

        BankAccount.getTotalAccounts();
    }
}