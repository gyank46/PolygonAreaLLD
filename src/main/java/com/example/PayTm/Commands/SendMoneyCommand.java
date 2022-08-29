package com.example.PayTm.Commands;

import com.example.PayTm.Commands.Commands;
import com.example.PayTm.Commands.Icommand;
import com.example.PayTm.Models.BankAccount;
import com.example.PayTm.Models.Transaction;
import com.example.PayTm.Models.User;
import com.example.PayTm.Models.Wallet;
import com.example.PayTm.Payment.MakePayment;
import com.example.PayTm.Payment.MakePaymentViaWallet;
import com.example.PayTm.ReceiverType;
import com.example.PayTm.Repo;
import com.example.PayTm.SendMoney.SendMoney;
import com.example.PayTm.SendMoney.SendMoneyFactory;
import com.example.PayTm.SendMoney.SendMoneyToBankAccount;
import com.example.PayTm.SendMoney.SendMoneyToWallet;
import com.example.PayTm.Session;

import java.util.Scanner;

public class SendMoneyCommand implements Icommand {
    SendMoney sendMoney;
    @Override
    public boolean canExecute(String command) {
        return command.equals(Commands.SENDMONEY.name());
    }

    @Override
    public void execute(Session session) {
        if(!session.isLoggedIn){
            System.out.println("Please login to continue");
            return ;
        }
        System.out.println("Please select method of sending money WALLET or BANK: ");
        String methodOfSendingMoney = new Scanner(System.in).nextLine();
        if(methodOfSendingMoney.equals(ReceiverType.WALLET.name())){
            System.out.println("Please enter recipient phone number: ");
            String recipientId = new Scanner(System.in).nextLine();
            if(!Repo.userID_WalletID_Mapping.containsKey(recipientId)){
                System.out.println("Recipient doesn't have account, please ask recipient to register.");
                return ;
            }
            Wallet recipientWallet = Repo.userID_WalletID_Mapping.get(recipientId);
//            sendMoney = new SendMoneyToWallet(recipientWallet);
            sendMoney = SendMoneyFactory.getInstance(ReceiverType.WALLET.name(),recipientWallet);
            Transaction transaction = sendMoney.sendMoney(Repo.userId_User_Mapping.get(session.loggedUserId),20);

            MakePayment makePayment = new MakePaymentViaWallet(Repo.userID_WalletID_Mapping.get(session.loggedUserId));
            makePayment.makePayment(transaction);
            return;
        }

        if(methodOfSendingMoney.equals(ReceiverType.BANKACCOUNT.name())){
            System.out.println("Please enter recipient bank account number: ");
            String bankAccountNumber = new Scanner(System.in).nextLine();
            System.out.println("Please enter recipient bank IFSC Code: ");
            String bankIFSC = new Scanner(System.in).nextLine();
            System.out.println("Please enter recipient bank account branch name: ");
            String bankName = new Scanner(System.in).nextLine();

            BankAccount bankAccount = new BankAccount(bankName,bankIFSC,bankAccountNumber,1000);

//            sendMoney = new SendMoneyToBankAccount(bankAccount);
            sendMoney = SendMoneyFactory.getInstance(ReceiverType.BANKACCOUNT.name(),bankAccount);
            Transaction transaction = sendMoney.sendMoney(Repo.userId_User_Mapping.get(session.loggedUserId),200);

            MakePayment makePayment = new MakePaymentViaWallet(Repo.userID_WalletID_Mapping.get(session.loggedUserId));
            makePayment.makePayment(transaction);

            return;

        }


    }
}
