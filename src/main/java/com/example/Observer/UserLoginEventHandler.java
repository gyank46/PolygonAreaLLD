package com.example.Observer;

public interface UserLoginEventHandler {

    public void handleUserLogin(User user);

    public void subscribeToUserLoginEventHandlers();

    public void unsubscribeToUserLoginEventHandlers();
}
