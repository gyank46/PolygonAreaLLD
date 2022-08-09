package com.example.Factory;

public class SQLDatabaseFactoryMethods implements DatabaseFactoryMethods{
    @Override
    public Connection getConnection() {
        System.out.println("using sql connection.");
        return new SQLConnection();
    }

    @Override
    public Transaction getTransaction() {
        System.out.println("using sql transaction.");
        return null;
    }
}
