package com.example.polygonarea;

public class LoggerSingleton {

    private LoggerSingleton(){};

    private static LoggerSingleton instance = null;

    public static LoggerSingleton getInstance(){
        if(instance==null) {
            synchronized (LoggerSingleton.class) {
                if (instance == null)
                    instance = new LoggerSingleton();
            }
        }
        return instance;
    }

}
