package com.example.Factory;

public interface Database {

    void setURL(String URL);

    void setTimeout(int time);

    void setUserName(String userName);

    DatabaseFactoryMethods getDatabaseFactoryMethods();


}
