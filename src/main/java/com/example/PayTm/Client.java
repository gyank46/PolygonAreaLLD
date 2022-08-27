package com.example.PayTm;

import com.example.PayTm.*;
import com.example.PayTm.Commands.*;
import com.example.PayTm.Models.BankAccount;
import com.example.PayTm.Models.Transaction;
import com.example.PayTm.Models.User;
import com.example.PayTm.Models.Wallet;
import com.example.PayTm.Payment.MakePayment;
import com.example.PayTm.Payment.MakePaymentViaBankAccount;
import com.example.PayTm.Payment.MakePaymentViaWallet;
import com.example.PayTm.SendMoney.SendMoney;
import com.example.PayTm.SendMoney.SendMoneyToBankAccount;
import com.example.PayTm.SendMoney.SendMoneyToWallet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Session session = new Session();
        session.isLoggedIn = false;
        Scanner myObj = new Scanner(System.in);
        populateValidCommand();
//        initApp();
        while(!session.isLoggedIn){
            System.out.println("Please enter LOGIN or REGISTERUSER to continue:");
            String command = myObj.nextLine();
            execute(command,session);
        }

        while(true){
            System.out.println("Please enter SENDMONEY or MAKEPAYMENT or SIGNOUT or QUIT to continue");
            String command = myObj.nextLine();
            if(command.equals("QUIT") || command.equals("SIGNOUT"))
                return ;

            execute(command,session);

        }




    }

    public static void initApp(){

        Repo.userID_WalletID_Mapping.put("7991122544",new Wallet("7991122544",100));
        Repo.userID_WalletID_Mapping.put("7002614683",new Wallet("7002614683",1000));

        Repo.userID_BankAccount_Mapping.put("7991122544", new BankAccount("HDFC","abcd","0000",100));
        Repo.userID_BankAccount_Mapping.put("7002614683", new BankAccount("ICICI","xyz","0001",1000));

    }

    public static void populateValidCommand(){
        Repo.validCommands.add(LoginUserCommand.getInstance());
        Repo.validCommands.add(new RegisterUserCommand());
        Repo.validCommands.add(new MakePaymentCommand());
        Repo.validCommands.add(new RechargePhoneCommand());
        Repo.validCommands.add(new SendMoneyCommand());
        Repo.validCommands.add(new RechargePhoneCommand());
    }

    public static void execute(String input,Session session){

        for (Icommand command:Repo.validCommands) {
            if(command.canExecute(input))
                command.execute(session);
        }

    }
}
