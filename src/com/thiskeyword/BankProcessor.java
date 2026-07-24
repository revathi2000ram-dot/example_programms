package com.thiskeyword;

public class BankProcessor {

    public static void main(String[] args) {

        // Create Bank Account Object
        BankAccount account = new BankAccount(1001, "REVATHI", 50000);

        // Print Current Details
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Account Holder : " + account.getAccountHolder());
        System.out.println("Current Balance : $" + account.getBalance());

        // Deposit Money
        account.deposit(10000);

        // Withdraw Money
        account.withdraw(15000);

        // Print Updated Balance
        System.out.println("Updated Balance : $" + account.getBalance());

    }
}
