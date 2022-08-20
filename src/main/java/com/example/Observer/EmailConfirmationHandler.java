package com.example.Observer;

public class EmailConfirmationHandler implements UserSignUpEventHandler{

    UserService userService = UserService.getInstance();
    
    public void subscribeToUserSignUpEventHandlers(){
        userService.subscribeSignUpEventHandler(this);
    }

    public void unsubscribeToUserSignUpEventHandlers(){
        userService.unsubscribeSignUpEventHandler(this);
    }
    @Override
    public void handleUserSignUp(User user) {
        System.out.println("Sending Confirmation Email "+user.getEmail());
    }
}
