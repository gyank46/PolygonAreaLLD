package com.example.PayTm.Commands;

import com.example.PayTm.Commands.Commands;
import com.example.PayTm.Commands.Icommand;
import com.example.PayTm.Repo;
import com.example.PayTm.Session;
import org.apache.juli.logging.Log;

import java.util.Scanner;

public class LoginUserCommand implements Icommand {
    private static LoginUserCommand instance = null;

    private LoginUserCommand(){

    }

    public static LoginUserCommand getInstance(){
        if(instance == null){
            synchronized (LoginUserCommand.class){
                if(instance == null){
                    instance = new LoginUserCommand();
                }
            }
        }
        return instance;
    }


    @Override
    public boolean canExecute(String command) {
        return command.equals(Commands.LOGIN.name());
    }

    @Override
    public void execute(Session session) {

        System.out.println("Enter Phone number to continue: ");
        String phoneNumber = new Scanner(System.in).nextLine();
        if(!Repo.userId_User_Mapping.containsKey(phoneNumber)){
            System.out.println("User doesn't exist please register");
        }else{
            session.isLoggedIn = true;
        }


    }
}
