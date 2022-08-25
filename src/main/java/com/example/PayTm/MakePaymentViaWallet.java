package com.example.PayTm;

public class MakePaymentViaWallet implements MakePayment{
    private final Wallet wallet;

    public MakePaymentViaWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void makePayment(Transaction transaction) {
        if(transaction.status != TransactionStatus.SUCCESSFUL && wallet.amount> transaction.amount){
            wallet.amount-= transaction.amount;
            System.out.println("Paying "+transaction.amount+" via wallet");
            transaction.status = TransactionStatus.SUCCESSFUL;
        }
        System.out.println("Remaining wallet balance: "+ wallet.amount);

    }
}
