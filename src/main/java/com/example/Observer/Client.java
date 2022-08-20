package com.example.Observer;

public class Client {

    public static void  main(String[] args){

        User user = new User();
        user.setName("Gyan");
        user.setEmail("Sittuk46@gmail.com");
        user.setContactNumber("7002614683");

        UserService userService = UserService.getInstance();
        UserSignUpEventHandler emailConfirmationHandler = new EmailConfirmationHandler();
        UserSignUpEventHandler mobileOTPHandler = new MobileOTPHandler();

        userService.subscribeSignUpEventHandler(emailConfirmationHandler);
        userService.subscribeSignUpEventHandler(mobileOTPHandler);

        UserLoginEventHandler emailOTPHandler = new EmailOTPHandler();
        UserLoginEventHandler loginMobileOTPHandler = new MobileOTPHandler();

        userService.subscribeUserLoginEventHandler(emailOTPHandler);
        userService.subscribeUserLoginEventHandler(loginMobileOTPHandler);

        userService.handleUserSignUpEvent(user);
        userService.handleUserLoginEvent(user);




    }

}
