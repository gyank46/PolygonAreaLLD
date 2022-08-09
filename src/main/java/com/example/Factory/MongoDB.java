package com.example.Factory;

public class MongoDB implements Database{
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
        return new MongoDbDatabaseFactoryMethods();
    }


//    public Connection getConnection() {
//        System.out.println("using mongodb connection");
//        return null;
//    }
//
//
//    public Transaction getTransaction() {
//        System.out.println("using mongodb transaction");
//        return null;
    }

