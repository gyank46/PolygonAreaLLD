package com.example.PayTm;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    List<SignUpEventHandler> signUpEventHandlers = new ArrayList<SignUpEventHandler>();
    List<LoginEventHandler> loginEventHandlers = new ArrayList<LoginEventHandler>();
    List<DeleteAccountEventHandler> deleteAccountEventHandlers = new ArrayList<DeleteAccountEventHandler>();
    List<UpdateProfileEventHandler> updateProfileEventHandlers = new ArrayList<UpdateProfileEventHandler>();



    public void handleSignUpEvent(){
        // Validate User Details
        // Send OTP to Mobile Number for Confirmation
        // validate OTP
        // Send Confirmation Email
        // Add User Data
        // KYC Registration

    }

    public void handleLoginEvent(){
        // Send OTP to Mobile Number for Confirmation
        // validate OTP
        // Send login Email alert
        // load dashboard

    }


    public void handleDeleteAccountEvent(){
        // Send OTP to Mobile Number for Confirmation
        // validate OTP
        // Delete User Data

    }

    public void updateProfileDetail(){
        // Validate Detail
        // Send OTP to Mobile Number for Confirmation
        // validate OTP
        // Update User Data


    }



}
