package com.example.Observer;

public class MobileOTPHandler implements UserLoginEventHandler,UserSignUpEventHandler{

    UserService userService = UserService.getInstance();
    public void subscribeToUserLoginEventHandlers(){
        userService.subscribeUserLoginEventHandler(this);
    }

    public void unsubscribeToUserLoginEventHandlers(){
        userService.unsubscribeUserLoginEventHandler(this);
    }

    public void subscribeToUserSignUpEventHandlers(){
        userService.subscribeSignUpEventHandler(this);
    }

    public void unsubscribeToUserSignUpEventHandlers(){
        userService.unsubscribeSignUpEventHandler(this);
    }
    @Override
    public void handleUserLogin(User user) {
        System.out.println("Sending Login otp on Mobile "+ user.getContactNumber());
    }

    @Override
    public void handleUserSignUp(User user) {
        System.out.println("Sending Signup otp on Mobile "+ user.getContactNumber());
    }
}
