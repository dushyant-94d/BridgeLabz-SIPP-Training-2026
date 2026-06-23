package OOPS.practice.constructor.BankAccount;

public class BankUtility {
    BankCustomer bankCustomer;

    public void deposit(double amount) {
        bankCustomer=new BankCustomer(12345, "John Doe", 1000.0);
        BankCustomer.Bank_TotalAccountNumber++;
        if(amount>0){
            System.out.println("invalid amount");

        }
        else{
            bankCustomer.Bank_Balance+=amount;
        }
    }
}
