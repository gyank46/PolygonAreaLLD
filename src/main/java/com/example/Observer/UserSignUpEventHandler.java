package com.example.Observer;

public interface UserSignUpEventHandler {

    public void handleUserSignUp(User user);

    public void subscribeToUserSignUpEventHandlers();
    public void unsubscribeToUserSignUpEventHandlers();


}
