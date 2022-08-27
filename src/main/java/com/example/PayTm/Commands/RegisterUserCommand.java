package com.example.PayTm.Commands;

import com.example.PayTm.Commands.Commands;
import com.example.PayTm.Commands.Icommand;
import com.example.PayTm.Models.User;
import com.example.PayTm.Models.Wallet;
import com.example.PayTm.Repo;
import com.example.PayTm.Session;

import java.util.Scanner;

public class RegisterUserCommand implements Icommand {
    @Override
    public boolean canExecute(String command) {
        return command.equals(Commands.REGISTERUSER.name());
    }

    @Override
    public void execute(Session session) {
        System.out.println("Please enter name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Please enter phone: ");
        String phone = new Scanner(System.in).nextLine();
        System.out.println("Please enter emailID: ");
        String emailID = new Scanner(System.in).nextLine();
        
        User user = new User(name,emailID,phone);
        Repo.userId_User_Mapping.put(phone,user);

        Wallet wallet = new Wallet(user.getContactNumber(),0);

        System.out.println("User Registered you can login now.");
    }
}
