package com.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static UserService userServiceInstance = null;
    private UserService(){};

    List<UserLoginEventHandler> userLoginEventHandlers = new ArrayList<UserLoginEventHandler>();
    List<UserSignUpEventHandler> userSignUpEventHandlers = new ArrayList<UserSignUpEventHandler>();

    public void subscribeUserLoginEventHandler(UserLoginEventHandler loginEventHandler){
        this.userLoginEventHandlers.add(loginEventHandler);
    }

    public void unsubscribeUserLoginEventHandler(UserLoginEventHandler loginEventHandler){
        this.userLoginEventHandlers.remove(loginEventHandler);
    }

    public void subscribeSignUpEventHandler(UserSignUpEventHandler signUpEventHandler){
        this.userSignUpEventHandlers.add(signUpEventHandler);
    }

    public void unsubscribeSignUpEventHandler(UserSignUpEventHandler signUpEventHandler){
        this.userSignUpEventHandlers.remove(signUpEventHandler);
    }



    public void handleUserLoginEvent(User user){
        for (UserLoginEventHandler userloginEventHandler:
             userLoginEventHandlers) {
            userloginEventHandler.handleUserLogin(user);
        }
    }

    public void handleUserSignUpEvent(User user){
        for (UserSignUpEventHandler userSignUpEventHandler:
             userSignUpEventHandlers) {
            userSignUpEventHandler.handleUserSignUp(user);
        }
    }

    public static UserService getInstance(){
        if(userServiceInstance == null){
            synchronized (UserService.class){
                if(userServiceInstance == null)
                    userServiceInstance = new UserService();
            }
        }
        return userServiceInstance;
    }




}
