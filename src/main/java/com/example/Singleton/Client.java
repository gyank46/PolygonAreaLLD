package com.example.Singleton;


public class Client {

    public static void main(String[] args) {
        LoggerSingleton logger = LoggerSingleton.getInstance();

        LoggerSingleton logger1 = LoggerSingleton.getInstance();

        System.out.println(logger);
        System.out.println(logger1);


    }

}
