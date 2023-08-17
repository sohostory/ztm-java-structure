package packagesandclasses.ex1bank.main;

import packagesandclasses.ex1bank.bank.BankAccount;


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 1001;
        account.accountHolder = "Jim";
        account.balance = 1000.00;

        System.out.println("Account number: " + account.accountNumber);
        System.out.println("Account holder: " + account.accountHolder);
        System.out.println("Account balance: " + account.balance);
    }
}
