package com.example.Observer;

public class EmailOTPHandler implements UserLoginEventHandler{
    UserService userService = UserService.getInstance();

    public void subscribeToUserLoginEventHandlers(){
        userService.subscribeUserLoginEventHandler(this);
    }

    public void unsubscribeToUserLoginEventHandlers(){
        userService.unsubscribeUserLoginEventHandler(this);
    }
    @Override
    public void handleUserLogin(User user) {
        System.out.println("Sending OTP on Email "+ user.getEmail());
    }
}
