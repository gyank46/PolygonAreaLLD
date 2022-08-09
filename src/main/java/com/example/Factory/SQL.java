package com.example.Factory;

public class SQL implements Database{
    @Override
    public void setURL(String URL) {

    }

    @Override
    public void setTimeout(int time) {

    }

    @Override
    public void setUserName(String userName) {

    }

    @Override
    public DatabaseFactoryMethods getDatabaseFactoryMethods() {
        return new SQLDatabaseFactoryMethods();
    }

//    @Override
//    public Connection getConnection() {
//        System.out.println("using sql connection");
//        return null;
//    }
//
//    @Override
//    public Transaction getTransaction() {
//        System.out.println("using sql transaction");
//        return null;
//    }
}
