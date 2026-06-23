package OOPS.practice.constructor.BankAccount;
// encapsulation

public class BankCustomer {
    int Bank_accountNumber;
    String Bank_Holder;
    double Bank_Balance;
    static int Bank_TotalAccountNumber;

    public BankCustomer(int Bank_accountNumber, String Bank_Holder, double Bank_Balance) {
        this.Bank_accountNumber = Bank_accountNumber;
        this.Bank_Holder = Bank_Holder;
        this.Bank_Balance = Bank_Balance;
        Bank_TotalAccountNumber++;
    }
}

