package com.example.Observer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
        sendSms();
    }

    @Override
    public void handleUserSignUp(User user) {
        System.out.println("Sending Signup otp on Mobile "+ user.getContactNumber());
        sendSms();
    }

    public String sendSms() {
        try {
            // Construct data
            String apiKey = "apikey=" + "NDczODRmNjY0ZjRkNDM3YTYxNDY0YjcwNTIzMDc1NGM=";
            String message = "&message=" + "Hello From Gyan";
            String sender = "&sender=" + "GYANI";
            String numbers = "&numbers=" + "917002614683";

            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data = apiKey + numbers + message + sender;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            final StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line);
            }
            rd.close();

            return stringBuffer.toString();
        } catch (Exception e) {
            System.out.println("Error SMS "+e);
            return "Error "+e;
        }
    }
}
