package com.example.PayTm;

public class MakePaymentViaBankAccount implements MakePayment{
    private final BankAccount bankAccount;

    @Override
    public void makePayment( Transaction transaction) {
        if(transaction.status!=TransactionStatus.SUCCESSFUL){
            System.out.println("Paying "+ transaction.amount + " via Bank account "+ this.bankAccount.bankAccount);
            transaction.status = TransactionStatus.SUCCESSFUL;
        }

    }

    public MakePaymentViaBankAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
}
