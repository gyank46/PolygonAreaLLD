package com.example.Factory;

public class MongoDbDatabaseFactoryMethods implements DatabaseFactoryMethods{
    @Override
    public Connection getConnection() {
        System.out.println("using Mongodb Connection.");
        return new MongoDBConnection();
    }

    @Override
    public Transaction getTransaction() {
        System.out.println("using Mongodb Transaction.");
        return null;
    }
}
